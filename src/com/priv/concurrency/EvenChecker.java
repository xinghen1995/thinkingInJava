package com.priv.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EvenChecker implements Runnable {
    private IntGenerator generator;
    private final int id;

    public EvenChecker(IntGenerator g, int ident) {
        generator = g;
        id = ident;
    }

    public void run() {
        while (!generator.isCanceled()) {
            int val = generator.next();
            if (val % 2 != 0) { // 每次消费一个偶数，如果是奇数则回退。
                System.out.println(val + " not even");
                generator.cancel(); // Cancel all EvenCheckers
            }
        }
    }

    // Test any type of IntGenerator:['p;
    public static void test(IntGenerator gp, int count) {
        System.out.println("Press Control-C to exit");
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < count; i++)
            exec.execute(new EvenChecker(gp, i));
        exec.shutdown();
    }

    // Default value for count
    public static void test(IntGenerator gp) {
        test(gp, 10);
    }
}
