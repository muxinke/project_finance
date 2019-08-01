package com.finance.www.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 时间转换为指定类型
 * Created by Administrator on 2019/7/26.
 */
public class CalculateScheDule {
    public static String getScheDule(int count){
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.MONTH,count );
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date time = instance.getTime();
        String formatTime = simpleDateFormat.format(time);
        return formatTime;
    }
}
