package week2_OOP.Day_03.Exercises.Bai_01;

public class Main {
    // 1. Viết hàm nhận vào 1 chuỗi và trả về mảng có chứa ký tự đầu mà cuối (1d)
    public static void main(String[] args) {
        takeHeadAndTail("q");

    }

    public static String[] takeHeadAndTail(String str) {
        String[] strChar = new String[2];

        int length = str.length();
        System.out.println("Length: " + length);

        if (length > 0) {
            String firstChar = String.valueOf(str.charAt(0));
            String lastChar = String.valueOf(str.charAt(str.length() - 1));
            strChar[0] = firstChar;
            strChar[1] = lastChar;
        } else if (length == 1) {
            String charLetter = String.valueOf(str.charAt(0));
            strChar[0] = charLetter;
            strChar[1] = charLetter;
        } else {
            String empty = "";
            strChar[0] = empty;
            strChar[1] = empty;

        }
        System.out.println(strChar[0] + strChar[1]);

        return strChar;

    }
}
