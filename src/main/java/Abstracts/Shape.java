package Abstracts;
import java.util.ArrayList;

public interface Shape {
    String getName();
    String getColor();
    double getSquare();
    static void printShapes(ArrayList<Shape> shapes){
        for (Shape shape : shapes){
            System.out.println("Название фигуры: " + shape.getName());
            System.out.println("Площадь фигуры: " + shape.getSquare());
            System.out.println("Цвет фигуры: " + shape.getColor() + "\n");
        }
    }
}