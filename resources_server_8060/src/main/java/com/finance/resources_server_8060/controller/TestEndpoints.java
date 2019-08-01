package com.finance.resources_server_8060.controller;


import com.finance.www.utils.ResponseResult;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @author ：邓一凡
 * @date ：Created in 2019/7/25 15:47
 * @description ：
 */

@RestController

public class TestEndpoints {

    @RequestMapping("/user2")
    public Principal user(Principal user) {
        return user;
    }

    @PostMapping("/")
    public ResponseResult<String> selectAll() {
        return new ResponseResult<>(HttpStatus.OK.value(), HttpStatus.OK.toString(), "成功");
    }

}

