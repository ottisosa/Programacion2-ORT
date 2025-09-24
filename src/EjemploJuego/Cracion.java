package EjemploJuego;

public class Cracion {

    public static void main(String[] args) {

        Juego j1 = new Juego();
        Juego j2 = new Juego("Tateti", 2, 20);

        System.out.println(j1);
        System.out.println(j2);

        if (j2.esAplicable(20)) {
            System.out.println("SI");

        } else {

            System.out.println("NO");
        }

        Fabricante fab = new Fabricante();
        fab.setNombre("lego");
        fab.setPais("rusia");

        System.out.println(fab);
        
        
        j2.setFabricante(fab);
        j1.setFabricante(fab);
        
        System.out.println(j2.getFabricante().getPais());
        j2.getFabricante().setPais("BRASIL");
        System.out.println(j1.getFabricante().getPais());

    }

}
