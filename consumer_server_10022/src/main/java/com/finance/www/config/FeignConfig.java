package com.finance.www.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import feign.Logger;
/**
 * Created by 杜碧天 on 2019/7/31.
 */
@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.BASIC;
    }

}
