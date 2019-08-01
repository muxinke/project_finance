package com.finance.www.utils;

/**
 * 针对于数据库中取出的字符串 例如：7%
 * 转换为float类型的数字
 * Created by 杜碧天 on 2019/7/29.
 */
public class StringFloatUtils {
    public static  float stringFloat(String ss){
        Float aFloat = Float.valueOf(Integer.valueOf(ss.replace("%", "")))/100;
        return aFloat;
    }
}
