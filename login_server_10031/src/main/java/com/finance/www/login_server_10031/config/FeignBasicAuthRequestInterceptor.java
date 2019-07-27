package com.finance.www.login_server_10031.config;


import feign.RequestInterceptor;
import feign.RequestTemplate;

/**
 * @author ：邓一凡
 * @date ：Created in 2019/7/27 13:52
 * @description ：
 */
public class FeignBasicAuthRequestInterceptor implements RequestInterceptor {

    public FeignBasicAuthRequestInterceptor() {

    }

    @Override
    public void apply(RequestTemplate template) {
        String property = System.getProperty("fangjia.auth.token");
        System.err.println("property@@@@@@@ = " + property);
        template.header("Authorization", property);
    }
}
