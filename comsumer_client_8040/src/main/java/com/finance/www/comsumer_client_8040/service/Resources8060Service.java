package com.finance.www.comsumer_client_8040.service;

import com.finance.www.comsumer_client_8040.config.OAuth2FeignRequestInterceptor;
import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.PostMapping;


@FeignClient(value = "oauth2-resource",configuration = OAuth2FeignRequestInterceptor.class)
public interface Resources8060Service {

    @PostMapping("/")
    String tesst();

}