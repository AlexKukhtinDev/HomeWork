package com.alexKukhtin.serialaizble;

public class Triangle implements Shape {
    private double side;

    public Triangle(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public void print() {
        System.out.print("Side is a: " + getSide());
    }
}
