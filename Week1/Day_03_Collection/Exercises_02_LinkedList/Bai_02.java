package Day_03_Collection.Exercises_02_LinkedList;

import java.util.LinkedList;

public class Bai_02 {
    // Bài 2: Viết hàm cho phép xóa ký tự tại 1 ví trí nhập vào
    public static void main(String[] args) {
        // create an arr
        LinkedList<String> arr = new LinkedList<>();

        // Add els into arr
        arr.add("a");
        arr.add("b");
        arr.add("c");
        System.out.println("Arr: " + arr);

        // remove an ele
        arr.remove(0);
        System.out.println("Updated arr: " + arr);
        arr.remove(1);
        System.out.println("Updated arr: " + arr);

    }
}
