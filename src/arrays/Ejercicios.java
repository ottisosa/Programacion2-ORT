package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicios {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //  PRIMER ARRAY  //
        System.out.print("Ingrese el largo del array: ");

        int cantidad = sc.nextInt();

        int[] datos1 = new int[cantidad];

        for (int i = 0; i < datos1.length; i++) {

            System.out.print("Ingrese valor para la poscicion " + i + ": ");
            datos1[i] = sc.nextInt();
        }

        //  SEGUNDO ARRAY  //
        System.out.println("Ingrese longitud del segundo array");

        int cantidad2 = sc.nextInt();

        int[] datos2 = new int[cantidad2];

        for (int i = 0; i < datos2.length; i++) {

            System.out.println("Ingrese el valor para la poscicion " + i + ": ");
            datos2[i] = sc.nextInt();
        }

        // ARRAY DE NOMBRES PARA EL EJERCICIO 7 //
//        System.out.println("Ingrese una cantidad de nombres entre 5 y 30");
//        int cantidadS = sc.nextInt();
//        String[] nombres = new String[cantidadS];
//        for (int i = 0; i < nombres.length; i++) {
//            System.out.println("Ingrese el nombre para la poscicion " + i + ": ");
//            nombres[i] = sc.next();
//       }
        // LOGS DE LOS ARRAYS //
        System.out.println(Arrays.toString(datos1));
        System.out.println(Arrays.toString(datos2));
//        System.out.println(Arrays.toString(nombres));

//        Ejercicio1(datos1);
//        Ejercicio2(datos1);
//        Ejercicio3(datos1);
//        int[] ejer = Ejercicio5(datos1, datos2);
//        System.out.println(Arrays.toString(ejer));
//        Ejercicio6();
//        Ejercicio7(nombres);
//        Ejercicio8(datos1);
//        System.out.println(Ejercicio9(datos1));
        System.out.println(Ejercicio10(datos1));
    }

    // EJERCICIO 1 //
    public static void Ejercicio1(int[] datos1) {

        char elem = '*';
        for (int i = 0; i < datos1.length; i++) {

            System.out.print(datos1[i] + ": ");

            for (int j = 0; j < datos1[i]; j++) {

                System.out.print(elem);
            }

            System.out.println();

        }

    }

    // EJERCICIO 2 //
    public static void Ejercicio2(int[] datos1) {

        for (int i = datos1.length - 1; i >= 0; i--) {

            System.out.println(datos1[i]);

        }

    }

    // EJERCICIO 3 //
    public static void Ejercicio3(int[] datos1) {

        boolean ascendente = true;
        boolean descendente = true;
        int anterior = datos1[0];

        for (int i = 0; i < datos1.length; i++) {

            if (datos1[i] > anterior) {

                descendente = false;

            }

            if (datos1[i] < anterior) {

                ascendente = false;
            }

            anterior = datos1[i];
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

    // EJERCICIO 5 //
    public static int[] Ejercicio5(int[] datos1, int[] datos2) {

        int[] respuesta = new int[datos1.length + datos2.length];

        int pos1 = 0;
        int pos2 = 0;

        for (int i = 0; i < respuesta.length; i++) {

            if ((pos1 < datos1.length && pos2 < datos2.length && datos1[pos1] < datos2[pos2]) || pos2 >= datos2.length) {
                respuesta[i] = datos1[pos1];

                pos1++;

            } else {

                respuesta[i] = datos2[pos2];
                pos2++;

            }

        }

        return respuesta;
    }

    // EJERCICIO 6 //
    public static void Ejercicio6() {

        int[] datos = new int[10];
        int puestos = 0;

        while (puestos < 10) {

            int numero = (int) (Math.random() * 20 + 1);

            boolean iguales = false;

            for (int i = 0; i < puestos && iguales; i++) {

                if (datos[i] == numero) {

                    iguales = true;

                }

            }

            if (!iguales) {
                datos[puestos] = numero;
                puestos++;
            }

        }
        System.out.println("Array");

        for (int i = 0; i < datos.length; i++) {
            System.out.print(datos[i]);
        }

    }

    // EJERCICIO 7 //
    public static void Ejercicio7(String[] nombres) {

        int indiceCentro = (int) (Math.random() * nombres.length);
        String centro = nombres[indiceCentro];

        System.out.println("Elegido para ir al medio: " + centro);

        int indiceEmpieza = (int) (Math.random() * nombres.length);
        String empieza = nombres[indiceEmpieza];

        System.out.println("Se empieza el canto por: " + empieza);

        int palabras = 17;

        int indiceGanador = (indiceEmpieza + palabras - 1) % nombres.length;

        String ganador = nombres[indiceGanador];

        System.out.println("El ganador es: " + ganador);

    }

    // EJERCICIO 8 //
    public static void Ejercicio8(int[] datos1) {

        Arrays.sort(datos1);

        for (int i = 0; i < datos1.length; i++) {

            System.out.print(datos1[i] + " ");

        }
    }

    // EJERCICIO 9 //
    public static boolean Ejercicio9(int[] datos1) {

        boolean puede = false;
        Arrays.sort(datos1);

        for (int i = 0; i < datos1.length - 3 && puede; i++) {

            if (datos1[i] != datos1[i + 1] && datos1[i + 1] != datos1[i + 2] && datos1[i] != datos1[i + 2] && datos1[i + 2] - datos1[i] <= 2) {

                puede = true;

            }

        }

        return puede;

    }

    // EJERCICIO 10 //
    public static int Ejercicio10(int[] datos1) {

        int mejor = 0;
        int cantCom = 0;
        for (int i = 0; i < datos1.length - 1; i++) {

            if (datos1[i] > datos1[i + 1]) {

                cantCom++;

            }

            if (datos1[i] < datos1[i + 1] && cantCom > mejor) {

                mejor = cantCom;
                cantCom = 0;
            }

        }
        
        if(cantCom > mejor){
            
            mejor = cantCom;
        }

        return mejor;
    }

}
