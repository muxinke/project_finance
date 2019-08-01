package com.finance.www.service;

import com.finance.www.config.OAuth2FeignRequestInterceptor;
import com.finance.www.pojo.MemberRegister;
import com.finance.www.service.impl.MemberShiMingImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2019/8/1.
 */
@FeignClient(value = "provider-server-10003",configuration = OAuth2FeignRequestInterceptor.class,fallback = MemberShiMingImpl.class)
public interface MemberShiMingService {
    @GetMapping("query")
    public MemberRegister getMember(@RequestParam("id")int id);
}
