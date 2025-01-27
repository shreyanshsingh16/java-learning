import java.util.Scanner;

public class ifels {
    public static void main(sstring[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a number as per from 1 to 7: ");
          int a = sc.nextInt();
          if( a == 1){
            System.out.println("Monday");
          }
          else if ( a == 2) {
            System.out.println("Tue");
          } 
          else if ( a == 3) {
            System.out.println("wed");
          } 
          else if ( a == 4) {
            System.out.println("Thur");
          } 
          else if ( a == 5) {
            System.out.println("fri");
          } 
          else if ( a == 6) {
            System.out.println("sat");
          } 
          else {
            System.out.println("Sunday");
          } 

    }
}
