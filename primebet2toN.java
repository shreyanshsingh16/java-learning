
import java.util.Scanner;

public class primebet2toN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt(); // Take user input for n
        boolean isPrime = true;

        for (int i = 2; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
            isPrime = true;
        }
        sc.close(); // Close the scanner
    }
}
