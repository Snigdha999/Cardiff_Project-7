package com.inheritanceEx;

import com.abstracteg.Circle;
import com.abstracteg.Rectangle;
import com.abstracteg.Shape;
import com.abstracteg.Square;
import com.inheritance.Cylinder;

public class Test {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "red", false);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColour());
        System.out.println(s1.isFilled());
        // Because this is ultimately a type of Shape, and getRadius() is not defined in Shape, this doesn't work
        //System.out.println(s1.getRadius());

        Circle c1 = (Circle)s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColour());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        // Shape is an abstract class
        //Shape s2 = new Shape();

        Shape s3 = new Rectangle(1.0, 2.0, "red", false);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColour());
        // Same idea as when we saw getRadius above causing an error; getLength() doesn't exist within Shape
        //System.out.println(s3.getLength());

        Rectangle r1 = (Rectangle)s3;
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColour());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColour());
        // Same thing happening again; getSide not within Shape
        //System.out.println(s4.getSide());

        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColour());
        // Although Square is a type of Rectangle, Rectangle doesn't define the getSide() method
        //System.out.println(r2.getSide());
        System.out.println(r2.getLength());

    }
}
