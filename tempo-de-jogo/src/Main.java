import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hInicial, hFinal, duracao;

        System.out.print("Hora inicial: ");
        hInicial = sc.nextInt();
        System.out.print("Hora final: ");
        hFinal = sc.nextInt();

        if (hInicial < hFinal) {
            duracao = hFinal - hInicial;
        } else {
            duracao = 24 - hInicial + hFinal;
        }
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc.close();
    }
}
