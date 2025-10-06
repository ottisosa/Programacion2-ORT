package Manejo_de_listas_Gastos;

public class GastosCasa {

    public static void main(String[] args) {
        Casa casa = new Casa();
        
        casa.agregarGasto(new Gasto(15,"UTE",3000));
        casa.agregarGasto(new Gasto(1,"Antel",1500));
        casa.agregarGasto(new Gasto(10,"Alquiler",8000));
        casa.agregarGasto(new Gasto(12,"Super",1200));
        casa.agregarGasto(new Gasto(15,"Cable",1250));
                
        Interfaz.menu(casa);
    }
    
}
