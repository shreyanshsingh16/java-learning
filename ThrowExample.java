import java.util.Scanner;

public class ThrowExample {
    public static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("You are under 18 years old.");
        } else {
            System.out.println("You are eligible.");
        }
    }
    
    public static void main(sstring[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        checkAge(age);
        
        scanner.close();
    }
}

