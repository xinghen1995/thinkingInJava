package com.priv.pratices.chapter11;

import com.priv.innerclasses.Parcel2;

import java.util.PriorityQueue;

class A {
}

public class Test29 {
    public static void main(String[] args) {
        PriorityQueue<A> priorityQueue =
                new PriorityQueue<>();
        for (int i = 0; i < 10; i++) {
            priorityQueue.add(new A());
        }
    }
}
