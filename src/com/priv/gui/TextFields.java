package com.priv.gui;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.priv.util.SwingConsole.run;

public class TextFields extends JFrame {
    private JButton
            b1 = new JButton("Get Text"),
            b2 = new JButton("Set Text");
    private JTextField
            t1 = new JTextField(30),
            t2 = new JTextField(30),
            t3 = new JTextField(30);
    private String s = "";
    private UpperCaseDocument ucd = new UpperCaseDocument();

    public TextFields() {
        t1.setDocument(ucd);
        ucd.addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                t2.setText(t1.getText());
                t3.setText("Text: " + t1.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                t2.setText(t1.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (t1.getSelectedText() == null)
                    s = t1.getText();
                else
                    s = t1.getSelectedText();
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ucd.setUpperCase(false);
                t1.setText("Inserted by Button 2: " + s);
                ucd.setUpperCase(true);
                t1.setEditable(false);
            }
        });
        t1.addActionListener(new ActionListener() {
            private int count;

            @Override
            public void actionPerformed(ActionEvent e) {
                t3.setText("t1 ActionEvent " + count++);
            }
        });
        setLayout(new FlowLayout());
        add(b1);
        add(b2);
        add(t1);
        add(t2);
        add(t3);
    }

    public static void main(String[] args) {
        run(new TextFields(), 375, 200);
    }
}

class UpperCaseDocument extends PlainDocument {
    private boolean upperCase = true;

    public void setUpperCase(boolean flag) {
        upperCase = flag;
    }

    public void insertString(int offset, String str, AttributeSet attSet)
            throws BadLocationException {
        if (upperCase) str = str.toUpperCase();
        super.insertString(offset, str, attSet);
    }
}
