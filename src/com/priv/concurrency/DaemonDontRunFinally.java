package com.priv.concurrency;
// Daemon threads don't run the finally clause
import java.util.concurrent.*;
import static com.priv.util.Print.*;

class ADaemon implements Runnable {
    public void run() {
        try {
            print("Starting ADaemon");
            TimeUnit.SECONDS.sleep(1);
        } catch(InterruptedException e) {
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
//        TimeUnit.MILLISECONDS.sleep(100);
    }
}
