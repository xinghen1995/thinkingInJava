package com.priv.containers;
// Does Math.random() produce 0.0 and 1.0?

import static com.priv.util.Print.print;

public class RandomBounds {
    static void usage() {
        print("Usage:");
        print("\tRandomBounds lower");
        print("\tRandomBounds upper");
        System.exit(1);
    }

    public static void main(String[] args) {
        if (args.length != 1) usage();
        if (args[0].equals("lower")) {
            while (Math.random() != 0.0)
                ; // Keep trying
            print("Produce 0.0!");
        } else if (args[0].equals("upper")) {
            while (Math.random() != 1.0)
                ; // Keep trying
            print("Produce 1.0!");
        } else
            usage();
    }
}
