package com.alexKukhtin.serialaizble;

import java.util.List;

public class XmlWriter {
    public static String encode(Shape shape) {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n";
        xml += encodeShape(shape);
        return xml;
    }

    private static String encodeShape(Shape shape) {
        String xml = "";
        if (shape instanceof Triangle) {
            xml += encodeTriangle((Triangle) shape);
        } else if (shape instanceof Square) {
            xml += encodeSquare((Square) shape);
        } else if (shape instanceof Circle) {
            xml += encodeCircle((Circle) shape);
        } else if (shape instanceof Group) {
            xml += encodeGroup((Group) shape);
        }
        return xml;
    }

    private static String encodeTriangle(Triangle triangle) {
        String xml = "<Triangle>\n";
        xml += "\t<side>" + triangle.getSide() + "</side>\n";
        xml += "</Triangle>\n";
        return xml;
    }

    private static String encodeSquare(Square square) {
        String xml = "<Square>\n";
        xml += "\t<side>" + square.getRadius() + "</side>\n";
        xml += "</Square>\n";
        return xml;
    }

    private static String encodeCircle(Circle circle) {
        String xml = "<Circle>\n";
        xml += "\t<area>" + circle.getArea() + "</area>\n";
        xml += "</Circle>\n";
        return xml;
    }

    private static String encodeGroup(Group group) {
        StringBuilder xml = new StringBuilder();
        xml.append("<Group>\n\t<shapes>\n");
        List<Shape> shapes = group.getShapes();
        for (Shape shape : shapes) {
            String[] line = encodeShape(shape).split("\n");
            for (String aline : line) {
                xml.append("\t\t").append(aline).append("\n");
            }
        }
        xml.append("\t</shapes>\n</Group>\n");
        return xml.toString();
    }
}