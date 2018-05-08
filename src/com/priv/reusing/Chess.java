package com.priv.reusing;
// Inheritance, constructor and arguments.
/**
 * 没有默认构造器，或拥有参数的构造器必须显示调用。
 */

import static com.priv.util.Print.print;

class Game {
    Game(int i) {
        print("Game constructor");
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        print("BoardGame constructor");
    }
}

public class Chess extends BoardGame {
    Chess() {
        super(11);
        print("Chess constructor");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
}
