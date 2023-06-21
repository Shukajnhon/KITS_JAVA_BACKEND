package Day_03_Collection.Exercises_01_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Bai_05 {
    // Bài 5: Viết hàm biến đổi các ký tự của 1 Array thành vị trí của chính nó
    public static void main(String[] args) {

        List<String> arr = new ArrayList<>();

        // Add els into arr
        arr.add("x");
        arr.add("y");
        arr.add("z");
        System.out.println("ArrayList: " + arr);

        for (int index = 0; index < arr.size(); index++) {
            // System.out.println(index);
            // Convert int to String
            String indexString = String.valueOf(index);
            arr.set(index, indexString);
        }

        System.out.println("Transform arr: " + arr);

    }
}
