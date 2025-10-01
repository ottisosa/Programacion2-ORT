package herencia;

public class libro extends publicacion {

    private String isbn;

    public libro() {

        this.isbn = "Sin ISBN";
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }
    
    
    
    @Override
    public String toString(){
    
        return this.getTitulo() + " " + this.getCantPag() + " ISBN: " + this.getIsbn();
    }
}
