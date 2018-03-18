package com.priv.io;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

public class FormattedMemoryInput {
    public static void main(String[] args) throws IOException {
        try {
            DataInputStream in = new DataInputStream(
                    new ByteArrayInputStream(
                            BufferedInputFile.read("src/com/priv/io/FormattedMemoryInput.java").getBytes()
                    )
            );
            while(true)
                System.out.print((char)in.readByte());
        } catch (EOFException e) {
            //使用异常进行流控制，被视作对异常的错误使用，更正确的方法是使用available()
            System.err.println("End of stream");
        }
    }
}
