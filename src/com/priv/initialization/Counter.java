package com.priv.initialization;

public class Counter {
    /*无法阻止自动初始化的进行，它将在构造函数调用之前进行
    * 即这里的i首先被置0
    * */
    int i;

    Counter() {
        i = 7;
    }
}
