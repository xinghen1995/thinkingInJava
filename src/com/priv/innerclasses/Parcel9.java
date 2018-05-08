package com.priv.innerclasses;
// An anonymous inner class that perform
// initialization. A briefer version of Parcel5.java

/**
 * 如果定义一个匿名内部类，并希望它使用一个在其外部定义的对象，
 * 那么编译器要求其参数是final的，否则报错。
 * 如果参数没有在内部类中使用，那么不要求其实final的。
 */
public class Parcel9 {
    public Destination destination(final String dest) {
        return new Destination() {
            private String label = dest;

            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 p = new Parcel9();
        Destination d = p.destination("Tasmania");
    }
}
