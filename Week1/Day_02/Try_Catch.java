package Day_02;

public class Try_Catch {
    public static void main(String[] args) {
        try {
            int[] numbers = { 1, 2, 3 };
            int results = divide(numbers, 0);
            System.out.println("Result: " + results);
        } catch (ArithmeticException ex) {
            System.out.println("ArithmeticException: " + ex.getMessage());
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("ArrayIndexOutOfBoundsException: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Generic Exception: " + ex.getMessage());
        } finally {
            System.out.println("Cleanup code  goes here");
        }
    }

    // methods
    public static int divide(int[] numbers, int divisor) {
        int result = 0;
        try {
            result = numbers[0] / divisor;
        } catch (ArithmeticException ex) {
            throw ex;
        } catch (ArrayIndexOutOfBoundsException ex) {
            throw ex;
        }
        return result;
    }
}
