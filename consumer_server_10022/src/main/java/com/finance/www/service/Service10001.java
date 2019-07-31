package com.finance.www.service;

import com.finance.www.pojo.MemberAccount;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by 杜碧天 on 2019/7/29.
 */
@FeignClient(value = "provider-server")
public interface Service10001 {
    @RequestMapping(value="/showzhanghujine",method = RequestMethod.GET)
    MemberAccount showZhangHuJine(@RequestParam(value = "userid",defaultValue = "") Integer userid);

}
