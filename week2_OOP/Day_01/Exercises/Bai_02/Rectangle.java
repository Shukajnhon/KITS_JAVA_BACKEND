package week2_OOP.Day_01.Exercises.Bai_02;

public class Rectangle extends Shape {
    double chieuDai;
    double chieuRong;

    // Constructor
    public Rectangle(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    @Override
    public void calculateArea() {
        if (chieuDai >= 0 && chieuRong >= 0) {
            double result = chieuDai * chieuRong;
            System.out.println("Area: " + result);
        } else {
            System.out.println("Enter positive number");
        }
    }

    @Override
    public void calculatePerimeter() {
        if (chieuDai >= 0 && chieuRong >= 0) {
            double result = (chieuDai + chieuRong) * 2;
            System.out.println("Perimeter: " + result);
        } else {
            System.out.println("Enter positive number");
        }
    }

}
