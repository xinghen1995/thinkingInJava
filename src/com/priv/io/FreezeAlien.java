package com.priv.io;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class FreezeAlien {
    public static void main(String[] args) throws Exception {
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("src/com/priv/io/X.file"));
        out.writeObject(new Alien());
        out.close();
    }
}
