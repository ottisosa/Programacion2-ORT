package parcial;

public class parciales {

    public static void main(String[] args) {

    }

    // p22307pm//
    public static int bingo(int[][] carton, int[] numeros) {

        boolean completa = false;
        int retorno = -1;
        int cant = 0;
        int[] filas = new int[carton.length];

        for (int i = 0; i < carton.length && !completa; i++) {

            for (int j = 0; j < carton[0].length; j++) {

                for (int k = 0; k < numeros.length; k++) {

                    if (numeros[k] == carton[i][j]) {

                        cant++;
                    }

                    if (cant == carton[0].length) {

                        completa = true;
                        retorno = numeros[k];
                    }

                }
            }

        }

        return retorno;

    }

    // p22207pn //
    public static int masRicos(int[][] mat) {

        int maximo = 0;
        int suma = 0;
        int cantRicos = 0;

        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat[0].length; j++) {

                suma += mat[i][j];

            }

            if (suma > maximo) {

                maximo = suma;
                cantRicos = 1;

            }

            if (suma == maximo) {

                cantRicos++;
            }

            suma = 0;

        }

        return cantRicos;
    }

    //  22311pn  //
    public static int[][] alternada(int[][] matA, int[][] matB) {

        int filas = matA.length;
        int cols = matA[0].length;
        int[][] alternada = new int[filas][cols];

        for (int i = 0; i < filas; i++) {

            int minA = Integer.MAX_VALUE;

            for (int j = 0; j < cols; j++) {

                if (matA[i][j] < minA) {

                    minA = matA[i][j];

                }

            }

            int maxB = Integer.MIN_VALUE;

            for (int j = 0; j < cols; j++) {

                if (matB[i][j] > maxB) {

                    maxB = matB[i][j];
                }

            }

            for (int j = 0; j < cols; j++) {

                if (j % 2 == 0) {

                    alternada[i][j] = minA;

                } else {

                    alternada[i][j] = maxB;

                }

            }

        }

        return alternada;
    }

    // 22212pm //
    public static boolean proceso(int[][] mat) {

        boolean ordenada = true;
        int filas = mat.length;
        int col = mat[0].length;

        for (int i = 0; i < filas && ordenada; i++) {

            for (int j = 0; j < col; j++) {

                if (j < filas - 1 && mat[i][j] > mat[i][j + 1]) {

                    ordenada = false;

                }

                if (i < filas - 1 && mat[i][j] > mat[i][j + 1]) {

                    ordenada = false;
                }
            }

        }

        return ordenada;

    }

    // p22311pm //
    public static int palabraMasLargaIgual(String[][] matriz) {

        int mayor = 0;

        int filas = matriz.length;
        int col = matriz[0].length;

        for (int i = 0; i < col; i++) {

            int cantidad = 1;

            for (int j = 0; j < filas - 1; j++) {

                if (matriz[i][j].equals(matriz[i + 1][j])) {

                    cantidad++;

                } else {

                    cantidad = 1;
                }

                if (cantidad > mayor) {

                    mayor = cantidad;

                }

            }

        }

        return mayor;
    }

    // p22406pn //
    public static boolean esDecreciente(int[][] mat) {

        boolean decreciente = true;

        for (int i = 2; i < mat.length - 1 && decreciente; i++) {

            int valor = mat[1][i];
            int col = i + 1;

            for (int fila = 2; fila < mat.length - 1 && col < mat.length - 1 && decreciente; fila++) {
                if (mat[fila][col] >= valor) {
                    decreciente = false;
                }

                valor = mat[fila][col];
                col++;

            }

        }

        return decreciente;

    }

    // p22212pn //
    public static boolean especial(int[][] mat) {

        boolean especial = true;

        // revisa fil
        for (int i = 0; i < mat.length && especial; i++) {

            for (int fila = 1; fila < mat[0].length; fila++) {

                if (mat[i][fila] != mat[i][fila - 1]) {

                    especial = false;

                }

            }

        }

        // revisar col
        for (int j = 0; j < mat[0].length && especial; j++) {

            for (int i = 1; i < mat.length; i++) {

                if (mat[i][j] != mat[i - 1][j]) {

                    especial = false;

                }

            }

        }

        return especial;
    }

    
}
