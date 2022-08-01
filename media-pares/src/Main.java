import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, soma = 0, pares = 0;
        double media;

        System.out.print("Quantos elementos terao o vetor? ");
        n = sc.nextInt();

        int[] vet = new int[n];

        for (int i=0; i<n; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextInt();

            if (vet[i] % 2 == 0) {
                soma = soma + vet[i];
                pares++;
            }
        }

        if (pares == 0) {
            System.out.println("NENHUM NUMERO PAR");
        }
        else {
            media = (double) soma / pares;
            System.out.println("MEDIA DOS PARES = " + String.format("%.1f", media));
        }

        sc.close();
    }
}
