package com.finance.www.login_server_10031.controller;

import com.finance.www.login_server_10031.oauth2.SendToken;
import com.finance.www.login_server_10031.service.ResoucesService;
import com.finance.www.login_server_10031.service.ZuulTokenService;
import com.finance.www.token.Token;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @GetMapping("test2")
    public Token t2e() {
        Map<String, String> parameters = new HashMap<>(6);
        parameters.put("username","qq");
        parameters.put("password","qq971103");
        parameters.put("grant_type",GRANT_TYPE);
        parameters.put("client_id",CLIENT_ID);
        parameters.put("scope",SCOPE);
        parameters.put("client_secret",CLIENT_SECRET);
//                        username, password, GRANT_TYPE, CLIENT_ID, SCOPE, CLIENT_SECRET
        Token token = tokenService.getToken("qq","qq971103",GRANT_TYPE,CLIENT_ID,SCOPE,CLIENT_SECRET);
        return token;
    }

}
