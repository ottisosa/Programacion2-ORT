package parcial;

public class p22505pn {

    public static void main(String[] args) {

    }

    public static boolean esCrecienteEspecial(int[] datos) {

        boolean estrictamente = true;
        int suma = datos[datos.length - 1];
        int repeticion = 0;

        for (int i = 0; i < datos.length - 1 && estrictamente; i++) {

            if (datos[i] > datos[i + 1]) {

                estrictamente = false;

            }
            suma += datos[i];

            if (datos[i] == datos[i + 1]) {

                repeticion++;

            }

            if (repeticion > 1) {

                estrictamente = false;

                repeticion = 0;
            }

        }

        if (suma % 2 != 0) {

            estrictamente = false;
        }

        return estrictamente;

    }

    public static int cantidadEspeciales(int[][] mat) {

        int contador = 0;

        for (int i = 0; i < mat.length; i++) {

            if (esCrecienteEspecial(mat[i])) {

                contador++;
            }

        }

        for (int j = 0; j < mat[0].length; j++) {
            int[] nuevo = new int[mat.length];
            for (int m = 0; m < mat.length; m++) {
                nuevo[m] = mat[m][j];
            }
            if (esCrecienteEspecial(nuevo)) {
                contador++;
            }
        }

        return contador;

    }

    public static boolean cantidades(String[][] mat) {

        int cantA = 0;
        int cantB = 0;

        for (int i = 0; i < mat.length / 2; i++) {

            for (int j = 0; j < mat[i].length; j++) {

                if (mat[i][j].toUpperCase().charAt(0) == 'A') {

                    cantA++;
                }

            }

        }

        for (int i = mat.length/2; i < mat.length / 2; i++) {

            for (int j = 0; j < mat[i].length; j++) {
                
                if (mat[i][j].toUpperCase().charAt(0) == 'B') {

                    cantB++;
                }
            }

        }


        return cantA == cantB;
    }

}
