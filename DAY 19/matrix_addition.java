import java.util.*;


public class matrix_addition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        
        int[][] a = new int[m][n];
        int[][] b = new int[m][n];

        System.out.println("Enter elements of first mxm matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second mxm matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        int[][] result = new int[m][n];



        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Resultant Matrix after Addition:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
