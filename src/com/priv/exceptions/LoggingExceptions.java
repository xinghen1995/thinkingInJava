package com.priv.exceptions;
// An exception that reports through a Logger

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

class LoggingException extends Exception {
    private static Logger logger =
            Logger.getLogger("LoggingException");

    public LoggingException() {
        // 抽取字符串
        // StringWrite 可以当做一个StringBuffer来用，实际上其底层就是利用StringBuffer来缓存字符
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

public class LoggingExceptions {
    public static void main(String[] args) {
        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.err.println("Caught " + e);
        }
        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.err.println("Caught " + e);
        }
    }
}
