package com.priv.containers;
// Demonstration of Stack class

import java.util.LinkedList;
import java.util.Stack;

import static com.priv.util.Print.print;
import static com.priv.util.Print.printnb;

enum Month {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
    JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER
}

public class Stacks {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        for (Month m : Month.values())
            stack.push(m.toString());
        print("stack = " + stack);
        // Treating a stack as a Vector:
        stack.addElement("The last line");
        print("element 5 = " + stack.elementAt(5));
        print("popping elements");
        while (!stack.empty())
            printnb(stack.pop() + " ");
        print();

        // Using a LinkedList as a stack:
        LinkedList<String> lstack = new LinkedList<String>();
        for (Month m : Month.values())
            lstack.addFirst(m.toString());
        print("lstack = " + lstack);
        while (!lstack.isEmpty())
            printnb(lstack.removeFirst() + " ");
        print();

        // Using the Stack class from
        // the Holding Your Object Chapter:
        com.priv.util.Stack<String> stack2 =
                new com.priv.util.Stack<String>();
        for (Month m : Month.values())
            stack2.push(m.toString());
        print("stack2 = " + stack2);
        while (!stack2.empty())
            printnb(stack2.pop() + " ");
    }
}
