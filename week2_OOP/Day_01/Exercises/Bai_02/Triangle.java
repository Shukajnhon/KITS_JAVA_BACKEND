package week2_OOP.Day_01.Exercises.Bai_02;

public class Triangle extends Shape {

    double canh_a;
    double canh_b;
    double canh_c;

    // Constructor
    public Triangle(double canh_a, double canh_b, double canh_c) {
        this.canh_a = canh_a;
        this.canh_b = canh_b;
        this.canh_c = canh_c;
    }

    @Override
    public void calculateArea() {
        if (canh_a >= 0 && canh_b >= 0) {
            double result = 0.5 * (canh_a * canh_b);
            System.out.println("Area: " + result);
        } else {
            System.out.println("Enter positive number");
        }

    }

    @Override
    public void calculatePerimeter() {
        if (canh_a >= 0 && canh_b >= 0 & canh_c >= 0) {
            double result = canh_a + canh_b + canh_c;
            System.out.println("Perimeter: " + result);
        } else {
            System.out.println("Enter positive number");
        }

    }

}
