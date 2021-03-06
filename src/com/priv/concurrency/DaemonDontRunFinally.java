package com.priv.concurrency;
// Daemon threads don't run the finally clause

import java.util.concurrent.TimeUnit;

import static com.priv.util.Print.print;

class ADaemon implements Runnable {
    public void run() {
        try {
            print("Starting ADaemon");
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            print("Exiting via InterruptedException");
        } finally {
            print("This should always run?");
        }
    }
}

public class DaemonDontRunFinally {
    public static void main(String[] args) throws Exception {
        Thread t = new Thread(new ADaemon());
        t.setDaemon(true);
        t.start();
//        大概是源于不同机器的JVM实现不同，我这边总是
//         主线程线运行完成，后台进程没有打印文字
//        TimeUnit.MILLISECONDS.sleep(100);
    }
}
