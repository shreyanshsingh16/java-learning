import java.util.Scanner;

class first
{
    public static void main(sstring[] args) {
        System.out.println("hello shreyansh");
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        Float a = sc.nextFloat();
        System.out.println("Enter a number");
        b = sc.nextInt();
        Float sum = a + b;
        Float sum1 = a * b;
        Float sum2 = a - b;
        Float sum3 = a / b;
        System.out.println("number " + a +"  +  " + " number " +b+ "  =  " +" Answer " +sum);
        System.out.println("number " + a +"  -  " + " number " +b+ "  =  " +" Answer " +sum2);
        System.out.println("number " + a +"  *  " + " number " +b+ "  =  " +" Answer " +sum1);
        System.out.println("number " + a +"  /  " + " number " +b+ "  =  " +" Answer " +sum3);

        sc.close(); // Close the scanner
        
    }
}

