package com.finance.www.comsumer_client_8040.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ：邓一凡
 * @date ：Created in 2019/8/1 1:18
 * @description ：
 */
@Configuration
public class LogFieng {
    @Bean
    Logger.Level feignLevel() {
        return Logger.Level.FULL;
    }
}
