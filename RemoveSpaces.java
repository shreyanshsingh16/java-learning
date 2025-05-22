import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a : ");
        String s1 = scanner.nextLine();
        
        String result = s1.replace(" ", "");
        // String result = userInput.replaceAll("(?<! ) (?! )", "");

        
        System.out.println(" Without spaces: " + result);
        scanner.close();
    }
}