package com.priv.strings;

/**
 * 默认Scanner使用空白字符对输入进行分词，
 * 这里可以自定义分界符。
 */

import java.util.Scanner;

public class ScannerDelimiter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("12, 42, 78, 99, 42");
        scanner.useDelimiter("\\s*,\\s*");
        while (scanner.hasNextInt()) {
            System.out.println(scanner.nextInt());
        }
    }
}
