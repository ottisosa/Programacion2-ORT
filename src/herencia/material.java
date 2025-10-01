package herencia;

public class material {

    private String titulo;

    public material() {

        this.titulo = "Sin titulo";
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    
    @Override
    
    
    public String toString(){
    
        return "Titulo: " + this.getTitulo();
    }
    
}
