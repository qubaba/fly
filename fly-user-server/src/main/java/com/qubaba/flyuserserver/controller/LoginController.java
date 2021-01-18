package com.qubaba.flyuserserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author QuPeng
 * @date 2021/1/18 11:15
 * @Desc 登录、退出
 */
@RestController
public class LoginController {

    @RequestMapping("login")
    public void login() {
        System.out.println("login");
    }
}
