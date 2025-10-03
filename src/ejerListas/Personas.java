package ejerListas;

public class Personas {

    private String Nombre;
    private int edad;

    public Personas() {

        this.setEdad(20);
        this.setNombre("PEPE");

    }

    public Personas(String Nombre, int Edad) {

        this.setNombre(Nombre);
        this.setEdad(Edad);
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getEdad() {
        return edad;
    }
    
    @Override
    
    
    public String toString(){
    
        return this.getNombre() + " " + this.getEdad();
    }
    
    
    

}
