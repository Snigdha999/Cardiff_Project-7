package com.inheritance;

public class Cylinder extends Circle{

    private double height;

    public Cylinder() {
        super(); //calls the super class i.e. Circle
        height = 1.0;
    }

    public Cylinder(double radius) {
        super(radius);
        height = 1.0;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height =  height;
    }

    public Cylinder(double radius, String colour, double height) {
        super(radius, colour);
        this.height =  height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return super.getArea()*height;
    }

    @Override
    public double getArea() {
        return 2*Math.PI * super.getRadius() *height + 2* super.getArea();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}';
    }

}
