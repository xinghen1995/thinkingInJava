package com.priv.polymorphism;

class StaticSuper {
    public static String StaticGet() {
        return "Base staticGet()";
    }
    public String dynamicGet() {
        return "Base dynamicGet()";
    }
}

class StaticSub extends StaticSuper {
    public static String staticGet() {
        return "Derived staticGet()";
    }
    public String dynamicGet() {
        return "Derived dynamicGet()";
    }
}
public class StaticPolymorphism {
    public static void main(String[] args){
        StaticSuper sup = new StaticSub();
//        不可用
//        System.out.println(sup.staticGet());
        System.out.println(sup.dynamicGet());
    }
}
