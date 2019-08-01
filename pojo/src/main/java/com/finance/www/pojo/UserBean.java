/**
  * Copyright 2019 bejson.com 
  */
package com.finance.www.pojo;
import lombok.Data;

import java.util.List;

/**
 * Auto-generated: 2019-08-01 19:45:50
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Data
public class UserBean {

    private boolean active;
    private long exp;
    private String user_name;
    private List<String> authorities;
    private String client_id;
    private List<String> scope;


}