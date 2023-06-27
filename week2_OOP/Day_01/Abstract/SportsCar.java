package week2_OOP.Day_01.Abstract;

class SportsCar extends CarAbstract {
    private int price;

    public SportsCar(String brand, String color, int price) {
        super(brand, color); // parent constructor
        this.price = price;
    }

    @Override
    public void start() {
        System.out.println("Sports car is starting with a road");
    }

    public void getPrice() {
        System.out.println("===== DISPLAY INFO ===== ");
        super.displayInfo();
        System.out.println("Price: " + price);
    }

}
