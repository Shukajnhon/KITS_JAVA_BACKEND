package Day_04.Exercises_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class Bai_01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int luaChon = 0;

        do {
            System.out.println("===Choosing Number===");
            System.out.println("Nhập 0 để thoát");
            System.out.println("1. Tạo một ArrayList chứa các số nguyên và tính tổng của tất cả các phần tử");
            System.out.println("2. Viết một chương trình để tạo một HashSet từ một ArrayList.");
            System.out.println(
                    "3. Tạo một LinkedList chứa các chuỗi và đảo ngược thứ tự của các phần tử trong danh sách.");
            System.out.println("4. Viết một phương thức để tìm phần tử lớn nhất trong một ArrayList.");
            System.out.println("5. Tạo một HashMap chứa các tên và điểm số của sinh viên và in ra tất cả các mục.");
            System.out.println(
                    "6. Viết một phương thức để kiểm tra xem một ArrayList có chứa một giá trị cụ thể hay không.");
            System.out
                    .println("9. Viết một chương trình để thêm tất cả các phần tử của một ArrayList vào một HashSet.");

            System.out.println("10. Xóa các phần tử trùng lặp từ một ArrayList.");
            System.out.println("11. Viết một phương thức để sao chép một ArrayList sang một ArrayList mới.");
            System.out.println("14. Kiểm tra xem một ArrayList có rỗng hay không.");
            luaChon = sc.nextInt();
            switch (luaChon) {
                case 1:
                    sum();
                    break;
                case 2:
                    createHashSetFromArrayList();
                    break;
                case 3:
                    reverseString();
                case 4:
                    findMaxNumber();
                    break;
                case 5:
                    printNamesAndScores();
                case 6:
                    System.out.println("case 6");

                case 9:
                    System.out.println("case 9");
                    addElsIntoHashSetArr();
                    break;
                case 10:
                    System.out.println("case 10");
                    deleteElsDuplicate();
                    break;
                case 11:
                    System.out.println("11");
                    copyArr();
                case 14:
                    System.out.println("case 14");
                default:
                    break;
            }

        } while (luaChon != 0);

    }

    // Methods
    // 1. Tạo một ArrayList chứa các số nguyên và tính tổng của tất cả các phần tử.
    public static void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng: ");
        int length = sc.nextInt();

        // create an Array
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= length; i++) {
            System.out.println("Nhập số thứ " + i);
            int number = sc.nextInt();
            numbers.add(number);
        }

        // tính tổng els into numbers Arr
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(numbers);
        System.out.println("Sum = " + sum);
    }

    // 2. Viết một chương trình để tạo một HashSet từ một ArrayList.
    public static void createHashSetFromArrayList() {

        Scanner sc = new Scanner(System.in);

        // add els into Arraylist
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("nhập số phần tử muốn thêm vào mảng: ");
        int length = sc.nextInt();
        for (int i = 1; i <= length; i++) {
            System.out.println("Nhập số thứ " + i + " :");
            int number = sc.nextInt();
            arr.add(number);
        }

        // create a HashSet from ArrayList
        HashSet<Integer> hashSet = new HashSet<>(arr);

        System.out.println("ArrayList: " + arr);
        System.out.println("HashSet Arr: " + hashSet);

        // NOTE hashSet It does not allow duplicates

    }

    // 3. Tạo một LinkedList chứa các chuỗi và đảo ngược thứ tự của các phần tử
    // trong danh sách.
    public static void reverseString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài danh sách: ");
        int lengthList = sc.nextInt();
        sc.nextLine(); // fixing duplicate line
        // create a stringLinkedList arr
        LinkedList<String> stringLinkedList = new LinkedList<>();

        // Add els into arr
        for (int i = 1; i <= lengthList; i++) {
            System.out.println("chuỗi thứ " + i + " :");
            String str = sc.nextLine();
            stringLinkedList.add(str);
        }
        System.out.println(stringLinkedList);

        // reverse stringLinkedList
        Collections.reverse(stringLinkedList);
        System.out.println("After reversing" + stringLinkedList);
    }

    // 4. Viết một phương thức để tìm phần tử lớn nhất trong một ArrayList.
    public static void findMaxNumber() {

        LinkedList<Integer> arr = new LinkedList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng: ");
        int length = sc.nextInt();

        for (int i = 1; i <= length; i++) {
            System.out.println("Nhập vào số thứ " + i + " :");
            int number = sc.nextInt();
            arr.add(number);
        }
        System.out.println("Mảng ban đầu: " + arr);

        // find MAX ele in arr by using Collections
        int maxNumber = Collections.max(arr);
        System.out.println("MaxNumber: " + maxNumber);

    }

    // 5. Tạo một HashMap chứa các tên và điểm số của sinh viên và in ra tất cả các
    // mục.
    public static void printNamesAndScores() {
        HashMap<String, Integer> hashMapStudents = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số lượng sinh viên muốn thêm vào: ");
        int length = sc.nextInt();
        sc.nextLine();
        // Add els into hashMapStudents
        // hashMapStudents.put(null, null);
        for (int i = 1; i <= length; i++) {
            System.out.println("Nhập vào name sv " + i);
            String key = sc.nextLine();
            System.out.println("Nhập vào điểm sv " + i);
            Integer value = sc.nextInt();
            sc.nextLine();
            hashMapStudents.put(key, value);
        }

        System.out.println("hashMapStudents: " + hashMapStudents);

    }

    // 6. Viết một phương thức để kiểm tra xem một ArrayList có chứa một giá trị cụ
    // thể hay không.
    public static void isSpecificValue() {
        ArrayList<Integer> arr = new ArrayList<>();
    }

    // 9. Viết một chương trình để thêm tất cả các phần tử của một ArrayList vào một
    // HashSet.
    public static void addElsIntoHashSetArr() {
        // Create an ArrList
        ArrayList<Integer> arrayListNumbers = new ArrayList<>();

        // add els into arrayListNumbers
        arrayListNumbers.add(10);
        arrayListNumbers.add(20);
        arrayListNumbers.add(30);
        arrayListNumbers.add(10);

        System.out.println("ArrayList: " + arrayListNumbers);

        // Create an hashSet arr
        HashSet<Integer> arrHashSetNumbers = new HashSet<>();

        // add all els from ArrayList into ArrHashSet
        arrHashSetNumbers.addAll(arrayListNumbers);
        System.out.println("arrHashSet: " + arrHashSetNumbers);
        // NOTE hashMap IS NOT allowed to add duplicate els

    }

    // 10. Xóa các phần tử trùng lặp từ một ArrayList.
    public static void deleteElsDuplicate() {
        // Create an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add els into arr
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20); // duplicate
        numbers.add(10); // duplicate
        numbers.add(50);
        System.out.println("ArrayList: " + numbers);

        // create numberHashMap arr
        Set<Integer> numberHashMap = new HashSet<>();

        // using numberHashMap to reject duplicate els
        numberHashMap.addAll(numbers);
        System.out.println("numberHashMap: " + numberHashMap);

        // clearing numbers arr
        numbers.clear();
        System.out.println("ArrayList after clearing: " + numbers);

        // add els from numberHashMap to numbers arr
        numbers.addAll(numberHashMap);

        // Sort els by Increasing
        Collections.sort(numbers);
        System.out.println("Delete duplicates els: " + numbers);

    }

    // 11. Viết một phương thức để sao chép một ArrayList sang một ArrayList mới.
    public static void copyArr() {
        // Create an Arr
        ArrayList<Integer> numbers = new ArrayList<>();

        // add els into numbersArr
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(10); // duplicate
        numbers.add(50);
        System.out.println("ArrayList: " + numbers);

        // Create a New Array
        // Object clone()
        ArrayList<Integer> copyNumbersArr = new ArrayList<>();
        System.out.println("Origin copyNumbersArr: " + copyNumbersArr);

        copyNumbersArr = (ArrayList<Integer>) numbers.clone();

        System.out.println("Updated copyNumbersArr after clone from numbersArr: " + copyNumbersArr);

    }

    // 14. Kiểm tra xem một ArrayList có rỗng hay không.

}
