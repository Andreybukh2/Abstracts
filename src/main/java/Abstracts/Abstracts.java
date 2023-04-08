package Abstracts;
import java.util.ArrayList;
import static Abstracts.Shape.printShapes;

public class Abstracts {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
//        Shape shape = new Circle(6,"Красный"); Это сработал Полиморфизм и наследование
//        потому Circle является наследником интерфейса Shape и тоже является фигурой,
//        поэтому так возможно создать новый экземпляр;
        shapes.add(new Circle(9,"Красный"));
        shapes.add(new Rectangle(3,5, "Синий"));
        shapes.add(new Triangle(5,3,4,"Зеленый"));
        shapes.add(new Triangle(1,3,4,"Оранжевый"));

        printShapes(shapes);
    }
}