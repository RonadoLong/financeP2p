package com.ming.finance.controller;

import com.ming.finance.common.util.JSONResult;
import com.ming.finance.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Macx on 2017/4/6.
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public JSONResult register(@PathVariable("username") String username,
                               @PathVariable("password") String password){

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

    @RequestMapping(value = "/showRegister", method = RequestMethod.GET)
    public String gotoRegister(){
        System.out.println("LoginController.gotoRegister");
     return "register";
    }
}
