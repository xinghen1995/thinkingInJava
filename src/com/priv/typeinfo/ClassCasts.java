package com.priv.typeinfo;

/**
 * cast()利用Class类进行类型转换，仅仅用于特殊用途。
 */
class Building {
}

class House extends Building {
}

public class ClassCasts {
    public static void main(String[] args) {
        Building b = new House();
        Class<House> houseType = House.class;
        House h = houseType.cast(b);
        h = (House) b; // ... or just do this.
    }
}
