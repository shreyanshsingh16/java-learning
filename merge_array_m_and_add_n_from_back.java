
import java.util.Scanner;

public class merge_array_m_and_add_n_from_back {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number of array that you want to store in A");
        int n = sc.nextInt();
        int num[] = new int[n];

        System.out.println("Enter a Number of array that you want to store in B");
        int m = sc.nextInt();
        int num1[] = new int[m];

        System.out.println("Enter a number of elements in A");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("Enter a number of elements in B");
        for (int j = 0; j < m; j++) {
            num1[j] = sc.nextInt();
        }
        System.out.println("number of Elements");
        int id1 = 0, id2 = 0;
        while (id1 < n && id2 < m) {
            int can = num[id1];
            int can1 = num1[id2];
            if (can < can1) {
                System.out.println(can);
                id1++;
            } else {
                System.out.println(can1);
                id2++;
            }
        }
        while (id1 < n) {
            System.out.println(num[id1]);
            id1++;
        }
        while (id2 < m) {
            System.out.println(num[id2]);
            id2++;
        }

    }

}
