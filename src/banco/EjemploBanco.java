package ejemplobanco;

public class EjemploBanco {

    public static void main(String[] args) {
        System.out.println("\nPrueba con Caja de Ahorros\n");
        CajaAhorro ca = new CajaAhorro(8000);
        ca.setNombre("Ana");
        System.out.println(ca);
        ca.depositar(3000);
        ca.acumularInteres();
        System.out.println(ca);

        CajaAhorro ca1 = new CajaAhorro(6000);
        ca1.setNombre("Maria");
        ca1.acumularInteres();
        
        CajaAhorro ca2 = new CajaAhorro(7000);
        ca2.setNombre("Raul");
        ca2.depositar(3500);
        ca2.acumularInteres();
        
        System.out.println("\nPrueba con Cuentacorriente\n");
        CuentaCorriente cc = new CuentaCorriente(15000);
        cc.setNombre("Pedro");
        cc.emitirCheque("Cheque por 1500", 1500);
        cc.emitirCheque("Cheque por 2600", 2600);
        cc.emitirCheque("Cheque por 26000", 26000);
        cc.emitirCheque("Cheque por 1400", 1400);
        
        CuentaCorriente cc1 = new CuentaCorriente(12000);
        cc1.setNombre("Luis");
        CuentaCorriente cc2 = new CuentaCorriente(9000);
        cc2.emitirCheque("Cheque por 2900", 2900);
        cc2.setNombre("Juan");
        
        System.out.println(cc);
        
        
        System.out.println("\n-------------------\nCREAMOS EL BANCO\n");
        Banco banco = new Banco();
        banco.agregarCuenta(ca);
        banco.agregarCuenta(cc);
        banco.agregarCuenta(ca1);
        banco.agregarCuenta(cc1);
        banco.agregarCuenta(ca2);
        banco.agregarCuenta(cc2);
        
        System.out.println(banco);
        
        System.out.println("Promedio de saldos: "+banco.promedioSaldos());
        
    }
    
}
