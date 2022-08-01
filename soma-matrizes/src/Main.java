import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int m, n;

        System.out.print("Quantas linhas vao ter cada matriz? ");
        m = sc.nextInt();
        System.out.print("Quantas colunas vao ter cada matriz? ");
        n = sc.nextInt();

        int[][] A = new int[m][n];
        int[][] B = new int[m][n];
        int[][] C = new int[m][n];

        System.out.println("Digite os valores da matriz A: ");
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                System.out.print("Elemento [" + i + "," + j + "]: ");
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Digite os valores da matriz B: ");
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                System.out.print("Elemento [" + i + "," + j + "]: ");
                B[i][j] = sc.nextInt();
            }
        }
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println("MATRIZ SOMA:");
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(C[i][j] + "  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
