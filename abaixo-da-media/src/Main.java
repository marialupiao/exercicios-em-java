import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double soma, media;

        System.out.print("Quantos elementos terao em cada vetor? ");
        n = sc.nextInt();

        double[] vet = new double[n];

        for (int i=0; i<n; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }

        soma = 0;

        for (int i=0; i<n; i++) {
            soma = soma + vet[i];
        }

        media = soma / n;

        System.out.println();
        System.out.println("MEDIA DO VETOR = " + String.format("%.3f", media));
        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        for (int i=0; i<n; i++) {
            if (vet[i] < media) {
                System.out.println(String.format("%.1f",vet[i]));
            }
        }

        sc.close();
    }
}
