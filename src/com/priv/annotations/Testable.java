package com.priv.annotations;

import com.priv.atunit.*;

public class Testable {
    public void execute() {
        System.out.print("executing...");
    }
    @Test void testExecute() {
        execute();
    }

    public static void main(String[] args) {
        new Testable().testExecute();
    }
}
