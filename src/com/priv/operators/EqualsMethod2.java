package com.priv.operators;
//Default equals() does not compare contents.
/*
 * equal方法默认的是比较引用，这是否意味着基本类型的包装类都复写了
 * equal方法？
 */
class Value {
    int i;
}
public class EqualsMethod2 {
    public static void main(String[] args) {
        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 100;
        System.out.println(v1.equals(v2));
    }
}
