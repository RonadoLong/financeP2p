package com.ming.finance.controller;

import com.ming.finance.common.util.JSONResult;
import com.ming.finance.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Macx on 2017/4/6.
 */
@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping(value = "register")
    @ResponseBody
    public JSONResult register(@RequestParam("username") String username,
                               @RequestParam("password") String password){
        JSONResult jsonResult = new JSONResult();

            if (!"".equals(username) && !"".equals(password)){

                    jsonResult.setMsg("用户名或者密码不能为空");
                    jsonResult.setSuccess(false);
                    return jsonResult;
            }else {
                try {
                    loginService.register(username,password);
                    jsonResult.setMsg("注册成功");
                    jsonResult.setSuccess(true);
                    return jsonResult;
                }catch (RuntimeException e){

                    jsonResult.setMsg("用户名已存在");
                    jsonResult.setSuccess(false);
                    return jsonResult;
                }
            }
    }
}
