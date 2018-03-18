package com.priv.pratices.chapter12;
import java.util.logging.*;
import java.io.*;

class MyException2 extends Exception {
    private static Logger logger =
            Logger.getLogger("MyException2");
    public MyException2() {
        StringWriter trace =
                new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
public class Test6 {
    public static void main(String[] args) {
        try {
            throw new MyException2();
        } catch (MyException2 e) {
            e.printStackTrace(System.out);
        }
    }
}
