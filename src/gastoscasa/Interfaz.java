package gastoscasa;

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
                    ordenar(casa);
                    break;
                case 5:
                    buscarMonto(casa);
                    break;
                case 6:
                    traerMonto(casa);
                    break;
            }
        }
        System.out.println("Hasta luego");
    }
    
    public static void buscarMonto(Casa casa){
        int monto = pedirNumero("Ingrese monto a buscar: ",1,1000000);
        Gasto aux = new Gasto();
        aux.setMonto(monto);
        if (casa.getListaGastos().contains(aux)){
            System.out.println("Existe un gasto con ese monto");
        }
        else {
            System.out.println("NO existe un gasto con ese monto");
        }
    }

    public static void traerMonto(Casa casa){
        int monto = pedirNumero("Ingrese monto a buscar: ",1,1000000);
        Gasto aux = new Gasto();
        aux.setMonto(monto);
        if (casa.getListaGastos().contains(aux)){
            int posicion = casa.getListaGastos().indexOf(aux);
            Gasto nuevo = casa.getListaGastos().get(posicion);
            System.out.println(nuevo);        
        }
        else {
            System.out.println("NO existe un gasto con ese monto");
        }
    }

    public static void ordenar(Casa casa){
        Scanner in = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 5){
            System.out.println("\nORDENAR\n");
            System.out.println("1. por monto, creciente");
            System.out.println("2. por monto, decreciente");
            System.out.println("3. por descripcion");
            System.out.println("4. por dia y descripcion");
            System.out.println("5. volver al menu");
            opcion = pedirNumero("Elija su opcion (1-5): ",1,5);
            switch(opcion){
                case 1:
                    casa.ordenarPorMontoCreciente();
                    mostrarTodos(casa);
                    break;
                case 2:
                    casa.ordenarPorMontoDecreciente();
                    mostrarTodos(casa);
                    break;
                case 3:
                    casa.ordenarPorDescripcion();
                    mostrarTodos(casa);
                    break;
                case 4:
                    casa.ordenarPorDiaDescripcion();
                    mostrarTodos(casa);
                    break;
            }
        }
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
