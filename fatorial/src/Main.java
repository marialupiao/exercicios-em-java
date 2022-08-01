import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, fat = 1;

        System.out.print("Digite o valor de N: ");
        n = sc.nextInt();

        for (int i=n; i>0; i--) {
            fat = fat * i;
        }
        System.out.println("FATORIAL = " + fat);

        sc.close();
    }
}
