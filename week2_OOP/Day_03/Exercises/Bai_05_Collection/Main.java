package week2_OOP.Day_03.Exercises.Bai_05_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    // 5. Viết hàm swap 2 vị trí trong 1 collection (2d)
    public static void main(String[] args) {
        List<String> strs = new ArrayList<>(List.of("a", "b", "c", "d"));
        swap(strs, 0, 3);
        swap(strs, 1, 2);
    }

    static void swap(List<String> strs, int first, int second) {

        System.out.println(strs);

        Collections.swap(strs, first, second);

        System.out.println("strs after swap: " + strs);
    }
}
