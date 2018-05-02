package com.priv.util;

import javax.swing.*;

public class SwingConsole {
    public static void run(JFrame frame, int width, int height) {
        SwingUtilities.invokeLater(() -> {
            frame.setTitle(frame.getClass().getSimpleName());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(width, height);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
