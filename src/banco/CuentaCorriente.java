package ejemplobanco;

import java.util.ArrayList;

public class CuentaCorriente extends Cuenta {
    private ArrayList<String> listaCheques;

    public ArrayList<String> getListaCheques() {
        return listaCheques;
    }
    
    private void agregarCheque(String unCheque){
        listaCheques.add(unCheque);
    }
    
    public boolean emitirCheque(String cheque, float unMonto){
        boolean puede = false;
        if (this.retirar(unMonto)){
            puede = true;
            agregarCheque(cheque);
        }
        return puede;
    }
    
    public CuentaCorriente(float unMonto){
        this.depositar(unMonto);
        listaCheques = new ArrayList<>();
    }
    
    @Override
    public String toString(){
        return super.toString()+"  "+this.getListaCheques()+"";
    }
        
}
