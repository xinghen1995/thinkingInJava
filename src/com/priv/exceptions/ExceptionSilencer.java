package com.priv.exceptions;

/**
 * 直接从finally语句返回导致的异常丢失
 */
public class ExceptionSilencer {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } finally {
            // Using 'return' inside the finally block
            // will silence any thrown exception.
            return;
        }
    }
}
