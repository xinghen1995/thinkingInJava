package com.priv.exceptions;
// How an exception can be lost.

// 重要的异常可能丢失，一般发生在前一个异常还没有处理，
// 就抛出新异常的情况。
class VeryImportantException extends Exception {
    public String toString() {
        return "A very important exception";
    }
}

class HoHumException extends Exception {
    public String toString() {
        return "A trivial exception";
    }
}

public class LostMessage {
    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    void dispose() throws HoHumException {
        throw new HoHumException();
    }

    public static void main(String[] args) {
        try {
            LostMessage lm = new LostMessage();
            try {
                lm.f();
            } finally {
                lm.dispose();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
