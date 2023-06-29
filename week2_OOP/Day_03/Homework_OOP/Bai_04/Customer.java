package week2_OOP.Day_03.Homework_OOP.Bai_04;

public class Customer {
    private String name;
    private String phoneNumber, address;
    Order order;

    // Constructor
    public Customer(String name, String phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.order = new Order();
    }

    // Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // methods

    // Add a product
    public void addProductToList(Product product) {
        System.out.println("Add product: " + product);
        order.addProduct(product);
        System.out.println("ProductArr: " + order.getProductsArr().toString());
    }

    // Delete Product
    public void deleteProductInList(Product product) {
        System.out.println("Delete product: " + product);
        order.deleteProduct(product);
        System.out.println("ProductArr: " + order.getProductsArr().toString());
    }

    // get All product
    public void getAllProductsInList() {
        System.out.println("===== All products =====");
        order.getAllProducts();
    }

    // getProductPrice
    public void getProductPrice() {
        double totalPrice = order.calculatePrice();
        System.out.println("Total Price: " + totalPrice);
    }

    @Override
    public String toString() {
        return "Customer [name=" + name + ", phoneNumber=" + phoneNumber + ", address=" + address + ", order=" + order
                + "]";
    }

}
