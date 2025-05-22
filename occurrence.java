import java.util.Scanner;

public class occurrence {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String s1 = sc.nextLine();
        int co =0;
        char ch;
        char c;
        int length = s1.length();
        for (int i = 0; i < length; i++) {
            ch = s1.charAt(i);
            for (int j = 0; j < length; j++) {
                c = s1.charAt(j);
                if (ch == c) {
                    co++;
                }
            }
            System.out.println("The character " + ch + " is repeated " + co + " times");
            co=0;
        }

        
    }
}
