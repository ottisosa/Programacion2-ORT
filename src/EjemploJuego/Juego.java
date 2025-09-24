package EjemploJuego;

public class Juego {

    private int edadMinima;
    private int edadMaxima;
    private String nombre;
    private Fabricante fabricante;

    public Juego() {

        this.setNombre("Juego predeterminado");
        this.setEdadMinima(1);
        this.setEdadMaxima(99);

    }

    public Juego(String nombre, int edad1, int edad2) {

        this.setNombre(nombre);
        this.setEdadMinima(Math.min(edad1, edad2));
        this.setEdadMaxima(Math.max(edad1, edad2));
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public void setEdadMaxima(int edadMaxima) {
        this.edadMaxima = edadMaxima;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public int getEdadMinima() {

        return this.edadMinima;
    }

    public int getEdadMaxima() {
        return edadMaxima;
    }

    public String getNombre() {
        return nombre;
    }

    // ESTA FIRMA HAY QUE PONER CUANDO VAMOS A REDEFINIR UN METODO YA DEFINIDO POR JAVA  //
    @Override

    public String toString() {

        return this.getNombre().toUpperCase() + " (Desde los " + this.getEdadMinima() + " Hasta los " + this.getEdadMaxima() + ")";
    }

    public Boolean esAplicable(int edad) {

        return (this.getEdadMaxima() >= edad) && (this.getEdadMinima() <= edad);
    }

}
