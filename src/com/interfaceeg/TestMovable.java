package com.interfaceeg;

public class TestMovable {

    public static void main(String[] args) {
        Movable movable = new MovablePoint(1,2,3,4);
        System.out.println(movable);
        movable.moveRight();
        System.out.println(movable);

        Movable movable1 = new MovableCircle(1,2,5,7,3);
        System.out.println(movable1);
        movable1.moveRight();
        System.out.println(movable1);
    }
}
