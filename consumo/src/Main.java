import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int distancia;
        double consumo, combustivel;

        System.out.print("Distancia percorrida: ");
        distancia = sc.nextInt();

        System.out.print("Combustivel gasto: ");
        combustivel = sc.nextDouble();

        consumo = distancia / combustivel;

        System.out.println("Consumo medio = " + String.format("%.3f", consumo));

        sc.close();
    }
}
