package week2_OOP.Day_01.Abstract;

abstract class CarAbstract {
    private String brand;
    private String color;

    // Constructor
    public CarAbstract(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    // Methods
    public abstract void start(); // Phương thức trừu tượng

    public void stop() {
        System.out.println("Car has stopped");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
    }

}
