package com.abstracteg;

public class Square extends Rectangle{

    public Square() {
        super();
    }

    public Square(double side) {
        width = side;
        length = side;
    }

    public Square(String color, Boolean filled, double side) {
        width = side;
        length = side;
        this.colour = color;
        this.filled = filled;
    }

    public double getSide() {
        return length;
    }

    public void setSide(double side) {
        width = side;
        length = side;
    }

    @Override
    public void setWidth(double side) {
        setSide(side);
    }

    @Override
    public void setLength(double side) {
        setSide(side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", length=" + length +
                ", colour='" + colour + '\'' +
                ", filled=" + filled +
                '}';
    }
}
