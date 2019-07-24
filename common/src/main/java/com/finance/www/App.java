package com.finance.www;

import com.finance.www.enums.ProduitEnum;

import java.util.Arrays;

/**
 * Hello world!
 *
 * @author DYF
 */
public class App {
    public static void main(String[] args) {
        int type = ProduitEnum.Easy_consumption.getType();
        System.out.println("type = " + type);
        String typeName = ProduitEnum.Easy_consumption.getTypeName();
        System.out.println("typeName = " + typeName);
        int type1 = 5;

        ProduitEnum[] values = ProduitEnum.values();
        System.out.println("values = " + Arrays.toString(values));
        String enumType = ProduitEnum.getEnumType(5);

        System.err.println("enumType = " + enumType);
    }
}
