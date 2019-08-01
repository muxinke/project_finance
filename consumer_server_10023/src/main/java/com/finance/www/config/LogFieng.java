package com.finance.www.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2019/8/1.
 */
@Configuration
public class LogFieng {
    @Bean
    Logger.Level feignLevel() {
        return Logger.Level.FULL;
    }
}

