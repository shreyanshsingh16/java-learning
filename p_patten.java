
import java.util.Scanner;

public class p_patten {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of N ");
        int n = sc.nextInt();
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j);

        //         System.out.print("");
        //     }
        //     for (int k = 6; k >= i; k--) {
        //         System.out.print("*");
        //     }
        //     System.out.println(" ");
        // }
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 4; j >= i; j--) {
        //         System.out.print(" ");
        //     }
        //     int count = i;
        //     for (int k = 1; k <= i; k++) {
        //         System.out.print(count);
        //         count++;
        //     }
        //     int c = (i * 2) - 2;
        //     for (int l = 2; l <= i; l++) {
        //         System.out.print(c);
        //         c--;
        //     }
        //     System.out.println(" ");
        // }
        // int num = 1;
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print(num + "     ");
        //         num++;
        //         System.out.print(" ");
        //     }
        //     System.out.println();
        // }
        // for (int i = 1; i <= n; i++) {
        //     System.out.print(i);
        //     for (int j = 2; j <= i; j++) {
        //         if (i == j) {
        //             System.out.print(i);
        //         } else {
        //             System.out.print("0");
        //         }
        //     }
        //     System.out.println();
        // }
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j);
        //     }
        //     for (int k = n - 1; k >= i; k--) {
        //         System.out.print(" ");
        //     }
        //     for (int l = n - 1; l > i; l--) {
        //         System.out.print(" ");
        //     }
        //     for (int m = i; m >= 1; m--) {
        //         if (m == n) {
        //             m -= 1;
        //             System.out.print(m);
        //         } else {
        //             System.out.print(m);
        //         }
        //     }
        //     System.out.println(" ");
        // }
        // int a = 0;
        // int b = 1;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(a + "    ");
        //         int temp = a + b;
        //         a = b;
        //         b = temp;
        //     }
        //     System.out.println(" ");
        // }
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         if ((i + j) % 2 == 0) {
        //             System.out.print("1");
        //         } else {
        //             System.out.print("0");
        //         }
        //     }
        //     System.out.println();
        // }
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         if (i % 2 != 0) {
        //             System.out.print("1");
        //         } else {
        //             if (i == j || j == 1) {
        //                 System.out.print("1");
        //             } else {
        //                 System.out.print("0");
        //             }
        //         }
        //     }
        //     System.out.println();
        // }
        // for (int i = 0; i < n; i++) {
        //     for (int j = 1; j <= n - i; j++) {
        //         System.out.print(j);
        //     }
        //     for (int k = 1; k <= 2 * i - 1; k++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for (int i = 0; i < n; i++) {
        //     for (int j = 1; j <= n - i; j++) {
        //         System.out.print(j);
        //     }
        //     for (int k = 1; k <= i; k++) {
        //         System.out.print("*");
        //     }
        //     for (int l = 2; l <= i; l++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         if (i >= j) {
        //             System.out.print(i);
        //         } else {
        //             System.out.print(j);
        //         }
        //     }
        //     System.out.println();
        // }
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(i);
        //     }
        //     int c = i + 1;
        //     for (int k = 1; k <= n - i; k++) {
        //         System.out.print(c);
        //         c++;
        //     }
        //     System.out.println();
        // }
// *  ****
// *  *
// *  *
// *******
//    *  *
//    *  *
// ****  *
        //     for (int i = 1; i <= n; i++) {
        //         for (int j = 1; j <= n; j++) {
        //             boolean match = false;
        //             if (i == 1 && (j == 1 || j == 4 || j == 5 || j == 6 || j == 7)) {
        //                 System.out.print("*");
        //                 match = true;
        //             }
        //             if (i == 2 && (j == 1 || j == 4)) {
        //                 System.out.print("*");
        //                 match = true;
        //             }
        //             if (i == 3 && (j == 1 || j == 4)) {
        //                 System.out.print("*");
        //                 match = true;
        //             }
        //             if (i == 4 && (j == 1 || j == 2 || j == 3 || j == 4 || j == 5 || j == 6 || j == 7)) {
        //                 System.out.print("*");
        //                 match = true;
        //             }
        //             if (i == 5 && (j == 4 || j == 7)) {
        //                 System.out.print("*");
        //                 match = true;
        //             }
        //             if (i == 6 && (j == 4 || j == 7)) {
        //                 System.out.print("*");
        //                 match = true;
        //             }
        //             if (i == 7 && (j == 1 || j == 2 || j == 3 || j == 4 || j == 7)) {
        //                 System.out.print("*");
        //                 match = true;
        //             }
        //             if (!match) {
        //                 System.out.print(" ");
        //             }
        //    }
        //         System.out.println("");
        //     }
// *********
// **** ****
// ***   ***
// **     **
// *       * 
// **     **
// ***   *** 
// **** **** 
// *********
        // int s = (n / 2) + 1;
        // for (int i = s; i >= 1; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     for (int k = s - 1; k >= i; k--) {
        //         System.out.print(" ");
        //     }
        //     for (int l = s - 1; l > i; l--) {
        //         System.out.print(" ");
        //     }
        //     for (int m = i; m >= 1; m--) {
        //         if (m == s) {
        //             m -= 1;
        //             System.out.print("*");
        //         } else {
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println(" ");
        // }
        // for (int i = 2; i <= s; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     for (int k = s - 1; k >= i; k--) {
        //         System.out.print(" ");
        //     }
        //     for (int l = s - 1; l > i; l--) {
        //         System.out.print(" ");
        //     }
        //     for (int m = i; m >= 1; m--) {
        //         if (m == s) {
        //             m -= 1;
        //             System.out.print("*");
        //         } else {
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println(" ");
        // }
        // for (int i = 0; i <= n; i++) {
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int k = n - i; k >= 0; k--) {
        //         System.out.print(k);
        //     }
        //     for (int m = 1; m <= n - i; m++) {
        //         System.out.print(m);
        //     }
        //     System.out.println();
        // }
        // for (int i = n - 1; i >= 0; i--) {
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int k = n - i; k >= 0; k--) {
        //         System.out.print(k);
        //     }
        //     for (int m = 1; m <= n - i; m++) {
        //         System.out.print(m);
        //     }
        //     System.out.println();
        // }
        // for (int i = 1; i <= n; i++) {
        //     for (int j = n - 1; j >= i; j--) {
        //         System.out.print(" ");
        //     }
        //     for (int k = 1; k <= i; k++) {
        //         System.out.print("*");
        //     }
        //     for (int l = 2; l <= i; l++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int k = n - 1; k >= i; k--) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        int m = n / 2 + 1;
        for (int i = 1; i <= m; i++) {
            for (int j = 0; j <= m - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = m - 1; i >= 1; i--) {
            for (int j = 0; j <= m - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
