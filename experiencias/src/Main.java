import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, ratos = 0, sapos = 0, coelhos = 0, qtdCobaias, total;
        char tipo;
        double pRatos, pSapos, pCoelhos;

        System.out.print("Quantos casos de teste serao digitados? ");
        n = sc.nextInt();

        for (int i=0; i<n; i++) {
            System.out.print("Quantidade de cobaias: ");
            qtdCobaias = sc.nextInt();
            System.out.print("Tipo de cobaia: ");
            tipo = sc.next().charAt(0);

            if (tipo == 'R') {
                ratos = ratos + qtdCobaias;
            }
            else if (tipo == 'S') {
                sapos = sapos + qtdCobaias;
            } else {
                coelhos = coelhos + qtdCobaias;
            }
        }

        total = ratos + sapos + coelhos;
        pCoelhos = ((double) coelhos / total) * 100.0;
        pRatos = ((double) ratos / total) * 100.0;
        pSapos = ((double) sapos / total) * 100.0;

        System.out.println("\nRELATORIO FINAL: ");
        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + coelhos);
        System.out.println("Total de ratos: " + ratos);
        System.out.println("Total de sapos: " + sapos);
        System.out.println("Percentual de coelhos: " + String.format("%.2f", pCoelhos));
        System.out.println("Percentual de ratos: " + String.format("%.2f", pRatos));
        System.out.println("Percentual de sapos: " + String.format("%.2f", pSapos));


        sc.close();
    }
}
