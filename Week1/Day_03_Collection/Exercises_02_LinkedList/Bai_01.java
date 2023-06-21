package Day_03_Collection.Exercises_02_LinkedList;

import java.util.LinkedList;

public class Bai_01 {
    // Bài 1: Viết hàm cho phép thêm ký tự vào đầu hoặc cuối của 1 LinkedList
    public static void main(String[] args) {
        // Create an Array
        LinkedList<String> arr = new LinkedList<>();

        // add into arr
        arr.add("mid");
        System.out.println("Arr: " + arr);

        // add the first into arr
        arr.addFirst("head");
        System.out.println("Updated add 'head' ele at the First: " + arr);

        // add the last into arr
        arr.addLast("tail");
        System.out.println("Updated add 'tail' ele at the First: " + arr);
    }

}
