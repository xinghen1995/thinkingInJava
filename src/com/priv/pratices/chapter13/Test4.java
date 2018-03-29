package com.priv.pratices.chapter13;

import java.util.*;

class Receipt {
    private double total = 0;
    private static final int WIDTH = 10;
    private Formatter f = new Formatter(System.out);

    public void printTitle() {
        f.format("%-" + WIDTH*3 + "s %" + WIDTH + "s %"+ WIDTH*2 + "s\n", "Item", "Qty", "Price");
        f.format("%-" + WIDTH*3 + "s %"+ WIDTH + "s %" + WIDTH*2 +"s\n", "----", "---", "-----");
    }

    public void print(String name, int qty, double price) {
        f.format("%-"+ WIDTH*3 +"." + WIDTH*3 + "s %" + WIDTH +"s %" + WIDTH*2 + ".2f\n", name, qty, price);
        total += price;
    }

    public void printTotal() {
        f.format("%-" + WIDTH*3 +"s %" + WIDTH + "s %" + WIDTH*2 + ".2f\n", "Tax", "", total * 0.06);
        f.format("%-" + WIDTH*3 + "s %" + WIDTH +"s %" + WIDTH*2 + "s\n", "", "", "-----");
        f.format("%-" + WIDTH*3 + "s %" + WIDTH + "s %" + WIDTH*2 + ".2f\n", "Total", "", total * 1.06);
    }
}

public class Test4 {
    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.printTitle();
        receipt.print("Jack's Magic Beans", 4, 4.25);
        receipt.print("Princess Peas", 3, 5.1);
        receipt.print("Three Bears Porridge", 1, 14.29);
        receipt.printTotal();
    }
}
