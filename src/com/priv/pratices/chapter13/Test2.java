package com.priv.pratices.chapter13;
/**
 * 字符串和this用+连接，这里发生了自动转换，
 * 调用this.toSting()进行连接，进而发生了递归调用。
 * 正确的方式是使用Object.toString()，这里使用super.toSting()
 */

import java.util.ArrayList;
import java.util.List;
class InfiniteRecursion {
    public String toString() {
//        return " InfiniteRecursion address: " + this + "\n";
        return "InfiniteRecursion address: " + super.toString() + "\n";
    }
}
public class Test2 {
    public static void main(String[] args) {
        List<InfiniteRecursion> v =
                new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            v.add(new InfiniteRecursion());
        }
        System.out.println(v);
    }
}
