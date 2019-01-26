package com.alexKukhtin.serialaizble;

import java.util.ArrayList;
import java.util.List;

public class DemoTestSerializble {
    public static void main(String[] args) {
        List<Shape> list1 = new ArrayList<>();
        list1.add(new Triangle(3));
        list1.add(new Square(20.5));
        list1.add(new Circle(30.5));
        Shape group1 = new Group(list1);

        List<Shape> list2 = new ArrayList<>();
        list2.add(new Triangle(12.0));
        list2.add(new Square(30.4));
        list2.add(new Circle(32.5));
        list2.add(group1);
        Shape group2 = new Group(list2);

        List<Shape> list3 = new ArrayList<>();
        list3.add(new Triangle(12.3));
        list3.add(new Square(18.2));
        list3.add(new Circle(5.5));
        Shape group3 = new Group(list3);

        List<Shape> list4 = new ArrayList<>();
        list4.add(new Triangle(0.9));
        list4.add(new Square(105.1));
        list4.add(new Circle(22.32));
        list4.add(group3);
        list4.add(group2);
        Shape allGroup = new Group(list4);

        System.out.println("XML");
        System.out.println(XmlWriter.encode(allGroup));
        System.out.println("---------------------------------");
        System.out.println("JSON");
        System.out.println(JsonWriter.encode(allGroup));
    }
}
