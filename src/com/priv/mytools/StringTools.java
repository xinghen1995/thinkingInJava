package com.priv.mytools;

public class StringTools {
    public static int storage(String s){
        /*
         *计算传入字符串占用的字节数
         */
        return s.length() * 2;
    }
}
