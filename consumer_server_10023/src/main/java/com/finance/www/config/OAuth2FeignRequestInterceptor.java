//package com.finance.www.config;
//
//import feign.RequestInterceptor;
//import feign.RequestTemplate;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContext;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationDetails;
//
//
///**
// * Created by Administrator on 2019/8/1.
// */
//@Configuration
//@Slf4j
//public class OAuth2FeignRequestInterceptor implements RequestInterceptor {
//
//
//    private static final String AUTHORIZATION_HEADER = "Authorization";
//    private static final String BEARER_TOKEN_TYPE = "bearer";
//
//    @Override
//    public void apply(RequestTemplate requestTemplate) {
//        log.error("yes");
//        SecurityContext securityContext = SecurityContextHolder.getContext();
//        log.error("1");
//        Authentication authentication = securityContext.getAuthentication();
//        log.error("2");
//        if (authentication != null && authentication.getDetails() instanceof OAuth2AuthenticationDetails) {
//            log.error("3");
//            log.debug("yes {} : {} ",AUTHORIZATION_HEADER,BEARER_TOKEN_TYPE);
//            OAuth2AuthenticationDetails details = (OAuth2AuthenticationDetails) authentication.getDetails();
//            log.error("4");
//            String tokenValue = details.getTokenValue();
//            log.error("5");
//            log.error("TOKEN:{}",tokenValue);
//            String format = String.format("%s %s", BEARER_TOKEN_TYPE, tokenValue);
//            log.error("format:{}",format);
//            requestTemplate.header(AUTHORIZATION_HEADER,format);
//            log.error("6");
//            log.error("TOKEN ADD OK");
//        }else {
//            log.error("7");
//            log.error("NULL");
//        }
//        log.error("8");
//    }
//
//
//}
//
