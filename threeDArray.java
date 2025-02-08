// public class threeDArray {
//     public static void main(String[] args) {
      
//         int[][][] array3D = {
        //     { {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12} },
        //     { {13, 14, 15, 16}, {17, 18, 19, 20}, {21, 22, 23, 24} }
        // };

        
//         System.out.println("3D Array Elements:");
//         for (int i = 0; i < array3D.length; i++) { 
//             System.out.println("Layer " + (i + 1) + ":");
//             for (int j = 0; j < array3D[i].length; j++) { 
//                 for (int k = 0; k < array3D[i][j].length; k++) { 
//                     System.out.print(array3D[i][j][k] + " ");
//                 }
//                 System.out.println(); 
//             }
//             System.out.println();
//         }

//         int element = array3D[1][0][2];
//         System.out.println("Element at Layer 2, Row 1, Column 3: " + element);
//     }
// }



import java.util.Scanner;

public class threeDArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int layers, rows, cols;
        
        System.out.print("Enter number of layers: ");
        layers = scanner.nextInt();
        
        System.out.print("Enter number of rows: ");
        rows = scanner.nextInt();
        
        System.out.print("Enter number of columns: ");
        cols = scanner.nextInt();

        int[][][] array3D = new int[layers][rows][cols];

        System.out.println("\nEnter the elements of the 3D array:");
        for (int i = 0; i < layers; i++) {
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {
                    System.out.print("Element at Layer " + (i + 1) + ", Row " + (j + 1) + ", Column " + (k + 1) + ": ");
                    array3D[i][j][k] = scanner.nextInt();
                }
            }
        }

        System.out.println("\n3D Array Elements:");
        for (int i = 0; i < layers; i++) {
            System.out.println("Layer " + (i + 1) + ":");
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {
                    System.out.print(array3D[i][j][k] + " ");
                }
                System.out.println(); 
            }
            System.out.println(); 
        }

        scanner.close();
    }
}
