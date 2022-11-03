package com.composition;

public class TestMyCircle {
    public static void main(String[] args) {

        MyCircle c1 = new MyCircle();
        System.out.println(c1);
        c1.setRadius(5);
        System.out.println(c1.getRadius());
        c1.setCentre(new MyPoint(1, 2));
        System.out.println(c1.getCentre());

        MyCircle c2 = new MyCircle(1, 2, 3);
        System.out.println(c2.getCentreX());
        System.out.println(c2.getCentreY());
        c2.setCentreXY(2, 4);
        System.out.println(c2.getCentreXY()[0]);
        System.out.println(c2.getCentreXY()[1]);

        MyCircle c3 = new MyCircle(new MyPoint(3, 4), 5);
        System.out.println(c3);
        c3.setCentreX(4);
        c3.setCentreY(10);
        System.out.println(c3);
        System.out.println(c3.getArea());
        System.out.println(c3.getCircumference());
        System.out.println(c3.distance(c2));

    }
}
