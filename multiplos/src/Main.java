import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x, y;

        System.out.println("Digite dois numeros inteiros: ");
        x = sc.nextInt();
        y = sc.nextInt();

        if (x % y == 0 || y % x == 0) {
            System.out.println("Sao multiplos");
        } else {
            System.out.println("Nao sao multiplos");
        }

        sc.close();
    }
}
