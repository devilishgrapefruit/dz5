package com.dz;

public class MovableCircle extends Circle implements Movable{

    public MovableCircle(int x, int y, double radius) {
        this.center = new MovablePoint(x,y);
        this.radius = radius;
    }

    @Override
    public void move(int x, int y) {
       setCenter(center.getX() + x, center.getY() + y);
    }
}
