package com.priv.control;
// For loops with "labeled break" and "labeled continue."

/**
 * label1:
 * outer-iteration {
 * inner-iteration {
 * //...
 * break; // (1)
 * //...
 * continue; // (2)
 * //...
 * continue label1; // (3)
 * //...
 * break label1; // (4)
 * }
 * }
 * 在(1)中，break中断内部迭代，回到外部迭代。在(2)中，continue是执行点移回内部迭代起始
 * 在(3)中，同时中断内部和外部循环，回到标签处，然后进入迭代语句。
 * 在(4)中，同时中断内部和外部迭代，回到标签处，但是不在进入迭代语句。
 */

import static com.priv.util.Print.print;

public class LabeledFor {
    public static void main(String[] args) {
        int i = 0;
        outer:
        // Can't have statement here
        for (; true; ) { // infinite loop
            inner:
            // Can't have statement here
            for (; i < 10; i++) {
                print("i = " + i);
                if (i == 2) {
                    print("continue");
                    continue;
                }
                if (i == 3) {
                    print("break");
                    i++; // Otherwise i never get incremented
                    break;
                }
                if (i == 7) {
                    print("continue outer");
                    i++; // Otherwise i never get incremented
                    continue outer;
                }
                if (i == 8) {
                    print("break outer");
                    break outer;
                }
                for (int k = 0; k < 5; k++) {
                    if (k == 3) {
                        print("Continue inner");
                        continue inner;
                    }
                }
            }
        }
        // Can't continue or break to labels here
    }
}
