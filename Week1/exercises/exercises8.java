package exercises;

public class exercises8 {
    public static void main(String[] args) {
        
        // int result = isLeapYear(2022);        
        int result = isLeapYear(2020);

        System.out.println(result);


    }
  public static  int isLeapYear(int year){
        if(year % 4 == 0){
            return 1;
        }else{
            return 0;
        }

        // year % 4 == 0 ? return 1 : return 0;
    }
}
