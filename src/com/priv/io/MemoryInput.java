package com.priv.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class MemoryInput {
    public static void main(String[] args) throws IOException {
        StringReader in = new StringReader(
                BufferedInputFile.read("src/com/priv/io/MemoryInput.java")
        );
        //read()方法以int返回读取的字节，必须进行转换。
        int c;
        while((c = in.read()) != -1)
            System.out.print((char)c);
    }
}
