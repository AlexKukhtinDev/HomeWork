package com.alexKukhtin.serialaizble;

public class Square implements Shape {
    private double radius;


    public Square(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


    @Override
    public void print() {
        System.out.print("Radius is a: " + getRadius());
    }
}
