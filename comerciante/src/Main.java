import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, abaixo = 0, entre = 0, acima = 0;
        double lucro, percentual, totalCompra, totalVenda, totalLucro;

        System.out.print("Serao digitados os dados de quantos produtos? ");
        n = sc.nextInt();

        String[] nomes = new String[n];
        double[] precoCompra = new double[n];
        double[] precoVenda = new double[n];

        for (int i=0; i<n; i++) {
            System.out.println("Produto " + (i+1) + ":");
            System.out.print("Nome: ");
            sc.nextLine();
            nomes[i] = sc.nextLine();
            System.out.print("Preco de compra: ");
            precoCompra[i] = sc.nextDouble();
            System.out.print("Preco de venda: ");
            precoVenda[i] = sc.nextDouble();
        }

        for (int i=0; i<n; i++) {
            lucro = precoVenda[i] - precoCompra[i];
            percentual = lucro * 100 / precoCompra[i];

            if (percentual < 10) {
                abaixo++;
            } else if (percentual <= 20) {
                entre++;
            } else {
                acima++;
            }
        }
        totalCompra = 0;
        totalVenda = 0;

        for (int i=0; i<n; i++) {
            totalCompra = totalCompra + precoCompra[i];
            totalVenda = totalVenda + precoVenda[i];
        }

        totalLucro = totalVenda - totalCompra;

        System.out.println();
        System.out.println("RELATORIO:");
        System.out.println("Lucro abaixo de 10%: " + abaixo);
        System.out.println("Lucro entre 10% e 20%: " + entre);
        System.out.println("Lucro acima de 20%: " + acima);
        System.out.println("Valor total de compra: " + String.format("%.2f", totalCompra));
        System.out.println("Valor total de venda: " + String.format("%.2f", totalVenda));
        System.out.println("Lucro total: " + String.format("%.2f", totalLucro));

        sc.close();
    }
}
