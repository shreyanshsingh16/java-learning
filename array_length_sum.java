
import java.util.Scanner;

public class array_length_sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number of array that you want to store");
        int n = sc.nextInt();
        int num[] = new int[n];
        System.out.println("Enter a number of elements");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();

        }
        f
        int sum = 0;
        System.out.println("Sum of Array");
        for (int i = 0; i < n; i++) {

            sum += num[i];
            System.out.println(sum);
        }

    }
}
