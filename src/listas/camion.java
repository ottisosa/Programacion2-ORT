package listas;

public class camion {

    private int nro;
    private String matricula;
    private String conductor;

    public camion() {

        this.setNro(00);
        this.setMatricula("AAA000");
        this.setConductor("conductor");

    }

    public camion(int num, String mat, String con) {

        this.setNro(num);
        this.setMatricula(mat);
        this.setConductor(con);
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    public int getNro() {
        return nro;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getConductor() {
        return conductor;
    }

    @Override

    public String toString() {

        return this.getNro() + " - " + this.getMatricula() + " - " + this.getConductor();
    }

}
