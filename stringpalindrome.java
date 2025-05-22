
import java.io.*;

public class stringpalindrome {

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();

        StringBuilder rev = new StringBuilder(s);
        rev.reverse();

        return s.equals(rev.toString());
    }

    public static void main(String[] args) {
        String s = "level";
        boolean res = isPalindrome(s);

        if (res) {
            System.out.println(s + " is a palindrome");
        } else {
            System.out.println(s + " is not a palindrome");
        }
    }
}
