
import java.util.Scanner;

public class short_distance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  :");
        String str = sc.nextLine();
        int n = 0, w = 0, s = 0, e = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'N') {
                n++;
            } else if (ch == 'W') {
                w++;
            } else if (ch == 'S') {
                s++;
            } else if (ch == 'E') {
                e++;
            }
        }
        int v = n - s;
        int h = e - w;

    }

}
