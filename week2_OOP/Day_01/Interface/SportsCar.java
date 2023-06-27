package week2_OOP.Day_01.Interface;

public class SportsCar implements Car {
    private String brand;

    // Constructor
    public SportsCar(String brand) {
        this.brand = brand;
    }

    @Override
    public void start() {
        System.out.println(brand + " sports car is starting with roar!");
    }

    @Override
    public void stop() {
        System.out.println(brand + " sports car has stopped.");
    }

    @Override
    public void drive(double distance) {
        System.out.println(brand + " sports car is driving " + distance + " kilometers.");
    }

}
