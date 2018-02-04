package com.priv.reusing;
import javax.swing.plaf.basic.BasicHTML;

import static com.priv.util.Print.*;

class Soap {
    private String s;
    Soap() {
        print("Soap()");
        s = "Constructed";
    }
    public String toString() { return s; }
}
public class Bath {
    private String //在定义处初始化
        s1 = "Happy",
        s2 = "Happy",
        s3, s4;
    private Soap castille;
    private int i;
    private float toy;
    public Bath() {
        print("Inside Bash()");
        s3 = "joy";
        toy = 3.14f;
        castille = new Soap();
    }
    // 实例初始化
    { i = 47; }
    public String toString() {
        if(s4 == null) //延迟初始化
            s4 = "Joy";
        return "s1 = " + s1 + "\n" +
                "s2 = " + s2 + "\n" +
                "s3 = " + s3 + "\n" +
                "s4 = " + s4 + "\n" +
                "i = " + i + "\n" +
                "toy = " + toy + "\n" +
                "castillle = " + castille;
    }
    public static void main(String[] args) {
        Bath b = new Bath();
        print(b);
    }
}
