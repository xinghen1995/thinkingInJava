package com.priv.io;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public class TestEOF {
    public static void main(String[] args) throws IOException {
        DataInputStream in  = new DataInputStream(
                new ByteArrayInputStream(
                        BufferedInputFile.read("src/com/priv/io/TestEOF.java").getBytes()
                )
        );
        //readByte()读取任何字节都是正确的，不能用于检查文件结尾。
        while(in.available() != 0)
            System.out.print((char)in.readByte());
    }
}
