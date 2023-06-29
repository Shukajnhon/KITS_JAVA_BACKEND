package week2_OOP.Day_03.Exercises.Bai_04_Collection;

import java.util.ArrayList;
import java.util.List;

public class Main {
    // 4. Viết hàm nhận vào 1 mảng các ký tự, trả về 1 List<String> (1d)
    public static void main(String[] args) {
        System.out.println(convert(new String[] { "a", "b", "c" }));
        System.out.println(convert(new String[] {}));
    }

    static List<String> convert(String[] str) {
        List<String> arr = new ArrayList<>();

        for (String charLetter : str) {
            arr.add(charLetter);
        }

        return arr;
    }
}
