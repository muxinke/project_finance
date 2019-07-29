package com.finance.www.oauth_server_8050.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @author ：邓一凡
 * @date ：Created in 2019/7/28 5:34
 * @description ：
 */
@RestController
public class UserINfoController {
    @RequestMapping("/user")
    public Principal user(Principal user) {
        return user;
    }
}
