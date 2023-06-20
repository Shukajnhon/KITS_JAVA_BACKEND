package Day_02.exercises;

public class Methods {

    // 2. Method lấy ký tự đầu tiên của 1 String
    public char getFirstChar(String str) {
        char firstChar = str.charAt(0);
        return firstChar;
    }

    // 3. Method kiểm tra 1 số có phải là số chẵn hay không
    public void isEven(int a) {
        if (a != 0) {
            if (a % 2 == 0) {
                System.out.println(a + " là số chẵn");
            } else {
                System.out.println(a + " là số lẻ");
            }
        } else {
            System.out.println(a + " không phải là số chẵn, không phải là số lẻ");
        }
    }

    // 4. Method tính tổng 2 kiểu dữ liệu có kiểu short
    public short sumShortType(short a, short b) {
        return (short) (a + b);
    }

    // 5.Method tính Factorial (nhập vào số nguyên)
    public long factorial(int a) {
        long factorial = 1;
        if (a >= 0) {
            if (a == 0 || a == 1) {
                return factorial;
            } else {
                for (int i = 2; i <= a; i++) {
                    factorial *= i;
                }
                return factorial;
            }
        } else {
            return -1;
        }

    }

    // 6. Method tính trung bình cộng
    public double tbCong(double[] arr) {
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
            System.out.println(arr[i]);
        }
        double average = total / arr.length;
        return average;
    }

    // 7. Tìm giá trị lớn nhất của 2 số (tham số là 2 số có kiểu Integer)
    public int maxNumber(int[] arr) {
        int maxNumber = arr[0];
        for (int num : arr) {
            if (num > maxNumber) {
                maxNumber = num;
            }
        }
        return maxNumber;
    }

    // 8. Tính cạnh huyền của một tam giác vuông (tham số là 2 cạnh góc vuông)
    public double canhHuyen(double a, double b) {
        if (a > 0 && b > 0) {
            double canhHuyenTamGiacVuong = Math.sqrt((a * a) + (b * b));
            return canhHuyenTamGiacVuong;
        } else {
            return -1;
        }

    }

    // 9. Method lấy ra ký tự cuối cùng của 1 String
    public char getLastChar(String str) {
        char lastChar = str.charAt(str.length() - 1);
        return lastChar;
    }

    // 10. Bài toán vẽ kim tự tháp bằng java
    public void printPyramid(int a) {
        int hight = a;
        int k = 0;
        for (int i = 1; i <= hight; ++i, k = 0) {
            // System.out.println("i : " + i);
            for (int space = 1; space <= hight - i; ++space) {
                System.out.print("  ");
            }
            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }
            System.out.println();
        }
    }
}
