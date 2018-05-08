package com.priv.reusing;

/**
 * 通过继承SpaceShip得到了SpaceShipControls的大多数方法，
 * 即SpaceShipControl暴露了所有方法
 */
public class SpaceShip extends SpaceShipControls {
    private String name;

    public SpaceShip(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        SpaceShip protector = new SpaceShip("NSEA Protector");
        protector.forward(100);
    }
}
