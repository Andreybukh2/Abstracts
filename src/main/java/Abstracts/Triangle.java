package Abstracts;
import static Abstracts.Forms.*;
public class Triangle implements Shape {
    private final String color;
    private final double side1;
    private final double side2;
    private final double side3;

    public Triangle(double side1_hyp, double side2_cat, double side3_cat, String color) {
        this.color = color;
        this.side1 = side1_hyp;
        this.side2 = side2_cat;
        this.side3 = side3_cat;
    }
    @Override
    public String getName() {
        return String.valueOf(TRIANGLE);
    }
    @Override
    public String getColor() {
        return color;
    }
    @Override
    public double getSquare() {
        if ((side1 + side2 > side3) && (side2 + side3 > side1) && (side3 + side1 > side2) && ((side1 * side1 == (side2 * side2) + (side3 * side3)))) {
            System.out.println("Треугольник существует, он прямоугольный");
        } else {
            if ((side1 + side2 > side3) && (side2 + side3 > side1) && (side3 + side1 > side2)) {
                System.out.println("Треугольник существует и он разносторонний");
            } else {
                System.out.println("Треугольник с таким сочетанием сторон не существует");
            }
        }
        return Math.sqrt
                (((side1 + side2 + side3) / 2.0) *
                        (((side1 + side2 + side3) / 2.0) - side1) *
                        (((side1 + side2 + side3) / 2.0) - side2) *
                        (((side1 + side2 + side3) / 2.0) - side3));
    }
}