import java.util.*;
import java.util.Scanner;

public class sstring {
    public static void main(String[] args){
        // String str = "java program";
        // String str1 = new String();
        // str1=" good morning";
        // System.out.println(str);
        // System.out.println(str1);
        // String concatention = str.concat(str1); 
        // System.out.println(concatention);
        // System.out.println(str+" "+str1);
        // System.out.println(str.equals(str1));
        // System.out.println(str.length());

        Scanner sc = new Scanner(System.in);
        System.out.println("entre a String 1");
        String s1 = sc.nextLine();
        System.out.println("Enter a string 2");
        String s2 = sc.nextLine();
      

    }
}







































// import java.util.Scanner;

// public class MenuDrivenProgram {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int choice;

//         do {
//             // Display the menu
//             System.out.println("=== Menu ===");
//             System.out.println("1. Add Numbers");
//             System.out.println("2. Subtract Numbers");
//             System.out.println("3. Multiply Numbers");
//             System.out.println("4. Divide Numbers");
//             System.out.println("5. Exit");
//             System.out.print("Enter your choice: ");

//             // Get the user's choice
//             choice = scanner.nextInt();

//             switch (choice) {
//                 case 1: // Addition
//                     System.out.println("Enter two numbers:");
//                     int a = scanner.nextInt();
//                     int b = scanner.nextInt();
//                     System.out.println("Result: " + (a + b));
//                     break;

//                 case 2: // Subtraction
//                     System.out.println("Enter two numbers:");
//                     a = scanner.nextInt();
//                     b = scanner.nextInt();
//                     System.out.println("Result: " + (a - b));
//                     break;

//                 case 3: // Multiplication
//                     System.out.println("Enter two numbers:");
//                     a = scanner.nextInt();
//                     b = scanner.nextInt();
//                     System.out.println("Result: " + (a * b));
//                     break;

//                 case 4: // Division
//                     System.out.println("Enter two numbers:");
//                     a = scanner.nextInt();
//                     b = scanner.nextInt();
//                     if (b != 0) {
//                         System.out.println("Result: " + (a / (double)b));
//                     } else {
//                         System.out.println("Division by zero is not allowed!");
//                     }
//                     break;

//                 case 5: // Exit
//                     System.out.println("Exiting the program. Goodbye!");
//                     break;

//                 default: // Invalid choice
//                     System.out.println("Invalid choice! Please try again.");
//                     break;
//             }

//             System.out.println(); // Blank line for readability

//         } while (choice != 5); // Repeat until the user chooses to exit

//         scanner.close(); // Close the scanner to release resources
//     }
// }
