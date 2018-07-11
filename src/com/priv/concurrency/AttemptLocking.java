package com.priv.concurrency;
// Locks in the concurrent library allow you
// to give up on trying to acquire a lock.

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 不清楚这里为什么和预期结果不符合
 */
public class AttemptLocking {
    private ReentrantLock lock = new ReentrantLock();

    public void untimed() {
        boolean captured = lock.tryLock();
        try {
            System.out.println("tryLock(): " + captured);
        } finally {
            if (captured)
                lock.unlock();
        }
    }

    public void timed() {
        boolean captured = false;
        try {
            captured = lock.tryLock(2, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            System.out.println("tryLock(2, TimeUnit.SECONDS): " +
                    captured);
        } finally {
            if (captured)
                lock.unlock();
        }
    }

    public static void main(String[] args) {
        final AttemptLocking al = new AttemptLocking();
        al.untimed();
        al.timed();

        new Thread() {
            {
                setDaemon(true);
            }

            public void run() {
                al.lock.lock(); //这里没有释放该类锁，为什么后续线程还是成功了？
                System.out.println("acquired");
            }
        }.start();
        Thread.yield();//这个似乎失去了作用
        al.untimed();
        al.timed();
    }
}
