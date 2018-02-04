package com.priv.initialization;
import static com.priv.util.Print.*;

public class InitialValue {
    boolean t;
    char c;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    InitialValue reference;
    void printInitialValue() {
        print("Date Type        Initial value");
        print("boolean          "  + t);
        print("char             [" + c + "]");
        print("byte             " + b);
        print("short            " + s);
        print("int              " + i);
        print("long             " + l);
        print("float            " + f);
        print("double           " + d);
        print("reference        " + reference);
    }
    public static void main(String[] args) {
        InitialValue iv = new InitialValue();
        iv.printInitialValue();
    }
}
