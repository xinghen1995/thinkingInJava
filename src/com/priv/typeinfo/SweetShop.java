package com.priv.typeinfo;
import static com.priv.util.Print.*;

class Candy {
    static {
        print("Loading Candy");
    }
}

class Gum {
    static {
        print("Loading Gum");
    }
}

class Cookie {
    static {
        print("Loading Cookie");
    }
}

public class SweetShop {
    public static void main(String[] args) {
        print("inside main");
        new Candy();
        print("After creating Candy");
        try {
//            Class.forName("com.priv.typeinfo.Gum");
            Class.forName("Gum");
        } catch (ClassNotFoundException e) {
            print("Couldn't find Gum");
        }
        print("After Class.forName(\"Gum\")");
        new Cookie();
        print("After creating Cookie");
        print("Create through Command line");

        if(args.length <= 0) return;
        String str = "com.priv.typeinfo." + args[0];
        try {
             Class.forName(str).newInstance();
        } catch (ClassNotFoundException e) {
            print("Couldn't find " + args[0]);
        } catch (IllegalAccessException e) {
            print("AccessException");
        } catch (InstantiationException e) {
            print("InstantiationException");
        }
    }
}
