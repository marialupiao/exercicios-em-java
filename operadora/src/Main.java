import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int minutos;
        double valor = 50.0;

        System.out.print("Digite a quantidade de minutos: ");
        minutos = sc.nextInt();

        if (minutos > 100) {
            valor = valor + 2 * (minutos -100);
        }
        System.out.println("Valor a pagar: R$" + String.format("%.2f", valor));

        sc.close();
    }
}
