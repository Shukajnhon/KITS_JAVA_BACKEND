
package exercises;

import java.util.Scanner;

public class exercises10 {
    public static void main(String[] args) {
        // 4. pyramid
    Scanner sc = new Scanner(System.in);
    int hight;
    System.out.printf("\n\nNhập vào chiều cao của kim thu thap: ");
    hight = sc.nextInt();
    for (int i = 1; i <= hight; ++i) {
      for (int j = 1; j <= i; ++j) {
        System.out.print(j+ " ");
      }
      System.out.println();
    }

    }

   
}



// public static void main(String[] args) {
   
 
   