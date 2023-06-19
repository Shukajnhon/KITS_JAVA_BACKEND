package exercises;

public class exercises4 {
    public static void main(String[] args) {
      // 4.Convert kiểu dữ liệu String sang char[] và ngược lại
      
      String str = "This is a string";
      char[] arrChar = str.toCharArray();
      System.out.println(arrChar);
      String result = String.copyValueOf(arrChar);
      System.out.println(result); 

      for (char c : arrChar){
          System.out.println(c);
      }





    }
}
