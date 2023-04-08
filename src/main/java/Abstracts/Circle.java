package Abstracts;

import static Abstracts.Forms.*;

public class Circle implements Shape {
    private final String color;
    private final double radius;
    public Circle (double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    @Override
    public String getName() {
        return String.valueOf(CIRCLE);
    }
    @Override
    public String getColor() {
        return color;
    }
    @Override
    public double getSquare() {
        return 3.1415  * radius * radius;
    }
}