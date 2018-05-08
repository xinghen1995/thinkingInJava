package com.priv.interfaces;
// Extending an interface with inheritance.

interface Monster {
    void menace();
}

interface DangerousMonster extends Monster {
    void destroy();
}

interface LetHal {
    void kill();
}

class DragonZilla implements DangerousMonster {
    public void menace() {
    }

    ;

    public void destroy() {
    }

    ;
}

// extends后面可以跟多个接口，但仅限于接口，java不允许多重继承
interface Vampire extends DangerousMonster, LetHal {
    void drinkBlood();
}

class VeryBadVampire implements Vampire {
    public void menace() {
    }

    public void destroy() {
    }

    public void kill() {
    }

    public void drinkBlood() {
    }
}

public class HorrorShow {
    static void u(Monster b) {
        b.menace();
    }

    static void v(DangerousMonster d) {
        d.menace();
        d.destroy();
    }

    static void w(LetHal l) {
        l.kill();
    }

    public static void main(String[] args) {
        DangerousMonster barney = new DragonZilla();
        u(barney);
        v(barney);
        Vampire vlad = new VeryBadVampire();
        u(vlad);
        v(vlad);
        w(vlad);
    }
}
