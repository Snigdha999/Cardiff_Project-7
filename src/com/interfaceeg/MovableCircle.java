package com.interfaceeg;

public class MovableCircle implements  Movable{

    private int radius;
    private MovablePoint centre;

   public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.radius = radius;
        centre = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        centre.moveUp();
    }

    @Override
    public void moveDown() {
        centre.moveDown();
    }

    @Override
    public void moveLeft() {
        centre.moveLeft();
    }

    @Override
    public void moveRight() {
        centre.moveRight();
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", centre=" + centre +
                '}';
    }
}
