package com.finance.www.login_server_10031.oauth2;

import lombok.Data;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ：邓一凡
 * @date ：Created in 2019/7/27 14:51
 * @description ：
 */
@Data
public class SendToken {
    private String username;
    private String password;
    private String grant_type;
    private String client_id;
    private String scope;
    private String client_secret;
}
