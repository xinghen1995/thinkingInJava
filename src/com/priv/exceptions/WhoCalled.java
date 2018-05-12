package com.priv.exceptions;
// Programmatic access to stack trace information.

public class WhoCalled {
    public static void f() {
        // Generate an exception to fill in the stack trace
        try {
            throw new Exception();
        } catch (Exception e) {
            for (StackTraceElement ste : e.getStackTrace()) {
                System.out.println(ste.getMethodName());
//                System.out.println(ste);
            }

        }
    }

    public static void g() {
        f();
    }

    public static void h() {
        g();
    }

    public static void main(String[] args) {
        f();
        System.out.println("--------------------------");
        g();
        System.out.println("--------------------------");
        h();
    }
}
