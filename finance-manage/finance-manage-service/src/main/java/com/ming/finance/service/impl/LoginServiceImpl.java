package com.ming.finance.service.impl;

import com.ming.finance.common.util.JSONResult;
import com.ming.finance.mapper.FinanceUserDao;
import com.ming.finance.pojo.FinanceUser;
import com.ming.finance.pojo.FinanceUserQuery;
import com.ming.finance.service.LoginService;
import org.apache.http.HttpRequest;
import org.springframework.util.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by Macx on 2017/4/6.
 */

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private FinanceUserDao userDao;

    @Override
    public JSONResult register(String username, String password) {


        JSONResult result = this.checkUsername(username);

        if (result.getStatus() != 200){
            return JSONResult.build(400, "用户名不能为空");

        }

        if (StringUtils.isBlank(password)) {
            return JSONResult.build(400, "密码不能为空");
        }


            //不存在存入数据库 否则爬出异常

            FinanceUser user = new FinanceUser();
            user.setSysUserLoginName(username);
            user.setSysUserLoginPassword(DigestUtils.md5DigestAsHex(password.getBytes()));
            user.setSysUserIsDelete("N");
            user.setSysUserStatus("0");
            user.setSysUserRegisterDatetime(new Date());
            user.setSysUserSex("0");
            int insert = userDao.insertSelective(user);

            if (insert <= 0){
                return JSONResult.build(500, "注册失败", user);
            }else {
                return JSONResult.build(200, "注册成功", user);
            }
    }

    @Override
    public JSONResult checkUsername(String username) {

        //检查数据的合法性
        if (StringUtils.isBlank(username)) {
            return JSONResult.build(400, "用户名不能为空");
        }

        //判断用户名是否存在
        FinanceUserQuery query = new FinanceUserQuery();
        FinanceUserQuery.Criteria criteria = query.createCriteria();
        criteria.andSysUserLoginNameEqualTo(username);
        List<FinanceUser> users = userDao.selectByExample(query);

        if (users != null && users.size() != 0) {
            return JSONResult.build(400, "用户名存在");
        } else {
            return JSONResult.build(200, "用户名可用");
        }
    }

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    @Override
    public JSONResult login(String username, String password) {

        //判断用户名是否存在
        FinanceUserQuery query = new FinanceUserQuery();
        FinanceUserQuery.Criteria criteria = query.createCriteria();
        criteria.andSysUserLoginNameEqualTo(username);

        List<FinanceUser> userList = userDao.selectByExample(query);

        if (userList == null || userList.size() == 0){
            return JSONResult.build(400,"用户名或密码不正确");
        }

        //判断密码是否一样
        FinanceUser user = userList.get(0);

        if (user.getSysUserLoginPassword() != DigestUtils.md5DigestAsHex(password.getBytes())){
            return JSONResult.build(400,"用户名或密码不正确");
        }

        //去掉密码
        user.setSysUserLoginPassword(null);

        //待完成单点登录 生成UUID token 当做key 保存在redis中 value 就是用户信息 并且设置redis过期时间

        return JSONResult.build(200,"登录成功",user);
    }
}