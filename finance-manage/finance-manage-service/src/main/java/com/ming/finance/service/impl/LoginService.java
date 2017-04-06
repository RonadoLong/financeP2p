package com.ming.finance.service.impl;

import com.ming.finance.mapper.FinanceUserDao;
import com.ming.finance.pojo.FinanceUser;
import com.ming.finance.pojo.FinanceUserQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by Macx on 2017/4/6.
 */

@Service
public class LoginService implements com.ming.finance.service.LoginService {

    @Autowired
    private FinanceUserDao userDao;

    @Override
    public void register(String username, String password) {

        //判断用户名是否存在
        FinanceUserQuery query = new FinanceUserQuery();
        FinanceUserQuery.Criteria criteria = query.createCriteria();
        criteria.andSysUserLoginNameEqualTo(username);

        int usercount = userDao.countByExample(query);

        //不存在存入数据库 否则爬出异常
        if (usercount <= 0){
            FinanceUser user = new FinanceUser();
            user.setSysUserLoginName(username);
            user.setSysUserLoginPassword(password);
            user.setSysUserIsDelete("N");
            user.setSysUserStatus("0");
            user.setSysUserRegisterDatetime(new Date());
            user.setSysUserSex("0");
            userDao.insert(user);
        }else {
            throw new RuntimeException("用户名已存在");
        }

    }
}
