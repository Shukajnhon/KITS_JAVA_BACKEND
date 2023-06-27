package week2_OOP.Day_01.Polymorohism;

// lớp cha (superclass) car
class Car {
    public void drive() {
        System.out.println("Car is driving.");
    }

    public void drive(int speed) {
        System.out.println("Car is driving at " + speed);
    }

}
