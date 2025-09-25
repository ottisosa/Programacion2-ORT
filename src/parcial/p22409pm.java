package parcial;

public class p22409pm {

    public static void main(String[] args) {

        int[] datos = {1, 3, 5, 5, 5, 5, 5, 5, 456, 123};

        System.out.println(posiciones(datos, 5));
    }

    // EJERCICIO 1 //
    public static String posiciones(int[] datos, int valor) {

        boolean esta = false;
        int primera = 1;
        int ultima = 0;

        for (int i = 0; i < datos.length && !esta; i++) {

            if (datos[i] == valor) {

                primera = i + 1;
                esta = true;

            }

        }

        if (esta) {

            esta = false;

            for (int i = datos.length - 1; i >= 0 && !esta; i--) {

                if (datos[i] == valor) {

                    ultima = i + 1;
                    esta = true;

                }
            }
        }

        if (esta == false) {
            return "NO ESTA";
        } else {
            return "Primera: " + primera + " Ultima: " + ultima;

        }
    }

    // EJERCICIO 2 //
    // A //
    public static int[][] mapa(int cantFilas, int cantPorFila) {

        int[][] nueva = new int[cantFilas][cantPorFila];
        int num = 1;
        boolean izq = true;

        for (int i = cantFilas - 1; i >= 0; i++) {

            if (izq) {

                for (int j = 0; j < cantPorFila; j++) {

                    nueva[i][j] = num;
                    num++;

                }
            } else {

                for (int j = cantPorFila - 1; j >= 0; j++) {

                    nueva[i][j] = num;
                    num++;
                }
            }

            izq = !izq;

        }

        return nueva;

    }

    // B //
    public static boolean esVentana(int[][] mapa, int numero) {

        boolean ventana = false;

        for (int i = 0; i < mapa.length; i++) {

            if (numero == mapa[i][0]) {

                ventana = true;
            }

            if (numero == mapa[i][mapa.length - 1]) {

                ventana = true;
            }

        }

        return ventana;

    }

}
