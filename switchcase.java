import java.util.Scanner;

public class switchcase {
    public static void main(sstring[] args){
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter a number 1, 2, 3:- ");
    // int numS = sc.nextInt();
    // switch(numS){
    //     case 1:
    //         System.out.println("One");
    //     break;
    //     case 2:
    //         System.out.println("two");
    //     break;
    //     case 3:  
    //         System.out.println("three");
    //     break;
    //     default:
    //     System.out.println("The Number Does Not Exit ");
    //     break;
    // }


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number From 1 To 7");
        int num = sc.nextInt();
        switch(num){
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        default:
            System.out.println("Invalid day");
            break;
        }

    }

}
