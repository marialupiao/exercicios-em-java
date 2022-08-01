import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

       int n, contMulheres, contHomens;
       double menorAltura, maiorAltura, alturaTotal, alturaMedia;

        System.out.print("Quantas pessoas serao digitadas? ");
        n = sc.nextInt();

        double[] alturas = new double[n];
        char[] generos = new char[n];

        for (int i=0; i<n; i++) {
            System.out.print("Altura da " + (i+1) + "a pessoa: ");
            alturas[i] = sc.nextDouble();
            System.out.print("Genero da " + (i+1) + "a pessoa: ");
            generos[i] = sc.next().charAt(0);
        }
        menorAltura = alturas[0];
        maiorAltura = alturas[0];

        for (int i=0; i<n; i++) {
            if (alturas[i] > maiorAltura) {
                maiorAltura = alturas[i];
            }
            else if (alturas[i] < menorAltura) {
                menorAltura = alturas[i];
            }
        }
        contHomens = 0;
        contMulheres = 0;
        alturaTotal = 0;

        for (int i=0; i<n; i++) {
            if (generos[i] == 'M') {
            contHomens++;
        } else {
              contMulheres++;
              alturaTotal = alturaTotal + alturas[i];
            }}

        alturaMedia = alturaTotal / contMulheres;

            System.out.println("Menor altura = " + String.format("%.2f", menorAltura));
            System.out.println("Maior altura = " + String.format("%.2f", maiorAltura));
            System.out.println("Media das alturas das mulheres = " + String.format("%.2f", alturaMedia));
            System.out.println("Numero de homens = " + contHomens);

        sc.close();
    }
}
