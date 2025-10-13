package gastoscasa;

public class Gasto implements Comparable<Gasto>{
    private int dia;
    private String descripcion;
    private int monto;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public Gasto(int dia, String descripcion, int monto) {
        this.dia = dia;
        this.descripcion = descripcion;
        this.monto = monto;
    }
    
    public Gasto(){
        
    }

    @Override
    public String toString() {
        return dia + " " + descripcion + " $ " + monto;
    }

    @Override
    // Criterio por defecto: por monto, creciente
    public int compareTo(Gasto unGasto) {
        return this.getMonto() - unGasto.getMonto();        
    }
    
    @Override
    public boolean equals(Object obj){
        Gasto unGasto = (Gasto)obj;
        return this.getMonto() == unGasto.getMonto();
    }
    
}
