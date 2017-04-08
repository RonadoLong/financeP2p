package com.ming.finance.service; /**
 * Created by Macx on 2017/4/6.
 */

import com.ming.finance.common.util.JSONResult;

/**
 * 登录相关
 */
public interface LoginService {
    /**
     * 注册
     * @param username
     * @param password
     */
    JSONResult register(String username, String password);

    /**
     * 检查用户名是否存在
     * @param username
     */
    JSONResult checkUsername(String username);

    JSONResult login(String username, String password);
}
