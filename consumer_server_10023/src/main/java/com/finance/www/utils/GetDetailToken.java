//package com.finance.www.utils;
//
///**
// * Created by Administrator on 2019/8/1.
// */
//public class GetDetailToken {
//    public static String getDetailToken() {
//        SecurityContext securityContext = SecurityContextHolder.getContext();
//        Authentication authentication = securityContext.getAuthentication();
//        if (authentication != null && authentication.getDetails() instanceof OAuth2AuthenticationDetails) {
//            OAuth2AuthenticationDetails details = (OAuth2AuthenticationDetails) authentication.getDetails();
//            String tokenValue = details.getTokenValue();
//            return tokenValue;
//        }
//        return "";
//    }
//}
