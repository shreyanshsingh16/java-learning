
import java.util.Scanner;

public class using_opterater_to_convert_k_bit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        // System.out.println("Enter bit position");
        // int num1 = sc.nextInt();
        // checking kth bit 
        // if ((num & (1 << num1)) != 0) {
        //     System.out.print("Kth bit is set  " + num1);
        // } else {
        //     System.out.println("Kth bit not set");
        // }
        // setting k bit 
        // int mask = (1 << num1);
        // num |= mask;
        // System.out.println(num);
        //  set 1 Kth bit
        // int mask = ((1 << num1) - 1);
        // num |= mask;
        // System.out.println(num);
        // unset 1 Kth bit
        //     int mask = ~((1 << num1) - 1);
        //     num |= mask;
        //  System.out.println(num);
        // flip First bit
        // int mask = ((1 << num1) - 1);
        // num ^= mask;
        // System.out.println(num);
        // number of set bit
        int count = 0;
        // while (num != 0) {
        //     count += (num & 1);
        //     num >>= 1;
        // }
        // System.out.println(count);
        // another way
        while (num != 0) {
            num = (num & (num - 1));
            count++;
        }
    }
}
