package com.finance.www.token;

import lombok.Data;

import java.io.Serializable;

/**
 * @author ：邓一凡
 * @date ：Created in 2019/7/26 3:12
 * @description ： 令牌
 */
@Data
public class Token implements Serializable {
    private String access_token;
    private String token_type;
    private String refresh_token;
    private String expires_in;
    private String scope;
    private String userinfo;
    private String jti;
}
