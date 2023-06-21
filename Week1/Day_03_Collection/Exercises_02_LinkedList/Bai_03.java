package Day_03_Collection.Exercises_02_LinkedList;

import java.util.LinkedList;

public class Bai_03 {
    // Bài 3: Viết hàm cho phép chuyển toàn bộ dữ liệu của mảng bên trái qua phải
    public static void main(String[] args) {
        // Create two array
        LinkedList<String> left = new LinkedList<>();
        LinkedList<String> right = new LinkedList<>();

        // Add els into left
        left.add("a");
        left.add("b");
        left.add("c");
        System.out.println("left: " + left);
        System.out.println("Right: " + right);

        // add els from left arr
        right.addAll(left);
        System.out.println("Right after added: " + right);

        // clear els left
        left.clear();
        System.out.println("Left after clearing " + left);

    }
}
