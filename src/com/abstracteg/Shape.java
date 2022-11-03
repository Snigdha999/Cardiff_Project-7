package com.abstracteg;

public abstract class Shape {

    protected String colour;
    protected boolean filled;

    public Shape() {
        colour = "red";
        filled = true;
    }

    public Shape(String colour, boolean filled) {
        this.colour = colour;
        this.filled = filled;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    public String toString() {
        return "Shape[colour=" + colour + ", filled=" + filled + "]";
    }


}
