package parcial;

public class p22504pm {

    public static void main(String[] args) {
        double[] datos = {0, 0, 9, 2, 0};

        System.out.println(valorDecimal(datos));
    }

    public static double valorDecimal(double[] datos) {

        boolean empezar = false;

        double retorno = 0;

        for (int i = 0; i < datos.length; i++) {

            if (datos[i] != 0) {

                empezar = true;

            }

            if (empezar) {

                retorno = retorno * 10 + datos[i];

            }

        }

        return retorno;
    }

    public static double[][] proceso(double[][] mat) {

        double[][] respuesta = new double[mat.length][2];

        for (int i = 0; i < mat.length; i++) {

            double suma = 0;

            for (int j = 0; j < mat[0].length; j++) {

                suma = suma + mat[i][j];

            }

            respuesta[i][0] = suma;
            respuesta[i][1] = valorDecimal(mat[i]);

        }

        return respuesta;

    }

    public static String maximaDiferencia(int[][] mat, int p, int q) {

        int diferenciaMax = Integer.MIN_VALUE;

        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat.length; j++) {

                if (i != j) {

                    int diferencia = Math.abs(mat[i][p] - mat[j][q]);

                    if (diferencia > diferenciaMax) {

                        diferenciaMax = diferencia;
                    }
                }

            }

        }

        return "Maxima diferencia: "+ diferenciaMax;
    }
}
