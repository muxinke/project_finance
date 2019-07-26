package com.finance.www.utils;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 将date转换为string类型的格式输出
 * Created by 杜碧天 on 2019/7/26.
 */
public class DateZString implements Serializable{
    public static String dateHZhuanString(Date date){
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        String format = sf.format(date);
        return format;
    }
}
