package com.finance.www.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

/**
 * Created by 杜碧天 on 2019/8/1.
 */
@FeignClient(value = "oauth2-server")
public interface LoginService {
    @RequestMapping("/user")
    public Principal user();
}
