public class Demo {
    public static void main(String[] args) {
        Integer myNumber;
        myNumber = 10;
        System.out.println("myNumber:" + myNumber) ;


        final int MAX_VALUE = 100;
        // MAX_VALUE = 10;
        System.out.println("MAX_VALUE: "+ MAX_VALUE);
// ========================
        // String numString = "123";
        // Integer number = Integer.parseInt(numString);

        // System.out.println("numberString: "+  numString);
        // System.out.println("number: "+ number);

        //  =========Control Statements===============
         //  =========IF===============
        // System.out.println("=========IF===============");
        // int num = 5;
        // if(num>0){
        //     System.out.println("The number is positive.");
        // }else if (num < 0){
        //     System.out.println("The number is negative.");
        // }else{
        //     System.out.println("The number is zero.");
        // }
 //     =========Switch case===============
        //  System.out.println("=========Switch case===============");
        //     int dayOfWeek = 3;
        //     String dayName;
        //     switch (dayOfWeek) {
        //         case 1:
        //             dayName = "Monday";
        //             break;
        //          case 2:
        //             dayName = "Tuesday";
        //             break;
        //         case 3:
        //             dayName = "Wednesday";
        //             break;
        //          case 4:
        //             dayName = "Thursday";
        //             break;
        //         case 5:
        //             dayName = "Friday";
        //             break;
        //          case 6:
        //             dayName = "Saturday";
        //             break;
        //         case 7:
        //             dayName = "Sunday";
        //             break;
            
        //         default:
        //             dayName = "Invalid day";
        //             break;
        //     }
        //     System.out.println("The day is: "+ dayName);

        //     =========For===============
        // System.out.println("=========For===============");

        // for (int i = 1; i <= 5; i++){
        //     System.out.println("Iteration: "+ i);
        // }

        //     =========While===============
        //  System.out.println("=========While===============");
        // int i = 1;
        // while(i <= 5){
        //     System.out.println("Iteration: "+ i);
        //     i++;
        // }

         //     =========Do While===============
        //  System.out.println("=========Do While===============");
        // int count = 1;
        // do{
        //      System.out.println("Count: "+ count);
        //      count++;
        // }while(count <=5);


        //     =========For===============
        // System.out.println("=========For===============");

        // for (int j = 1; j <= 10; j++){
        //     if(j == 6){
        //         break;
        //     }
        //     System.out.println("J: "+ j);
        // }

        //  for (int k = 1; k <= 10; k++){
        //     if(k == 3){
        //         continue;
        //     }
        //     System.out.println("k: "+ k);
        // }

    System.out.println("========================");
            int[] number = {3,9,4,7,2,6};
            // int[] number = {3,9,5,7,1,13};

            int result = Demo.findFirstEvenNumber(number);
            System.out.println("Fist even Number: "+ result);


    }
    public static int findFirstEvenNumber(int[] numbers){
        for (int num: numbers){
            if(num % 2 == 0){
                return num;
            }
        }
          return  -1; // return -1 if no even number is found
    }
   
}
