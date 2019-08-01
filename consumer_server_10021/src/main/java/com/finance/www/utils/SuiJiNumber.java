package com.finance.www.utils;

import java.security.SecureRandom;
import java.util.Random;

/**
 * Created by Administrator on 2019/8/1.
 */
public class SuiJiNumber {
    public static String getNum(){
        StringBuilder builder = new StringBuilder();
        Random rd = new SecureRandom();
        for(int i =0;i<16;i++){
                builder.append(rd.nextInt(9));
        }
        return builder.toString();
    }
}
