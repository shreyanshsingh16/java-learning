
public class patten {

    public static void main(String[] args) {
        // int n = 3;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = i; j < n; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int k = 0; k < (2 * i - 1); k++) {
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }

        // int num = 1;
        // for (int i = 0; i <= 3; i++) {
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print(num);
        //         num++;
        //         System.out.print(" ");
        //     }
        //     System.out.println(" ");
        // }
        // int num = 4;
        // for (int i = 1; i <= num; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }
        // int num = 4;
        // int count = 0;
        // for (int i = 1; i <= num; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         count = count + 1;
        //         System.out.print(" " + count);
        //     }
        //     System.out.println();
        // }
        // int num = 4;
        // int count = 0;
        // for (int i = 1; i <= num; i++) {
        //     count = count + 1;
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(" " + count);
        //     }
        //     System.out.println();
        // }
        // for (int i = 0; i <= 4; i++) {
        // for(int j =i; j>=0 ; j--){
        // System.out.print((char)('A'+j));
        // }
        // System.out.println();
        // }
        // for (int i = 1; i <= 4; i++) {
        // char ch='A';
        // for(int j =1; j<=i ; j++){
        // System.out.print(" " + ch + " ");
        // ch++;
        // }
        // System.out.println();
        // }
        // int num = 4;
        // for (int i = 1 ; i <= num; i++){
        // for(int j = 4; j>=i; j--){
        // System.out.print(" * ");
        // }
        // System.out.println();
        // }
        // for (int i = 1; i <= 4; i++) {
        // for(int j =1; j<=i ; j++){
        // System.out.print(" * ");
        // }
        // System.out.println();
        // }
        // for (int i = 1; i <= 4; i++) {
        //     for (int j = 3; j >= i; j--) {
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }
        // * 
        // *  * 
        // *  *  * 
        // *  *  *  * 
        // for (int i = 1; i <= 4; i++) {
        //     for (int j = 3; j >= i; j--) {
        //         System.out.print("");
        //     }
        //     for (int k = 1; k <= i; k++) {
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }
        // for (int i =1 ; i <= 4 ; i++){
        // for (int j =3 ; j>=i; j--){
        // System.out.print(" ");
        // }
        // char ch = 'A';
        // for (int k =1; k<=i; k++){
        // System.out.print(" " + ch + " ");
        // ch++;
        // }
        // System.out.println();
        // }
        // for (int i = 0; i <= 4; i++) {
        // for(int j =3; j>=i; j--){
        // System.out.print(" ");
        // }
        // for(int k =i; k>=0 ; k--){
        // System.out.print((char)('A'+k));
        // }
        // System.out.println();
        // }
        // for (int i = 1; i <= 4; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int k = i; k <= 4; k++) {
        //         System.out.print((char) ('E' - k));
        //     }
        //     System.out.println();
        // }
        //      * 
        //     *
        //    *
        //   *
        //     for (int i = 1; i <= 4; i++) {
        //         for (int j = 4; j >= i; j--) {
        //             System.out.print(" ");
        //         }
        //         System.out.println("* ");
        //     }
        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 2; j <= i; j++) {
        //         System.out.print(" ");
        //     }
        //     System.out.println("*");
        // }
        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 2; j <= i; j++) {
        //         System.out.print(" ");
        //     }
        //     System.out.println("*");
        // }
        // for (int i = 2; i <= 4; i++) {
        //     for (int j = 4; j >= i; j--) {
        //         System.out.print(" ");
        //     }
        //     System.out.println("* ");
        // }
        // ****
        //  ***
        //   **
        //    *
        // for (int i = 1; i <= 4; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int k = 4; k >= i; k--) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // onr way to print the pattern
        // for (int i = 1; i <= 4; i++) {
        //     for (int j = 3; j >= i; j--) {
        //         System.out.print("  ");
        //     }
        //     for (int k = 1; k <= i; k++) {
        //         System.out.print("  * ");
        //     }
        //     System.out.println();
        // }
        // // same as above but in another way
        // for(int i=1; i<=4; i++){
        // for(int j=4; j>=1;j--){
        // if(j>i){
        // System.out.print(" ");
        // }
        // else{
        // System.out.print(" * ");
        // }
        // }
        // System.out.println();
        // }
        // for(int i = 0; i <= 4; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(" ");
        // }
        // for(int k = 3; k >= i; k--) {
        // System.out.print(" * ");
        // }
        // System.out.println();
        // }
        // for(int i = 1; i <= 4; i++){
        // for(int j = 3; j >= i; j--){
        // System.out.print(" ");
        // }
        // for(int k = 1; k <= i; k++){
        // System.out.print(" * ");
        // }
        // System.out.println();
        // }
        // for(int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(" ");
        // }
        // for(int k = 3; k >= i; k--) {
        // System.out.print(" * ");
        // }
        // System.out.println();
        // }
        // for (int i = 0; i <= 5; i++) {
        //     int num;
        //     if (i % 2 == 0) {
        //         num = 1;
        //     } else {
        //         num = 0;
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         num = 1 - num;
        //         System.out.print(num);
        //     }
        //     System.out.println();
        // }
        // int num = 1;
        // for (int i = 1; i <= 3; i++) {
        //     for (int j = 3; j > i; j--) {
        //         System.out.print(" ");
        //     }
        //     for (int k = 1; k <= i; k++) {
        //         System.out.print(num);
        //         num++;
        //     }
        //     for (int k = i - 2; k >= i; k--) {
        //         num--;
        //         System.out.print(num);
        //     }
        //     System.out.println();
        // }
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k < i * 2; k++) {
                if (k > 1 && k < (i * 2) - 1) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int j = 5; j >= i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k < i * 2; k++) {
                if (k > 1 && k < (i * 2) - 1) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
