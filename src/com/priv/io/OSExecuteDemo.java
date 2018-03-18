package com.priv.io;

import com.priv.util.OSExecute;

public class OSExecuteDemo {
    public static void main(String[] args) {
        OSExecute.command("javap out/production/thinkingInJava/com.priv.io.OSExecuteDemo");
    }
}
