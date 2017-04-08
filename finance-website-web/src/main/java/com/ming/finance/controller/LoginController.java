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
public class LoginController {

    @Autowired
    private LoginService loginService;

    /**
     * 注册用户
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(value = "/user/register", method = RequestMethod.POST)
    @ResponseBody
    public JSONResult register(@RequestParam("username") String username,
                               @RequestParam("password") String password){

        JSONResult jsonResult = loginService.register(username, password);
        return jsonResult;
    }

    /**
     * 注册页面
     * @return
     */
    @RequestMapping(value = "/user/showRegister", method = RequestMethod.GET)
    public String gotoRegister(){
     return "register";
    }

    /**
     * 检查用户名
     * @param username
     * @return
     */
    @RequestMapping(value = "/user/checkUsername", method = RequestMethod.POST)
    @ResponseBody
    public JSONResult checkUserName(@RequestParam("username") String username){
        if (loginService ==null ){
            JSONResult.build(500,"server error");
        }
        JSONResult result = loginService.checkUsername(username);
        System.out.println("LoginController.checkUserName" + result);
        return result;
    }
}
