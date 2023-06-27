package week2_OOP.Day_01.Abstract;

public class Main {
    public static void main(String[] args) {
        // Car car = new Car("Kia", "red", 2020);

        // car.displayInfo();

        // abstract
        // CarAbstract carAbstract = new SportsCar("Ferrari", "Red", 1000000);
        // carAbstract.start();
        // carAbstract.displayInfo();
        // carAbstract.stop();

        SportsCar sportsCar = new SportsCar("Ferrari", "Red", 1000000);
        sportsCar.getPrice();

    }
}
