package com.alexKukhtin.serialaizble;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class JsonWriter {
    public static String encode(Shape shape) {
        String json = "{";
        json += encodeShape(shape);
        json += "\n}";
        return json;
    }

    private static String encodeShape(Shape shape) {
        String json = "";
        if (shape instanceof Triangle) {
            json += encodeTriangle((Triangle) shape);
        } else if (shape instanceof Square) {
            json += encodeSquare((Square) shape);
        } else if (shape instanceof Circle) {
            json += encodeCircle((Circle) shape);
        } else if (shape instanceof Group) {
            json += encodeGroup((Group) shape);
        }
        return json;
    }

    private static String encodeTriangle(@NotNull Triangle triangle) {
        String json = "\t\"Triangle\" : {\n";
        double side = triangle.getSide();
        for (int index = 0; index < 1; index++) {
            json += "\t\t\"side\"" + index + " : ";
            json += "\"" + side + "\"";
            json += ",\n";
        }
        return json;
    }

    private static String encodeSquare(@NotNull Square square) {
        String json = "\t\"Square\" : {\n";
        json += "\t\t\"radius\" : \"" + square.getRadius() + "\"\n";
        json += "\t}";
        return json;
    }

    private static String encodeCircle(@NotNull Circle circle) {
        String json = "\t\"Circle\" : {\n";
        json += "\t\t\"Area\" : \"" + circle.getArea() + "\"\n";
        json += "\t}";
        return json;
    }

    @NotNull
    private static String encodeGroup(@NotNull Group group) {
        StringBuilder json = new StringBuilder();
        json.append("\t\"Group\" : {\n");
        List<Shape> shapes = group.getShapes();
        for (Shape shape : shapes) {
            String[] lines = encodeShape(shape).split("\n");
            for (String line : lines) {
                json.append("\t").append(line).append("\n");
            }
            json.setCharAt(json.length() - 1, ',');
            json.append("\n");
        }
        json.deleteCharAt(json.length() - 2);
        json.append("\t}");
        return json.toString();
    }
}
