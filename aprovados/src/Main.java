import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double media;
        int n;

        System.out.print("Quantos alunos serao digitados? ");
        n = sc.nextInt();

        double[] nota1 = new double[n];
        double[] nota2 = new double[n];
        String[] nomes = new String[n];

        for (int i=0; i<n; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "o aluno:");
            sc.nextLine();
            nomes[i] = sc.nextLine();
            nota1[i] = sc.nextDouble();
            nota2[i] = sc.nextDouble();
        }

        System.out.println("Alunos aprovados: ");
        for (int i=0; i<n; i++) {
            media = (nota1[i] + nota2[i]) / 2;
            if (media >= 6) {
                System.out.println(nomes[i]);
            }
        }
        sc.close();
    }
}
