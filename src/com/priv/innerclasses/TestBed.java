package com.priv.innerclasses;
// Putting test code in a nested class.

// 运行这个程序，在项目发布时，简单地删除$Tester.class类文件即可
public class TestBed {
    public void f() {
        System.out.println("f()");
    }

    public static class Tester {
        public static void main(String[] args) {
            TestBed t = new TestBed();
            t.f();
        }
    }
}
