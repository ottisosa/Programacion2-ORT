package Manejo_de_listas_Gastos;

import java.util.*;

public class Interfaz {

    public static void menu(Casa casa){
        Scanner in = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 7){
            System.out.println("\nGASTOS DE LA CASA\n");
            System.out.println("1. Ingresar gasto");
            System.out.println("2. Mostrar todos");
            System.out.println("3. Gasto mayor");
            System.out.println("4. Ordenar");
            System.out.println("5. Indicar si esta monto");
            System.out.println("6. Buscar gasto de monto");
            System.out.println("7. Fin");
            opcion = pedirNumero("Elija su opcion (1-7): ",1,7);
            switch(opcion){
                case 1:
                    casa.agregarGasto(ingresarGasto());
                    break;
                case 2:
                    mostrarTodos(casa);
                    break;
                case 3:
                    System.out.println("Gasto mayor: "+casa.gastoMayor());
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
            }
        }
        System.out.println("Hasta luego");
    }
    
    public static void mostrarTodos(Casa casa){
        System.out.println("** Lista de gastos **");
        for(Gasto gasto : casa.getListaGastos()){
            System.out.println(gasto);
        }
    }
    
    public static Gasto ingresarGasto(){
        Scanner in = new Scanner(System.in);
        int dia=0, monto=0;
        String descripcion="";
        dia = pedirNumero("Ingrese dia: ",1,31);
        System.out.print("Ingrese descripcion: ");
        descripcion = in.nextLine();
        monto = pedirNumero("Ingrese monto: ",1,10000000);
        Gasto unG = new Gasto(dia, descripcion, monto);
        return unG;
    }
    
    public static int pedirNumero(String mensaje, int minimo, int maximo){
        Scanner in = new Scanner(System.in);
        int dato = 0;
        boolean ok = false;
        while (!ok){
            try {
                System.out.print(mensaje);
                dato = in.nextInt();
                in.nextLine();
                if (dato<minimo || dato>maximo){
                    System.out.println("Valor fuera de rango");
                }
                else {
                    ok = true;
                }
            }
            catch(InputMismatchException e){
                System.out.println("Ingrese solo numeros, por favor");
                in.nextLine();
            }
        }
        return dato;
    }
    
    
}
