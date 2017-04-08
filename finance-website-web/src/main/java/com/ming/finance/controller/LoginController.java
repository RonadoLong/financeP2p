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

        JSONResult result = loginService.register(username, password);
        return result;
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
    public Boolean checkUserName(@RequestParam("username") String username){

        JSONResult result = loginService.checkUsername(username);

        if (result.getStatus() == 200){
            return true;
        }else {
            return false;
        }
    }

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    @ResponseBody
    public JSONResult login(@RequestParam("username") String username,
                            @RequestParam("password") String password){
        JSONResult result = loginService.login(username, password);
        return result;
    }
}
