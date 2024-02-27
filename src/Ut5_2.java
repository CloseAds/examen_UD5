import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;
public class Ut5_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> edades = new ArrayList<>();

        System.out.println("Introduce las edad de las estudiantes de la clase");
        int edad;

        while (true){
            edad = sc.nextInt();
            if (edad < 0){
                System.out.println("Edad no válida.");
                break;
            }
            edades.add(edad);
        }

        double totalEdades = 0;
        for (int e : edades){
            totalEdades += e;
        }

        float edadMedia = (float) (totalEdades / edades.size());

        if (edadMedia == edad){
            System.out.println("La edad es igual a la media");
        }

        int menoresMedia = 0;
        int mayoresMedia = 0;

        Iterator <Integer> iterador = edades.iterator();
        while (iterador.hasNext()){
            int e = iterador.next();
            if ( e >= edadMedia){
                mayoresMedia++;
            }else {
                menoresMedia++;
            }
        }

        System.out.println("La edad media es: " + edadMedia);
        System.out.println("Hay " + mayoresMedia + " personas por encima de la media.");
        System.out.println("Hay " + menoresMedia + " personas por debajo de la media.");



        /*
        do{
            edad = sc.nextInt();
            int contador = edad++;
            if (edad < 0 && edad > 100){
                System.out.println("Edad introducida no válida.");
            }
            for (int i = 0; i < edad; i++) {
                System.out.println(i);
                float media = contador / i;
                System.out.println("La media de las edades introducidas es: " + media);

        }while (true);*/

    }

}
