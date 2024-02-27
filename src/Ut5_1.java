import java.awt.font.NumericShaper;
import java.nio.file.attribute.AttributeView;
import java.util.Scanner;

public class Ut5_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeros [] = new int[6];

        System.out.println("Introduce los numeros ganadores: ");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        //dibujar

        /*

        for (int i = 1; i < 10 ; i++) {
            System.out.printf(String.valueOf(i));
        }

        for (int i = 10; i < 20; i++) {
            System.out.printf(String.valueOf(i));
        }

        for (int i = 20; i < 30; i++) {
            System.out.printf(String.valueOf(i));
        }

        for (int i = 30; i < 40; i++) {
            System.out.printf(String.valueOf(i));
        }

        for (int i = 40; i < 50; i++) {
            System.out.printf(String.valueOf(i));
        } */

    }


}
