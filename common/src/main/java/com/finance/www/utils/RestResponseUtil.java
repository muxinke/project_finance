package com.finance.www.utils;

import java.io.Serializable;

/**
 * @author ：邓一凡
 * @date ：Created in 2019/7/24 22:31
 * @description ： ajax请求返回对象
 */

public class RestResponseUtil implements Serializable {
    private  Object message;
    private  boolean status;


    public RestResponseUtil(Object message, boolean status) {
        this.message = message;
        this.status = status;
    }

    public  Object getMessage() {
        return message;
    }

    public  void setMessage(String message) {
        this.message = message;
    }

    public  boolean isStatus() {
        return status;
    }

    public  void setStatus(boolean status) {
        this.status = status;
    }
}
