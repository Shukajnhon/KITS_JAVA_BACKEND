package Day_03_Collection.Exercises_01_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Bai_04 {
    // Viết hàm cho phép chuyển toàn bộ nội dung của 1 Array sang 1 Array còn lại

    public static void main(String[] args) {
        List<String> left = new ArrayList<>();
        List<String> right = new ArrayList<>();

        // Add els into left
        left.add("x");
        left.add("y");
        System.out.println("Left: " + left);

        // Add els into right
        right.add("z");
        System.out.println("Right: " + right);

        right.addAll(left);
        left.clear();

        System.out.println("Updated left: " + left);
        System.out.println("Updated right: " + right);

    }
}
