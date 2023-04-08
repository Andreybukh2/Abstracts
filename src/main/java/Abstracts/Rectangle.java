package Abstracts;

import static Abstracts.Forms.*;

public class Rectangle implements Shape {
    private final String color;
    private final double height;
    private final double width;


    public Rectangle (double h, double w, String color){
        this.color = color;
        this.height = h;
        this.width = w;
    }
    @Override
    public String getName() {
        return String.valueOf(RECTANGLE);
    }
    @Override
    public String getColor() {
        return color;
    }
    @Override
    public double getSquare() {
        return height * width;
    }
}
