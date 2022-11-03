package com.composition;

public class MyCircle {
    private MyPoint centre;
    private int radius;

    public MyCircle() {
        this.centre = new MyPoint();
        this.radius = 1;
    }

    public MyCircle(MyPoint centre, int radius) {
        this.centre = centre;
        this.radius = radius;
    }

    public MyCircle(int x, int y, int radius){
        this.centre = new MyPoint(x,y);
        this.radius = radius;
    }

    public MyPoint getCentre() {
        return centre;
    }

    public int getRadius() {
        return radius;
    }

    public void setCentre(MyPoint centre) {
        this.centre = centre;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getCentreX(){
        return centre.getX();
    }

    public void setCentreX(int x){
        centre.setX(x);
    }

    public int getCentreY(){
        return centre.getY();
    }

    public void setCentreY(int y){
        centre.setY(y);
    }

    public int[] getCentreXY(){
        return centre.getXY();
    }

    public void setCentreXY(int x, int y){
        centre.setXY(x,y);
    }

    @Override
    public String toString() {
        return "MyCircle{" +
                "centre=(" + centre.getX() + "," + centre.getY() + ")" +
                ", radius=" + radius +
                '}';
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

    public double getCircumference(){
        return 2*Math.PI*radius;
    }

    public double distance(MyCircle another){
        return centre.distance(another.centre);
    }
}
