package com.finance.www.utils;

/**
 * Created by Administrator on 2019/7/29.
 */
public class RandomCode {
    public static int  getCode(){
        //每次调用生成一位四位数的随机数
        int i = (int) (Math.random() * 9999) + 100;
        return i;
    }
}
