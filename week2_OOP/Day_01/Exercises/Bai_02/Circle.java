package week2_OOP.Day_01.Exercises.Bai_02;

public class Circle extends Shape {
    double radius;
    final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        if (radius >= 0) {
            double result = radius * radius * PI;
            System.out.println("Area: " + result);
        } else {
            System.out.println("please enter Radius Positive");
        }

    }

    @Override
    public void calculatePerimeter() {
        if (radius >= 0) {
            double result = radius * 2 + PI;
            System.out.println("Perimeter: " + result);
        } else {
            System.out.println("please enter Radius Positive");
        }

    }

}
