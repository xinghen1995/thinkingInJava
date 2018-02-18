package com.priv.pratices.chapter21;
/**
 * 练习6
 * (2) 创建一个任务，它将睡眠1到10秒之间的随机数量的时间，
 * 然后显示它的睡眠时间并退出。创建并运行一定数量的这种任
 * 务。
 */
import java.util.Random;
import java.util.concurrent.*;

class SleepTime implements Runnable {
    private static Random rand = new Random(47);
    private static int counter = 0;
    private int id;
    private int time;
    public SleepTime() {
        id = ++counter;
        time = (rand.nextInt(10) + 1) * 1000;
    }
    public void run() {
        try {
            TimeUnit.MILLISECONDS.sleep(time);
            System.out.println("Thread " + id + " sleep " + (time/1000) + "s.");
        } catch(InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class Test6 {
    public static void main(String[] args){
        ExecutorService exec = Executors.newCachedThreadPool();
        for(int i = 0; i < 10; i++)
            exec.execute(new SleepTime());
        exec.shutdown();
    }
}
