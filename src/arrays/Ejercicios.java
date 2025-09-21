package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicios {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el largo del array: ");

        int cantidad = sc.nextInt();

        int[] datos = new int[cantidad];

        for (int i = 0; i < datos.length; i++) {

            System.out.print("Ingrese valor para la poscicion " + i + ": ");
            datos[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(datos));

//        Ejercicio1(datos);
//        Ejercicio2(datos);
        Ejercicio3(datos);

    }

    // EJERCICIO 1 //
    public static void Ejercicio1(int[] datos) {

        char elem = '*';
        for (int i = 0; i < datos.length; i++) {

            System.out.print(datos[i] + ": ");

            for (int j = 0; j < datos[i]; j++) {

                System.out.print(elem);
            }

            System.out.println();

        }

    }

    // EJERCICIO 2 //
    public static void Ejercicio2(int[] datos) {

        for (int i = datos.length - 1; i >= 0; i--) {

            System.out.println(datos[i]);

        }

    }

    // EJERCICIO 3 //
    public static void Ejercicio3(int[] datos) {

        boolean ascendente = true;
        boolean descendente = true;
        int anterior = datos[0];

        for (int i = 0; i < datos.length; i++) {

            if (datos[i] > anterior) {

                descendente = false;

            }

            if (datos[i] < anterior) {

                ascendente = false;
            }

            anterior = datos[i];
        }

        if (ascendente) {

            System.out.println("El array es ascendente");
            
        } else {

            if (descendente) {

                System.out.println("El array es descendente");
                
            } else {
                
                System.out.println("El array no tiene orden");
                
            }

        }

    }

}
