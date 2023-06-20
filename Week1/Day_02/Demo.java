package Day_02;

public class Demo {
    interface MathOperation {
        int operate(int a, int b);
    }

    public static void main(String[] args) {
        MathOperation addition = ((a, b) -> a + b);
        int result = addition.operate(3, 4);
        System.out.println("Result: " + result);
    }
}
