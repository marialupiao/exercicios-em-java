
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, x = 0;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();

        for (int i=0; i<n; i++) {
            System.out.print("Digite um numero: ");
            x = sc.nextInt();

        if (x == 0) {
            System.out.println("NULO");
        }
        else if (x % 2 == 0) {
            if (x < 0) {
                System.out.println("PAR NEGATIVO");
            }
            else {
                System.out.println("PAR POSITIVO");
            }
        } else {
            if (x < 0) {
                System.out.println("IMPAR NEGATIVO");
            } else {
                System.out.println("IMPAR POSITIVO");
            }
        }}
        sc.close();
    }
}
