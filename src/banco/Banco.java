package ejemplobanco;

import java.util.ArrayList;

public class Banco {
    private ArrayList<Cuenta> listaCuentas;

    public ArrayList<Cuenta> getListaCuentas() {
        return listaCuentas;
    }

    public void agregarCuenta(Cuenta cuenta){
        listaCuentas.add(cuenta);
    }
    
    public Banco(){
        listaCuentas = new ArrayList<>();
    }
    
    @Override
    public String toString(){
        String cuentas = "LISTA DE CUENTAS\n";
        for (Cuenta cta : listaCuentas){
            cuentas += cta + "\n";
        }
        return cuentas;
    }
    
    public float promedioSaldos(){
        float total = 0;
        for (Cuenta c : listaCuentas){
            total += c.getSaldo();
        }
        return total / listaCuentas.size();
    }
    
}
