package week2_OOP.Day_01.Interface;

public class Sedan implements Car {
    private String brand;

    // Constructor
    public Sedan(String brand) {
        this.brand = brand;
    }

    @Override
    public void start() {
        System.out.println(brand + " sedan is starting smoothly");
    }

    @Override
    public void stop() {
        System.out.println(brand + " sedan has come to a stop.");
    }

    @Override
    public void drive(double distance) {
        System.out.println(brand + " sedan is driving " + distance + " kilometers.");
    }
}
