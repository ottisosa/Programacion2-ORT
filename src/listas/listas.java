package listas;

import java.util.ArrayList;

public class listas {

    public static void main(String[] args) {

            listarCamiones();

    }

    public static void listarCamiones() {

        camion cam1 = new camion(21002, "LAA2504", "JoseMario");

        camion cam2 = new camion(36267, "LAA1839", "Martin");

        camion cam3 = new camion(44732, "LAA0018", "Pepe");

        ArrayList<camion> listaCamiones = new ArrayList<>();

        //  METODOS  //
        
        // .add(obj)  agrega un objeto
        listaCamiones.add(cam1); 
        listaCamiones.add(cam2);
        listaCamiones.add(cam3); 

        // .remove(posc)  Elimina un objeto
        listaCamiones.remove(2);  // En esta poscicion

        listaCamiones.remove(cam1);  // Elimina el objeto

        System.out.println(listaCamiones);
        
        
        //  RECORRER LISTAS  //
        
        
        // For tradicional
        
        for (int i = 0; i < listaCamiones.size() ; i++) {
            
            System.out.println("NRO:" +listaCamiones.get(i));
            
        }
        
        // For mejorado
        
        for(camion cam : listaCamiones){
    
        System.out.println(cam);
    }
        
        
        //  LISTAS NUMERICAS  //

        ArrayList<Integer> listaNums = new ArrayList<>();

        listaNums.add(20);
        listaNums.add(30);
        
        
        listaNums.remove(0);
        
                
        System.out.println(listaNums);
    }

}
