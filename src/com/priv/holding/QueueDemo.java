package com.priv.holding;
/**
 * peek()和element()都能返回队首，但peek()在对列为空时，
 * 返回null，而element()将抛出NoSuchElementException，
 * 同样poll()和remove()都将移除队首元素，但是poll()在对列
 * 为空时，返回null，而remove()将抛出NoSuchElementException。
 * <p>
 * Queue接口底层采用链表实现，LinkedList容器，
 * 从某种程度上来说，Queue接口限制了LinkedList的
 * 功能。
 */
/**
 * Queue接口底层采用链表实现，LinkedList容器，
 * 从某种程度上来说，Queue接口限制了LinkedList的
 * 功能。
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueDemo {
    public static void printQ(Queue queue) {
        while (queue.peek() != null)
            System.out.print(queue.remove() + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Random rand = new Random(47);
        for (int i = 0; i < 10; i++)
            queue.offer(rand.nextInt(i + 10));
        printQ(queue);
        Queue<Character> qc = new LinkedList<Character>();
        for (char c : "Brontosaurus".toCharArray())
            qc.offer(c);
        printQ(qc);
    }
}
