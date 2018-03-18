package com.priv.pratices.chapter11;

import java.util.LinkedList;
import java.util.Queue;

class Command {
    private String description;

    public Command(String description) {
        this.description = description;
    }

    public void operation() {
        System.out.println(description);
    }
}

class Class2 {
    private static Queue<Command> queue = new LinkedList<Command>();

    public static Queue<Command> offer(Command command) {
        if (queue != null) {
            queue.offer(command);
        }
        return queue;
    }
}

public class Test27 {
    public static void exec(Queue<Command> queue) {
        while(queue.peek() != null)
            queue.poll().operation();
    }
    public static void main(String[] args) {
        Class2.offer(new Command("Command1"));
        Class2.offer(new Command("command2"));
        Class2.offer(new Command("command3"));
        exec(Class2.offer(new Command("command4")));
    }
}
