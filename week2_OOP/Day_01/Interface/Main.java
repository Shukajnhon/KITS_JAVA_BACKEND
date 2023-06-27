package week2_OOP.Day_01.Interface;

public class Main {

    public static void main(String[] args) {

        // create new sports car object
        Car sportCar = new SportsCar("Ferrari");
        sportCar.start();
        sportCar.drive(100.5);
        sportCar.stop();

        // create new sedan car object
        Car sedanCar = new Sedan("Toyota");
        sedanCar.start();
        sedanCar.drive(80);
        sedanCar.stop();

    }

}
