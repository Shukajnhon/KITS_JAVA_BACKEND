package exercises;

public class exercises9 {
    public static void main(String[] args) {
        // 4. Nhập vào số Nguyên, in ra tất cả số chẵn bắt đầu từ 0;

        printEven(5);
    }

    public static void printEven(int n){
        for(int i = 1; i<=n; i++){
            if(i % 2 == 0){
                System.out.println("even: "+ i);
            }
        }
    }
}
