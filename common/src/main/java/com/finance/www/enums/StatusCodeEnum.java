package com.finance.www.enums;

public enum StatusCodeEnum {
    /**
     * 请求成功
     */
    SUCCESS,
    /**
     * 请求失败
     */
    ERROR,
    TIMEOUT;

    StatusCodeEnum() {
    }

    public static StatusCodeEnum valueOf(int value) {
        switch (value) {
            case 0:
                return SUCCESS;
            case 1:
                return ERROR;
            default:
                return null;
        }
    }
}
