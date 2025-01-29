import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] array2D = new int[rows][cols];

        
        System.out.println("\nEnter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element at Row " + (i + 1) + ", Column " + (j + 1) + ": ");
                array2D[i][j] = scanner.nextInt();
            }
        }

      
        System.out.println("\n2D Array Elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println(); 
        }

        scanner.close();
    }

}
