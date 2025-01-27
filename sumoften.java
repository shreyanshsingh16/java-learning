import java.util.Scanner;

public class sumoften {
    public static void main(sstring[] args){
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter a number that you want to sum");
        int num[] = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
             sum += num[i];
        }
        System.out.println ("The Sum Of All Input Integer Is "+sum);


    }
}

