import javax.sound.midi.Soundbank;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo, alcool = 0, gasolina = 0, diesel = 0;

        System.out.print("Informe um codigo (1- alcool, 2- gasolina, 3- diesel) ou 4 para parar: ");
        codigo = sc.nextInt();

        while (codigo != 4) {
            if (codigo == 1) {
                alcool++;
            }
            else if (codigo == 2) {
                gasolina++;
            }
            else if (codigo == 3) {
                diesel++;
            }

            System.out.print("Informe um codigo (1- alcool, 2- gasolina, 3- diesel) ou 4 para parar: ");
            codigo = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO!");
        System.out.println("Alcool : " + alcool);
        System.out.println("Gasolina : " + gasolina);
        System.out.println("Diesel : " + diesel);

        sc.close();
    }
}
