import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, nMenores;
        double alturaTotal, alturaMedia, percentualMenores;

        System.out.print("Quantas pessoas serao digitadas? ");
        n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for (int i=0; i<n; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa");
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();
        }

        nMenores = 0;
        alturaTotal = 0;

        for (int i=0; i<n; i++) {
            if (idades[i] < 16) {
                nMenores++;
            }
            alturaTotal = alturaTotal + alturas[i];
        }

        alturaMedia = alturaTotal / n;
        percentualMenores = ((double) nMenores / n) * 100.0;

        System.out.println("Altura media = " + String.format("%.2f",alturaMedia));
        System.out.println("Pessoas com menos de 16 anos: " + String.format("%.1f",percentualMenores) + "%");

        for (int i=0; i<n; i++) {
            if (idades[i] < 16) {
                System.out.println(nomes[i]);
            }
        }

        sc.close();
    }
}
