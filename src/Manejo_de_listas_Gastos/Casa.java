package Manejo_de_listas_Gastos;

import java.util.ArrayList;

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
}
