package com.priv.control;

/**
 * java中唯一用到逗号表达式的地方就是
 * for的初始化和步进表达式。
 */

public class CommaOperator {
    public static void main(String[] args) {
        for(int i = 1, j = i+10; i < 5; i++, j = i * 2){
            System.out.println("i = " + i + " j = " + j);
        }
    }
}
