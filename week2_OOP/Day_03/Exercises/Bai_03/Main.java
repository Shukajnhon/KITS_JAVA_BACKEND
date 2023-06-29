package week2_OOP.Day_03.Exercises.Bai_03;

public class Main {
    // Viết hàm nhận vào 1 chuỗi trả về chuỗi chỉ có các ký tự ở vị trí lẻ (2d)
    public static void main(String[] args) {
        // takeOddOnly("xyz");
        takeOddOnly("abcd");
        // takeOddOnly(" ");

    }

    static String[] takeOddOnly(String str) {
        int length = str.length();

        String charStr[] = new String[10];

        if (length > 0) {
            for (int i = 0; i < str.length(); i += 2) {
                System.out.println(str.charAt(i));
                charStr[i] = String.valueOf(str.charAt(i));
            }
        } else if (length == 0) {
            String empty = " ";
            charStr[0] = empty;
            return charStr;
        }
        return charStr;

    }
}
