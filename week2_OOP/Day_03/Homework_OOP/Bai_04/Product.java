package week2_OOP.Day_03.Homework_OOP.Bai_04;

public class Product {
    private String NameOfProduct;
    private double price;
    private int quantity;

    // Constructor
    public Product(String nameOfProduct, double price, int quantity) {
        NameOfProduct = nameOfProduct;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter and Setter

    public String getNameOfProduct() {
        return NameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        NameOfProduct = nameOfProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product [NameOfProduct=" + NameOfProduct + ", price=" + price + ", quantity=" + quantity + "]";
    }

}
