package com.priv.io;

import java.io.*;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Logon implements Serializable {
    private Date date = new Date();
    private String username;
    private transient String password;

    public Logon(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String toString() {
        return "logon info: \n\tusername: " + username +
                "\n\tdate: " + date + "\n\tpassword: " + password;
    }

    public static void main(String[] args) throws Exception {
        Logon a = new Logon("Hulk", "myLittlePony");
        System.out.println("Logon a = " + a);
        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("src/com/priv/io/Logon.out"));
        o.writeObject(a);
        o.close();
        TimeUnit.SECONDS.sleep(1);
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/com/priv/io/Logon.out"));
        System.out.println("Recovering object at " + new Date());
        a = (Logon) in.readObject();
        System.out.println("logon a = " + a);
    }
}
