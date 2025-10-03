package ejerListas;

import java.util.ArrayList;
import java.util.Iterator;

public class Listas {

    public static void main(String[] args) {

        listarPersonas();

    }

    public static void listarPersonas() {

        Personas per1 = new Personas("Jose", 20);
        Personas per2 = new Personas("maria", 15);
        Personas per3 = new Personas("lorenzo", 60);
        Personas per4 = new Personas("Yayo", 10);
        Personas per5 = new Personas("Mario", 20);

        ArrayList<Personas> listaPersonas = new ArrayList<>();

        listaPersonas.add(per1);
        listaPersonas.add(per2);
        listaPersonas.add(per3);
        listaPersonas.add(per4);
        listaPersonas.add(per5);

        Iterator it = listaPersonas.iterator();
        
        while(it.hasNext()){
        
          Personas personaMiPersona = (Personas)it.next();
            
            if (personaMiPersona.getEdad() >= 18) {
                
                System.out.println(personaMiPersona);
                
            }
        
            
        }

    }

}
