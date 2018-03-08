package com.priv.innerclasses;
import static com.priv.util.Print.*;

interface Counter {
    int next();
}

public class LocalInnerClass {
    private int count = 0;
    Counter getCounter(final String name) {
        // A local inner class
        class LocalCounter implements Counter {
            public LocalCounter() {
                print("LocalCounter()");
            }
            public int next() {
                printnb(name);
                return count++;
            }
        }
        return new LocalCounter();
    }

    Counter getCounter2(final String name) {
        return new Counter() {
            {
                print("Counter()");
            }
            @Override
            public int next() {
                printnb(name);
                return count++;
            }
        };
    }
    public static void main(String[] args) {
        LocalInnerClass lic = new LocalInnerClass();
        Counter
                c1 = lic.getCounter("Local inner "),
                c2 = lic.getCounter2("Anonymous inner ");
        for(int i = 0; i < 5; i++)
            print(c1.next());
        for(int i = 0; i < 5; i++)
            print(c2.next());
    }
}
