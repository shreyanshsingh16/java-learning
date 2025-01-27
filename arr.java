import java.util.Scanner;

public class arr {
  public static void main(sstring[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number of array that you want to store");
    int n = sc.nextInt();
    int num[] = new int[n];
    System.out.println("Enter a number of elements");
    for (int i = 0; i < n; i++) {
      num[i] = sc.nextInt();

    }
    System.out.println("Array elements Are");
    for (int i = 0; i < n; i++) {
      System.out.println(num[i]);
    }

  }
}
