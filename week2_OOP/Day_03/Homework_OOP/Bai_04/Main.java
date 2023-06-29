package week2_OOP.Day_03.Homework_OOP.Bai_04;

public class Main {
    // 4. Hệ thống bán hàng: Xây dựng một hệ thống bán hàng đơn giản với các lớp như
    // Product, Order và Customer. Hệ thống này cần cho phép khách hàng đặt hàng,
    // thêm/xóa sản phẩm trong giỏ hàng và tính tổng số tiền.
    public static void main(String[] args) {
        // create products object
        Product product1 = new Product("iPhone 14 Pro max", 1200, 1);
        Product product2 = new Product("AirPods 2", 200, 1);

        // Create Customer object
        Customer customer1 = new Customer("Toàn", "097xxxxx", "HCM");

        // customer add product
        customer1.addProductToList(product2);
        customer1.addProductToList(product1);

        // Customer delete products
        // customer1.deleteProductInList(product2);

        // get All products
        customer1.getAllProductsInList();

        // get total price
        customer1.getProductPrice();

    }
}
