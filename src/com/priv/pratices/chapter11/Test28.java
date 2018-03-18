package com.priv.pratices.chapter11;
import java.util.*;

public class Test28 {
    public static void main(String[] args) {
        Random rand = new Random(47);
        PriorityQueue<Double> priorityQueue =
                new PriorityQueue<>();
        for (int i = 0; i < 10; i++) {
            priorityQueue.offer(rand.nextDouble());
        }
        while(priorityQueue.peek() != null)
            System.out.print(priorityQueue.poll() + " ");
    }
}
