package com.finance.www.login_server_10031.service;



import feign.Logger;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author DYF
 */
@FeignClient(value = "resources-server")
public interface ResoucesService {

    @RequestMapping(value = "/test")
    String tesst();

}
