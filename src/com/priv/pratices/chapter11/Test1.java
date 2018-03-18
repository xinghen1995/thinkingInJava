package com.priv.pratices.chapter11;

import java.util.ArrayList;

/**
 * (2) 创建一个新类Gerbil(沙鼠)， 包含int gerbilNumber，
 *  在构造器初始化它的信息。添加一个方法hop()，用以打印
 *  沙鼠的号码以及它正在跳跃的信息。创建一个ArrayList，
 *  并向其中添加一串Gerbil对象。使用get()遍历List，并且
 *  对每个Gerbil调用hop()
 */
class Gerbil {
    private static int counter;
    private int gerbilNumber;
    public Gerbil() {
        gerbilNumber = ++counter;
    }
    public void hop() {
        System.out.println("Gerbil " + gerbilNumber +
                " is hopping.");
    }
}
public class Test1 {
    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<>();
        for(int i = 0; i < 10; i++)
            gerbils.add(new Gerbil());
//        for(Gerbil g : gerbils)
//            g.hop();
        for(int i = 0 ; i < gerbils.size(); i++)
            gerbils.get(i).hop();
    }
}
