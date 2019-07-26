package com.finance.www.login_server_10031.service.serviceimpl;

import com.finance.www.login_server_10031.service.ZuulTokenService;
import com.finance.www.token.Token;

/**
 * @author ：邓一凡
 * @date ：Created in 2019/7/26 1:00
 * @description ：
 */
public class Fallback implements ZuulTokenService {
    @Override
    public Token getToken(String username, String password, String grantType, String clientId, String scope, String clientSecret) {

        return new Token();
    }
}
