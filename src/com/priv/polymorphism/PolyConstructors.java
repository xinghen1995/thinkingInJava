package com.priv.polymorphism;

import static com.priv.util.Print.print;

/**
 * 魔幻的结果，这里为什么会出现Glyph.draw()无法被调用的情况？
 * 答：尽管RoundGlyph还没有完全初始化，但动态绑定已经找到其类型。
 * <p>
 * 构造器编写原则：用尽可能简单的方法使对象进入正常状态，如果可以的话，
 * 避免调用其他方法
 * 只有基类中的final方法是绝对安全的。
 */
class Glyph {
    void draw() {
        print("Glyph.draw()");
    }

    Glyph() {
        print("Glyph() before draw()");
        // 调用到这里是，动态绑定找到了其子类中的方法，但是这时radius还没有初始化。
        draw();
        print("Glyph() after draw()");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;

    RoundGlyph(int r) {
        radius = r;
        print("RoundGlyph.draw(), radius = " + radius);
    }

    void draw() {
        print("RoundGlyph.draw(), radius = " + radius);
    }
}

public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
    }
}
