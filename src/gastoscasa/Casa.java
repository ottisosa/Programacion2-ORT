package gastoscasa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Casa {
    private ArrayList<Gasto> listaGastos;

    public ArrayList<Gasto> getListaGastos() {
        return listaGastos;
    }

    public void agregarGasto(Gasto unGasto) {
        this.listaGastos.add(unGasto);
    }
    
    public Casa(){
        listaGastos = new ArrayList<>();
    }
    
    
    public Gasto gastoMayor(){
        Gasto maximo = new Gasto();
        for(int i=0; i<listaGastos.size(); i++){
            if (listaGastos.get(i).getMonto() > maximo.getMonto()){
                maximo = listaGastos.get(i);
            }
        }
        return maximo;
    }
    
    public void ordenarPorMontoCreciente(){
        Collections.sort(listaGastos);        
    }
    
    public void ordenarPorMontoDecreciente(){
        Collections.sort(listaGastos, new CriterioMontoDec());        
    }
    
    public void ordenarPorDescripcion(){
        Collections.sort(listaGastos, new CriterioDescripcion());        
    }

    public void ordenarPorDiaDescripcion(){
        Collections.sort(listaGastos,
                new Comparator<Gasto>(){
                    public int compare(Gasto g1, Gasto g2){
                        int dif = g1.getDia()-g2.getDia();
                        if (dif == 0){
                            dif = g1.getDescripcion().compareTo(g2.getDescripcion());
                        }
                        return dif;
                    }
            });                
    }
    
    // Inner class con nombre
    private class CriterioDescripcion implements Comparator<Gasto>{
        public int compare(Gasto g1, Gasto g2){
            return g1.getDescripcion().compareTo(g2.getDescripcion());
        }
    }    
    
}
