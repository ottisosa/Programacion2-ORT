package ejemplobanco;

public class CajaAhorro extends Cuenta {
    private static float Tasa=0.32f;

    public static float getTasa() {
        return Tasa;
    }

    public static void setTasa(float Tasa) {
        CajaAhorro.Tasa = Tasa;
    }
    
    public CajaAhorro(float unMonto){
        this.depositar(unMonto);
    }
    
    public void acumularInteres(){
        float interes = this.getSaldo()*Tasa/12;
        this.depositar(interes);
    }
    
}
