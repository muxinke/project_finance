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

    /**
     * 从系统变量上获取令牌添加到请求头中
     *
     * @param template
     */
    @Override
    public void apply(RequestTemplate template) {
        String property = System.getProperty("fangjia.auth.token");
        template.header("Authorization", property);
    }
}
