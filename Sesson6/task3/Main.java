package Sesson6.task3;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        Shape circle = new Circle(3);

        calculateAndPrintArea(rectangle); // Выведет площадь прямоугольника
        calculateAndPrintArea(circle);    // Выведет площадь круга
    }

    public static void calculateAndPrintArea(Shape shape) {
        double area = shape.getArea();
        System.out.println("Площадь фигуры: " + area);
    }
}