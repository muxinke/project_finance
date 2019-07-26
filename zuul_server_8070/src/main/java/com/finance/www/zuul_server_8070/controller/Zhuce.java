package com.finance.www.zuul_server_8070.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：邓一凡
 * @date ：Created in 2019/7/26 9:11
 * @description ：
 */
@RestController
public class Zhuce {

    @Autowired
    PasswordEncoder passwordEncoder;

    @GetMapping("oauth/password")
    public String zhuc(String password){

        return passwordEncoder.encode(password);
    }
}
