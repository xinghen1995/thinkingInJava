package com.priv.exceptions;

import java.io.FileInputStream;

public class MainException {
    // Pass all exception to the console:
    public static void main(String[] args) throws Exception {
        // Open the file
        FileInputStream file = new FileInputStream("src/com/priv/exceptions/MainException.java");
        // Use the file...
        // Close the file
        file.close();
    }
}
