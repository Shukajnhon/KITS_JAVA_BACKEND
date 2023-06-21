package Day_03_Collection.Exercises_01_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Bai_02 {
    // Bài 2: Viết hàm cho phép lấy phần tử đầu và cuối của 1 ArrayList cho trước

    public static void main(String[] args) {

        List<String> arr01 = new ArrayList<>();
        List<String> arr02 = new ArrayList<>();

        // add els into arr01
        arr01.add("a");
        arr01.add("b");
        arr01.add("c");
        System.out.println("Elements in arr01: " + arr01);

        // add els into arr02
        arr02.add("a");
        System.out.println("Elements in arr02: " + arr02);

        // get First ele
        String firstEleOfArr01 = arr01.get(0);
        System.out.println("First ele of Arr01: " + firstEleOfArr01);

        String firstEleOfArr02 = arr02.get(0);
        System.out.println("First ele of Arr02: " + firstEleOfArr02);

        // get Last ele
        int lastIndexArr01 = arr01.size() - 1;
        // System.out.println("LastIndex: " + lastIndexArr01);
        int lastIndexArr02 = arr02.size() - 1;

        String lastEleOfArr01 = arr01.get(lastIndexArr01);
        System.out.println("Last el of arr01: " + lastEleOfArr01);

        String lastEleOfArr02 = arr02.get(lastIndexArr02);
        System.out.println("Last el of arr02: " + lastEleOfArr02);

    }
}
