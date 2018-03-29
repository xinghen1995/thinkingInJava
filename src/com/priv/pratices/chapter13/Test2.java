package com.priv.pratices.chapter13;
/**
 * �ַ�����this��+���ӣ����﷢�����Զ�ת����
 * ����this.toSting()�������ӣ����������˵ݹ���á�
 * ��ȷ�ķ�ʽ��ʹ��Object.toString()������ʹ��super.toSting()
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
