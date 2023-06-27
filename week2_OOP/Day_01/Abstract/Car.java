package week2_OOP.Day_01.Abstract;

public class Car {
    private String brand;
    private String color;
    private int year;

    // Constructor
    public Car(String brand, String color, int year) {
        this.brand = brand;
        this.color = color;
        this.year = year;
    }

    // Method
    public void start() {
        System.out.println("The car is starting");
    }

    public void drive() {
        System.out.println("The car is driving");
    }

    public void stop() {
        System.out.println("The car has stopped");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }

}
