import java.util.Scanner;

public class factorialloop {
    public static void main(sstring[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a factorial number ");
        int num = sc.nextInt();
        // System.out.println("In for Loop");
        int sum=1;
    //     for(int i=1; i<=num; i++){
    //          sum = sum*i;
    //         System.out.println(sum);
    //     }

    //    int i=1;
    //     while(i<=num){
    //         sum = sum*i;
    //         i++;
    //         System.out.println(sum);
    //     }

        int j=1;
        do{
            sum= sum*j;
            j++;
            System.out.println(sum);
        }while(j<=num);
    }

}
