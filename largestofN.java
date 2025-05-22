
import java.util.Scanner;

public class largestofN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers");
        int n = sc.nextInt();
        System.out.println("Enter a first number: ");
        int n1 = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            System.out.println("Enter a number" + i);
            int n2 = sc.nextInt();
            if (n2 > n1) {
                n1 = n2;
            }
        }
        System.out.println("the largest number is : " + n1);
    }

}
