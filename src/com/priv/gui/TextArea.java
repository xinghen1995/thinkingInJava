package com.priv.gui;

import com.priv.util.Countries;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import java.util.Map;

import static com.priv.util.SwingConsole.run;

public class TextArea extends JFrame {
    private JButton
            b = new JButton("Add Data"),
            c = new JButton("Clear Data");
    private JTextArea t = new JTextArea(20, 40);
    private Map<String, String> m = new HashMap<String, String>();

    public TextArea() {
        m.putAll(Countries.capitals());
        b.addActionListener((ActionEvent e) -> {
            for (Map.Entry me : m.entrySet())
                t.append(me.getKey() + ": " + me.getValue() + "\n");
        });
        c.addActionListener((ActionEvent e) -> t.setText(""));
        setLayout(new FlowLayout());
        add(new JScrollPane(t));
        add(b);
        add(c);
    }

    public static void main(String[] args) {
        run(new TextArea(), 475, 525);
    }
}
