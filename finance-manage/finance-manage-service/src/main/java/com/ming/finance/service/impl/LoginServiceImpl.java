package com.ming.finance.service.impl;

import com.ming.finance.common.util.JSONResult;
import com.ming.finance.mapper.FinanceUserDao;
import com.ming.finance.pojo.FinanceUser;
import com.ming.finance.pojo.FinanceUserQuery;
import com.ming.finance.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

/**
 * Created by Macx on 2017/4/6.
 */

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private FinanceUserDao userDao;

    @Override
    public JSONResult register(String username, String password) {

        if (!"".equals(username) && !"".equals(password)) {
            return JSONResult.build(400, "用户名或者密码不能为空");
        }

        //判断用户名是否存在
        FinanceUserQuery query = new FinanceUserQuery();
        FinanceUserQuery.Criteria criteria = query.createCriteria();
        criteria.andSysUserLoginNameEqualTo(username);
        List<FinanceUser> users = userDao.selectByExample(query);

        //不存在存入数据库 否则爬出异常
        if (users != null || users.size() == 0) {
            FinanceUser user = new FinanceUser();
            user.setSysUserLoginName(username);
            user.setSysUserLoginPassword(password);
            user.setSysUserIsDelete("N");
            user.setSysUserStatus("0");
            user.setSysUserRegisterDatetime(new Date());
            user.setSysUserSex("0");
            userDao.insert(user);
            return JSONResult.build(200, "注册成功");

        } else {
            return JSONResult.build(400, "用户名存在");
        }

    }

    @Override
    public JSONResult checkUsername(String username) {

        //检查数据的合法性
        if (StringUtils.isEmpty(username)) {
            return JSONResult.build(400, "用户名不合法");
        }

        //判断用户名是否存在
        FinanceUserQuery query = new FinanceUserQuery();
        FinanceUserQuery.Criteria criteria = query.createCriteria();
        criteria.andSysUserLoginNameEqualTo(username);
        List<FinanceUser> users = userDao.selectByExample(query);

        if (users != null || users.size() == 0) {
            return JSONResult.build(400, "用户名存在");
        } else {
            return JSONResult.build(200, "用户名可用");
        }
    }

}