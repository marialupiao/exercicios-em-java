import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pagamento, valor;
        int horas;
        String nome;

        System.out.print("Nome: ");
        nome = sc.nextLine();

        System.out.print("Valor por hora: ");
        valor = sc.nextDouble();

        System.out.print("Horas trabalhadas: ");
        horas = sc.nextInt();

        pagamento = horas * valor;

        System.out.println("O pagamento para " + nome + " deve ser de R$" + String.format("%.2f",pagamento));

        sc.close();
    }
}
