package Day_02.exercises;

public class Main {
    public static void main(String[] args) {
        // 1. Method thực hiện phép chia 2 số
        Chia2So chia2So = new Chia2So();
        int result = chia2So.chia_2_so(10, 2);
        System.out.println("a/b = " + result);

        // 2. Method lấy ký tự đầu tiên của 1 String

        System.out.println("l\u1EA5y t\u1EF1 \u0111\u1EA7u ti\u00EAn c\u1EE7a 1 String");

        Methods getFirstChar = new Methods();
        System.out.println(getFirstChar.getFirstChar("This is a string"));

        // 3. Method kiểm tra 1 số có phải là số chẵn hay không
        System.out.println(
                "// 3. Method ki\u1EC3m tra 1 s\u1ED1 c\u00F3 ph\u1EA3i l\u00E0 s\u1ED1 ch\u1EB5n hay kh\u00F4ng");
        Methods isEvenNumber = new Methods();
        isEvenNumber.isEven(4);

        // 4. Method tính tổng 2 kiểu dữ liệu có kiểu short

        System.out.println("t\u00EDnh t\u1ED5ng 2 ki\u1EC3u d\u1EEF li\u1EC7u c\u00F3 ki\u1EC3u short");
        Methods sum = new Methods();
        short shortNum_a = 10;
        short shortNum_b = 20;
        System.out.println("sum = " + sum.sumShortType(shortNum_a, shortNum_b));

        // 5.Method tính Factorial (nhập vào số nguyên)
        System.out.println("t\u00EDnh Factorial");
        Methods factorial = new Methods();
        int factorial_Num = 6;
        System.out.println("factorial: " + factorial.factorial(factorial_Num));

        // 6. Method tính trung bình cộng
        System.out.println("t\u00EDnh trung b\u00ECnh c\u1ED9ng");
        Methods average = new Methods();
        double[] averageArr = { 5, 6, 7, 8 };
        System.out.println("Average: " + average.tbCong(averageArr));

        // 7. Tìm giá trị lớn nhất của 2 số (tham số là 2 số có kiểu Integer);
        System.out.println("T\u00ECm gi\u00E1 tr\u1ECB l\u1EDBn nh\u1EA5t c\u1EE7a 2 s\u1ED1");
        Methods maxNum = new Methods();
        int[] numArr = { 5, 6, 7, 8 };
        System.out.println("Max number: " + maxNum.maxNumber(numArr));

        // 8.Tính cạnh huyền của một tam giác vuông (tham số là 2 cạnh góc vuông)
        System.out.println("T\u00EDnh c\u1EA1nh huy\u1EC1n c\u1EE7a m\u1ED9t tam gi\u00E1c vu\u00F4ng");
        Methods canhHuyenTamGiac = new Methods();
        double canh_A = 6;
        double canh_B = 8;
        System.out.println("canh huyen: " + canhHuyenTamGiac.canhHuyen(canh_A, canh_B));

        // 9. Method lấy ra ký tự cuối cùng của 1 String
        System.out.println("l\u1EA5y ra k\u00FD t\u1EF1 cu\u1ED1i c\u00F9ng c\u1EE7a 1 String");
        String str1 = "This is a String";
        Methods getLastChar = new Methods();
        System.out.println("lastChar: " + getLastChar.getLastChar(str1));

        // 10. Bài toán vẽ kim tự tháp bằng java
        System.out.println("v\u1EBD kim t\u1EF1 th\u00E1p");
        Methods pyramid = new Methods();
        pyramid.printPyramid(6);
    }

}
