import java.util.Scanner;

public class cal {

    public void add(int a , int b){
        int res = 0;
        res = a+b;
        System.out.println(res);
    }

    public void sub(int a , int b){
        int res = 0;
        res = a-b;
        System.out.println(res);    }

    public void mul(int a , int b){
        int res = 0;
        res = a*b;
        System.out.println(res);    }
   
    public void divi(float  a , float  b){
        float res = 0;
        res = a/b ;
        System.out.println( "result: " + res ); 
       }

    public static void main(sstring[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
       int a = sc.nextInt();
        System.out.println("Enter a 2nd Numner");
       int b = sc.nextInt();


       cal ca = new cal();
       ca.add(a, b);
       ca.sub(a, b);
       ca.mul(a, b);
       ca.divi(a, b);
        
    }
}
