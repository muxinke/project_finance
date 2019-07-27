package com.finance.www.login_server_10031.controller;

import com.finance.www.login_server_10031.service.ResoucesService;
import com.finance.www.login_server_10031.service.ZuulTokenService;
import com.finance.www.token.Token;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：邓一凡
 * @date ：Created in 2019/7/27 13:24
 * @description ：
 */
@RestController
public class TestController {
    @Autowired
    ResoucesService service;
    @Autowired
    ZuulTokenService zuulTokenService;

    @GetMapping("test")
    public String te() {

        return service.tesst();
    }

    private static final String GRANT_TYPE = "password";

    private static final String CLIENT_ID = "dyf";

    private static final String SCOPE = "read";

    private static final String CLIENT_SECRET = "secret";

    @Autowired

    ZuulTokenService tokenService;

    /**
     * 测试获取令牌
     *
     * @return token
     */
    @GetMapping("test2")
    public Token t2e() {
//                        username, password, GRANT_TYPE, CLIENT_ID, SCOPE, CLIENT_SECRET
        return tokenService.getToken("qq", "qq971103", GRANT_TYPE, CLIENT_ID, SCOPE, CLIENT_SECRET);

    }

}
