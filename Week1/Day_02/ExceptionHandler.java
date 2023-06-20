package Day_02;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandler {
    public static void main(String[] args) {
        try {
            processFile("Example.txt");
            double result = divide(10, 0);
            System.out.println("result: " + result);
        } catch (Exception e) {
            System.out.println("Đã xảy ra lỗi: " + e.getMessage());
        }
    }

    // methods
    public static double divide(double a, double b) {
        try {
            return a / b;
        } catch (Exception e) {
            return 0d;
        }
    }

    public static void processFile(String filename) throws IOException {
        Integer devide = 10 / 0;
        System.out.println("Devide" + devide);
        FileReader fileReader;
        fileReader = new FileReader(filename);
        fileReader.close();
    }
}
