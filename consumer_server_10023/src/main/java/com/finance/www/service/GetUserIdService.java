package com.finance.www.service;

import com.finance.www.config.OAuth2FeignRequestInterceptor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

/**
 * Created by Administrator on 2019/8/1.
 */
@FeignClient(value = "oauth2-server",configuration = OAuth2FeignRequestInterceptor.class)
public interface GetUserIdService {
    /**
     * 获取当前登陆用户信息
     *
     * @param
     * @return Principal
     */
    @RequestMapping("/user")
    public Principal user();

}
