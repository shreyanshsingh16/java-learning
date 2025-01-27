// // import java.util.Scanner;

// // class MyException extends Exception{
// //     MyException(String message){
// //         super(message);
// //     }
// // }
// // public class throwwithodd{
// //     public static void main(String[] args){

// //           Scanner sc = new Scanner(System.in);
// //         System.out.println("Enter a number even and odd : ");
// //          int a = sc.nextInt();
// //          try{
// //             if (a%2==0)
// //             {
// //                 throw new MyException("Your number even.");
// //             }
// //             else
// //             {
// //                 System.out.println("Your number is odd");
// //             }
// //          }
// //       catch(MyException e){
// //          System.out.println(e.getMessage());
// //       }
// //        finally
// //         {
// //             System.out.println("Mil Gaya Required output");
// //        }
// //     }
// // }


import java.lang.*;
import java.util.Scanner;

class MyException extends Exception{
MyException(String message){
    super(message);
}
}

public class throwwithodd{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for:-");
        int num=sc.nextInt();
        int i=1, fact=1;
        try {
            while(i<=num)
            {
                fact=fact*i;
                i++;
            }
            System.out.println(fact);
            throw new MyException("factorial");
        }
        catch(ArithmeticException e){
                     System.out.println(e.getMessage());
                  }
         finally {
            System.out.println("result :-  " + fact);
        }
       
    }
}

// import java.util.HashSet;
// import java.util.Scanner;
// import java.util.Set;

// // Custom exception class for duplicate entries
// class DuplicateNumberException extends Exception {
//     public DuplicateNumberException(sstring message) {
//         super(message);
//     }
// }

// public class throwwithodd {
    public static void main(sstring[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> uniqueNumbers = new HashSet<>();
        
        System.out.print("Enter the number of integers you want to input: ");
        int size = scanner.nextInt();
        
        int[] numbers = new int[size];
        
        for (int i = 0; i < size; i++) {
            System.out.print("Enter integer #" + (i + 1) + ": ");
            int num = scanner.nextInt();
            
            try {
                if (uniqueNumbers.contains(num)) {
                    throw new DuplicateNumberException("Duplicate number found: " + num);
                }
                uniqueNumbers.add(num);
                numbers[i] = num;
            } catch (DuplicateNumberException e) {
                System.out.println(e.getMessage());
                i--; // Adjust index to allow re-entry of a non-duplicate number
            }
        }
        
        System.out.println("Numbers entered without duplicates:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}