package com.finance.www.utils;

import com.finance.www.enums.StatusCodeEnum;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ：邓一凡
 * @date ：Created in 2019/7/24 22:31
 * @description ： ajax请求返回对象
 */

public class RestResponseUtil implements Serializable {
    private String message;
    private StatusCodeEnum status;
    private List<Object> data = new ArrayList<>();


    public RestResponseUtil() {
    }

    public RestResponseUtil(String message, StatusCodeEnum status) {
        this.message = message;
        this.status = status;
    }

    public RestResponseUtil(String message, StatusCodeEnum status, List<Object> data) {
        this.message = message;
        this.status = status;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public StatusCodeEnum getStatus() {
        return status;
    }

    public void setStatus(StatusCodeEnum status) {
        this.status = status;
    }

    public List<Object> getData() {
        return data;
    }

    public void setData(List<Object> data) {
        this.data = data;
    }
}
