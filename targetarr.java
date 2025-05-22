
import java.util.Scanner;

public class targetarr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number of array that you want to store");
        int n = sc.nextInt();
        int num[] = new int[n];
        System.out.println("Enter a number of elements");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();

        }
        System.out.println("set a target elements");
        int tar = sc.nextInt();
        boolean found = false;
        System.out.println("the target elements index is ");
        for (int i = 0; i < n; i++) {
            if (num[i] == tar) {
                System.out.println(i);
                found = true;
                break;

            }
        }
        if (!found) {
            System.out.println("-1");
        }

    }
}
