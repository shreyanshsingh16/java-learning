import java.util.Scanner;

public class evenoddwhile {
    public static void main(sstring[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number From 1");
        int num = sc.nextInt();
        System.out.println("Enter a number to 100");
        int num1 = sc.nextInt();

        System.out.println("IN FOR LOOP");
        for(int i=num;i<=num1;i++){
            if(i % 2 == 0){
            System.out.println(i + " is Even");
            }
            else{
                System.out.println(i + " is odd");
            }
        }

        System.out.println("IN WHILE LOOP");
        int i = num;
        while(i<=num1){
             if(i % 2 == 0){
                System.out.println(i + " is Even");
                }
                else{
                    System.out.println(i + " is odd");
                }
                i++;
        }

        System.out.println("IN DO-WHILE LOOP");
         i = num;
        do{
             if(i % 2 == 0){
                System.out.println(i + " is Even");
                }
                else{
                    System.out.println(i + " is odd");
                }
                i++;
        }while(i<=num1);

    }
}
