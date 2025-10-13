package ejemplobanco;

public abstract class Cuenta {
    private String nombre;
    private float saldo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSaldo() {
        return saldo;
    }

    private void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Cuenta() {
    }

    @Override
    public String toString() {
        return nombre + " " + saldo;
    }
    
    public void depositar(float unMonto){
        this.setSaldo(this.getSaldo()+unMonto);
    }
    
    public boolean retirar(float unMonto){
        boolean ok = false;
        if (this.getSaldo() >= unMonto){
            ok = true;
            this.setSaldo(this.getSaldo()-unMonto);
        }
        return ok;
    }
    
}
