package com.finance.www.utils;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by 杜碧天 on 2019/7/26.
 */
public class DateMonthUtil {
    public static Date stepMonth(Date sourceDate, int month) {
       Calendar c = Calendar.getInstance();
       c.setTime(sourceDate);
       c.add(Calendar.MONTH, month);
       return c.getTime();
    }


}
