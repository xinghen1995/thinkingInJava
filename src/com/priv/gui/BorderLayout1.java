package com.priv.gui;

import javax.swing.*;
import java.awt.*;

import static com.priv.util.SwingConsole.run;

public class BorderLayout1 extends JFrame {
    public BorderLayout1() {
        add(BorderLayout.NORTH, new JButton("North"));
        add(BorderLayout.SOUTH, new JButton("South"));
        add(BorderLayout.EAST, new JButton("East"));
        add(BorderLayout.WEST, new JButton("West"));
        add(BorderLayout.CENTER, new JButton("Center"));
    }

    public static void main(String[] args) {
        run(new BorderLayout1(), 300, 250);
    }
}
