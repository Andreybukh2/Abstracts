package Abstracts;

import static org.junit.jupiter.api.Assertions.*;

class getSquareTest {
    @org.junit.jupiter.api.Test
    void getSquare() {
       Triangle triangle = new Triangle(5,4,3,"Color");
        assertEquals(6.0, triangle.getSquare());
        assertEquals("Color", triangle.getColor());
        assertEquals("ТРЕУГОЛЬНИК", triangle.getName());

        Rectangle rectangle = new Rectangle(5,4,"Color");
        assertEquals(20.0, rectangle.getSquare());
        assertEquals("Color", rectangle.getColor());
        assertEquals("ПРЯМОУГОЛЬНИК", rectangle.getName());

        Circle circle = new Circle(5,"Color");
        assertEquals(78.53750000000001, circle.getSquare());
        assertEquals("Color", circle.getColor());
        assertEquals("КРУГ", circle.getName());
    }
}