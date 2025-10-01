package herencia;

public class publicacion extends material {

    private int cantPag;

    
    public publicacion(){
    
        this.cantPag = 10;
    }

   
    public void setCantPag(int cantPag) {
        this.cantPag = cantPag;
    }

    public int getCantPag() {
        return cantPag;
    }
    
    
    
    @Override
    
    
    public String toString(){
    
        return "Cantidad de paginas: " + this.getCantPag();
    }
    
    
}
