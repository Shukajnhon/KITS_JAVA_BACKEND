package exercises;

public class exercises6 {
    public static void main(String[] args) {
      // 1. cho thang điểm từ 0 - 100
     
      evaluate(50);

    }

    public static void evaluate(int score) {
      if(score >= 80){
        System.out.println("Diem A");
      }else if(score >= 60){
        System.out.println("Diem B");
      }else if(score >= 40){
        System.out.println("Diem C");
      }else if(score >= 20){
        System.out.println("Diem D");
      }else{
        System.out.println("Diem E");
      }

      }
      
}
