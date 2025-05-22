
public class fibo {

    public static void main(String[] args) {
        int num = 10;
        int a = 0;
        int b = 1;
        System.out.println("Fibonacci Series of " + num + " numbers:");
        for (int i = 0; i < num; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;

        }
    }

}
