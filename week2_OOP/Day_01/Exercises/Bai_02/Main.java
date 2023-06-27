package week2_OOP.Day_01.Exercises.Bai_02;

public class Main {
    public static void main(String[] args) {
        System.out.println("====== CIRCLE ====== ");
        Circle circle = new Circle(4);
        circle.calculateArea();
        circle.calculatePerimeter();

        System.out.println("====== RECTANGLE ====== ");
        Rectangle rectangle = new Rectangle(4, 5);
        rectangle.calculateArea();
        rectangle.calculatePerimeter();

        System.out.println("====== TRIANGLE ====== ");
        Triangle triangle = new Triangle(10, 20, 15);
        triangle.calculateArea();
        triangle.calculatePerimeter();
    }
}
