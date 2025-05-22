
import java.util.Scanner;

public class count_number_till$ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter  :");
        while (true) {
            char ch = sc.next().charAt(0);
            if (ch == '$') {
                break;
            }
            count++;
        }
        System.out.println("The number of characters entered before '$' is: " + count);
        sc.close();
    }
}
