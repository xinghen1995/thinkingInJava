package com.priv.gui;

import javax.swing.*;
import java.awt.*;

import static com.priv.util.SwingConsole.run;

public class Button1 extends JFrame {
    private JButton
            b1 = new JButton("Button 1"),
            b2 = new JButton("Button 2");

    public Button1() {
        setLayout(new FlowLayout());
        add(b1);
        add(b2);
    }

    public static void main(String[] args) {
        run(new Button1(), 200, 100);
    }
}
