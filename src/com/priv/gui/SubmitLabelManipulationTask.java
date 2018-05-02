package com.priv.gui;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class SubmitLabelManipulationTask {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Hello Swing");
        final JLabel label = new JLabel("A Label");
        frame.add(label);
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        TimeUnit.SECONDS.sleep(1);
//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                label.setText("Hey! This is different");
//            }
//        });
        SwingUtilities.invokeLater(() -> label.setText("Hey, This is Different."));
    }
}
