package exercises;

public class exercises3 {
    public static void main(String[] args) {
      // 3.Convert kiểu dữ liệu int sang long và ngược lại
    
      int intNumber = 10;
      long longNumber = 232343l;

      int convertToIntNumber = (int) longNumber;
      long convertToLongNumber = (long) intNumber;

      System.out.println("convertToIntNumber: "+ convertToIntNumber);   
      System.out.println("convertToLongNumber: "+ convertToLongNumber);


    }
}
