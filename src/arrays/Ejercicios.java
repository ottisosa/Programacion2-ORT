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
        
        int[] datos2 = new int [cantidad2];
        
        for (int i = 0; i < datos2.length; i++) {
            
            System.out.println("Ingrese el valor para la poscicion " + i + ": ");
            datos2[i] = sc.nextInt();
        }
        
        System.out.println(Arrays.toString(datos1));

//        Ejercicio1(datos1);
//        Ejercicio2(datos1);
//        Ejercicio3(datos1);
//        Ejercicio5(datos1,datos2);

    }

    // EJERCICIO 1 //
    public static void Ejercicio1(int[] datos1) {

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
    public static void Ejercicio2(int[] datos1) {

        for (int i = datos.length - 1; i >= 0; i--) {

            System.out.println(datos[i]);

        }

    }

    // EJERCICIO 3 //
    public static void Ejercicio3(int[] datos1) {

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

    // EJERCICIO 5 //
    
    public static void Ejercicio5(int[] datos1 , int[] datos2){
    
        int [] respuesta;
        
        for (int i = 0; i < datos1.length; i++) {
         
            for (int j = 0; j < datos2.length; j++) {
              
                if(datos2[i] < datos1[i]){
               
                }
                
            }
            
        }
        
    }
}
