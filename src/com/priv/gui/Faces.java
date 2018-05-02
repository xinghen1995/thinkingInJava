package com.priv.gui;

import javax.swing.*;
import java.awt.*;

import static com.priv.util.SwingConsole.run;

public class Faces extends JFrame {
    private static Icon[] faces;
    private JButton jb, jb2 = new JButton("Disable");
    private boolean mad = false;

    public Faces() {
        faces = new Icon[]{
                new ImageIcon(getClass().getResource("Face0.gif")),
                new ImageIcon(getClass().getResource("Face1.gif")),
                new ImageIcon(getClass().getResource("Face2.gif")),
                new ImageIcon(getClass().getResource("Face3.gif")),
                new ImageIcon(getClass().getResource("Face4.gif")),
        };
        jb = new JButton("JButton", faces[3]);
        setLayout(new FlowLayout());
        jb.addActionListener((e) -> {
            if (mad) {
                jb.setIcon(faces[3]);
                mad = false;
            } else {
                jb.setIcon(faces[0]);
                mad = true;
            }
            jb.setVerticalAlignment(JButton.TOP);
            jb.setHorizontalAlignment(JButton.LEFT);
        });
        jb.setRolloverEnabled(true);
        jb.setRolloverIcon(faces[1]);
        jb.setPressedIcon(faces[2]);
        jb.setDisabledIcon(faces[4]);
        jb.setToolTipText("Yow!");
        add(jb);
        jb2.addActionListener((e) -> {
            if (jb.isEnabled()) {
                jb.setEnabled(false);
                jb2.setText("Enable");
            } else {
                jb.setEnabled(true);
                jb2.setText("Disabled");
            }
        });
    }

    public static void main(String[] args) {
        run(new Faces(), 250, 125);
    }
}
