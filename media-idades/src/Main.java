import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int idade, pessoas;
        double media, soma;

        System.out.println("Digite as idades: ");
        idade = sc.nextInt();

        if (idade < 0) {
            System.out.println("IMPOSSIVEL CALCULAR");
        } else {
            soma = 0;
            pessoas = 0;
            while (idade >= 0) {
                soma = soma + idade;
                pessoas++;
                idade = sc.nextInt();
            }

            media = soma / pessoas;
            System.out.printf("MEDIA = " + String.format("%.2f",media));
        }

        sc.close();
    }
}
