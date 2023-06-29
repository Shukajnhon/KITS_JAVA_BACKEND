package week2_OOP.Day_03.Exercises.Bai_02;

public class Main {
    // 2. Viết hàm nhận vào 1 chuỗi và trả về ký tự ở giữa (1d)

    public static void main(String[] args) {
        System.out.println((takeMiddle("abc")));

    }

    static String takeMiddle(String str) {

        String result;
        int length = str.length();
        int middle = length / 2;
        result = String.valueOf(str.charAt(middle));
        System.out.println("Value of: " + result);

        return result;
    }
}
