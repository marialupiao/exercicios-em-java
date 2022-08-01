import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c, x1 = 0, x2 = 0, delta;

        System.out.print("Coeficiente A: ");
        a = sc.nextDouble();
        System.out.print("Coeficiente B: ");
        b = sc.nextDouble();
        System.out.print("Coeficiente C: ");
        c = sc.nextDouble();

        delta = (Math.pow(b, 2)) - (4 * a * c);

        if (delta < 0) {
            System.out.println("Esta equacao nao possui raizes reais");
        }
        else {
            x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
            x2 = ((-b) - Math.sqrt(delta)) / (2 * a);

            System.out.println("X1 = " + String.format("%.4f", x1));
            System.out.println("X2 = " + String.format("%.4f", x2));
        }

        sc.close();
    }
}
