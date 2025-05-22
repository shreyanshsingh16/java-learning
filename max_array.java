// this are elements
// -1 8 8 8 9

import java.util.Scanner;

public class max_array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number of array that you want to store");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int num1[] = new int[n];

        System.out.println("Enter a number of elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }

        // mix on right
        num1[n - 1] = -1;
        int max = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            num1[i] = max;
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        // 
        // 
        // 
        // 
        // 
        //mix on left
        // num1[0] = -1;
        // int max = arr[0];
        // for (int i = 1; i < n; i++) {
        //     num1[i] = max;
        //     if (arr[i] > max) {
        //         max = arr[i];
        //     }
        //     num1[i] = max;
        // }
        // 
        // 
        // 
        // 
        // 
        // 
        // num1[0] = -1;
        // for (int i = 1; i < n; i++) {
        //     int max = arr[0];
        //     for (int j = 1; j < i; j++) {
        //         if (arr[j] > max) {
        //             max = arr[j];
        //         }
        //     }
        //     num1[i] = max;
        // }
        System.out.println("this are elements");

        for (int i = 0; i < n; i++) {
            System.out.print(num1[i] + " ");

        }
    }
}
