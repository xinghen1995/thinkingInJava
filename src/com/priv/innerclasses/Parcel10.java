package com.priv.innerclasses;

public class Parcel10 {
    public Destination
    destination(final String dest, final float price) {
        return new Destination() {
            private int cost;
            {
                cost = Math.round(price);
                if(cost > 100)
                    System.out.println("Over budget");
            }
            private String label;
            @Override
            public String readLabel() {
                return label;
            }
        };
    }
    public static void main(String[] args) {
        Parcel10 p = new Parcel10();
        Destination d = p.destination("Tasmania", 101.395F);
    }
}
