package EjemploJuego;

public class Fabricante {

    private String nombre;
    private String pais;

        public Fabricante() {

        this.setNombre("Fabricante predeterminado");
        this.setPais("Pais predeterminado");
    }

    public Fabricante(String nombre, String pais) {

        this.setNombre(nombre);
        this.setPais(pais);
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }
    
    @Override
    
    public String toString(){
        
        return this.getNombre().toUpperCase() + " - " + this.getPais();
    
    }

}
