package com.finance.www.login_server_10031.service;

import com.finance.www.login_server_10031.service.serviceimpl.Fallback;
import com.finance.www.token.Token;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * @author ：邓一凡
 * @date ：Created in 2019/7/26 0:59
 * @description ：
 */
@FeignClient(value = "zuul-server",fallback = Fallback.class)
//@FeignClient(value = "zuul-server")
public interface ZuulTokenService {

    @PostMapping("/oauth/token")
    Token getToken(@RequestParam("username") String username,
                   @RequestParam("password") String password,
                   @RequestParam("grant_type") String grantType,
                   @RequestParam("client_id")String clientId,
                   @RequestParam("scope")String scope,
                   @RequestParam("client_secret")String clientSecret);

}
