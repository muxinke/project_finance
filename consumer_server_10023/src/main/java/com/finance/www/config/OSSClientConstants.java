package com.finance.www.config;

import org.springframework.context.annotation.Configuration;

/**
 * Created by 杜碧天 on 2019/7/24.
 */
@Configuration
public class OSSClientConstants {
    //阿里云API的外网域名
    public static final String ENDPOINT = "oss-cn-beijing.aliyuncs.com";
    //阿里云API的密钥Access Key ID
    public static final String ACCESS_KEY_ID = "LTAIv9LLXRMbR42l";
    //阿里云API的密钥Access Key Secret
    public static final String ACCESS_KEY_SECRET = "6s9Bx0WY7XgrrujYoQ1E7WRTS3awQ0";
    //阿里云API的bucket名称
    public static final String BACKET_NAME = "dubitianoss";
    //阿里云API的文件夹名称
    public static final String FOLDER="imgs/";
}
