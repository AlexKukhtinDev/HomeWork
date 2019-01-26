package com.alexKukhtin.serialaizble;

public class Circle implements Shape {
    private double area;


    public Circle(double area) {
        this.area = area;

    }

    public double getArea() {
        return area;
    }

    @Override
    public void print() {
        System.out.print("Area is a: " + getArea());
    }
}
