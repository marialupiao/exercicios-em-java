import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, pMaior;
        double maior;

        System.out.print("Quantos numeros voce vai digitar: ");
        n = sc.nextInt();

        double[] vet = new double[n];

        for (int i=0; i<n; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }

        maior = vet[0];
        pMaior = 0;

        for (int i=0; i<n; i++) {
            if (vet[i] > maior) {
                maior = vet[i];
                pMaior = i;
            }
        }
        System.out.println();
        System.out.println("MAIOR VALOR = " + String.format("%.1f",maior));
        System.out.println("POSICAO DO MAIOR VALOR = " + pMaior);

        sc.close();
    }
}
