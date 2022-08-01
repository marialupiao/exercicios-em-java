import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valor = 0;
        int quantidade, codigo;

        System.out.print("Codigo do produto comprado: ");
        codigo = sc.nextInt();
        System.out.print("Quantidade comprada: ");
        quantidade = sc.nextInt();

        if (codigo == 1) {
            valor = quantidade * 5.00;
        } else if (codigo == 2) {
            valor = quantidade * 3.50;
        } else if (codigo == 3) {
            valor = quantidade * 4.80;
        } else if (codigo == 4) {
            valor = quantidade * 8.90;
        } else if (codigo == 5) {
            valor = quantidade * 7.32;
        }

        System.out.println("Valor a pagar: R$" + String.format("%.2f",valor));

        sc.close();
    }
}
