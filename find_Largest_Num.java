
import java.util.Scanner;

public class find_Largest_Num {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number of array that you want to store");
        int n = sc.nextInt();
        int num[] = new int[n];
        System.out.println("Enter a number of elements");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();

        }
        int smallest = num[0];
        System.out.println("the smallest elements index is ");
        for (int i = 0; i < n; i++) {
            if (num[i] < num[0]) {
                smallest = i;

            }
        }
        System.out.println(smallest);
    }

}
