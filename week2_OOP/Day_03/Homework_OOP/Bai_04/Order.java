package week2_OOP.Day_03.Homework_OOP.Bai_04;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> productsArr;

    public Order() {
        this.productsArr = new ArrayList<>();
    }

    // Add an product
    public void addProduct(Product product) {
        // System.out.println("Add product: " + product);
        productsArr.add(product);
        // System.out.println("ProductArr: " + productsArr);
    }

    // delete an product
    public void deleteProduct(Product product) {
        // System.out.println("Delete product: " + product);
        productsArr.remove(product);
        // System.out.println("ProductArr: " + productsArr);
    }

    // Calculate price
    public double calculatePrice() {
        double total = 0;
        for (Product product : productsArr) {
            total += product.getPrice();
        }
        return total;
    }

    // Get all Products
    public void getAllProducts() {
        // for (int product = 0; product < productsArr.size(); product++) {
        // System.out.println("Products: " + productsArr.get(product));
        // }
        System.out.println("ProductsArr: " + productsArr);
    }

    public List<Product> getProductsArr() {
        return productsArr;
    }

    public void setProductsArr(List<Product> productsArr) {
        this.productsArr = productsArr;
    }

}
