package com.priv.innerclasses;

/**
 * 接口中的内部类自动是final和static的。
 * 该嵌套类仅仅是利用了接口的命名空间。
 */

public interface ClassInInterface {
    void howdy();

    class Test implements ClassInInterface {
        public void howdy() {
            System.out.println("Howdy!");
        }

        public static void main(String[] args) {
            new Test().howdy();
        }
    }
}
