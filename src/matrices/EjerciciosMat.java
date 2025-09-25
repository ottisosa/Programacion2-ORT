package matrices;

import java.util.Arrays;

public class EjerciciosMat {

    public static void main(String[] args) {

        int[][] ejer1 = {{5, 2, 3, 4, 5, 3, 5, 7, 8, 3, 6, 2, 6, 3, 2, 5, 7, 8, 9, 2, 1, 2, 5, 6, 3, 6, 3, 2, 6, 8},
        {6, 7, 7, 1, 9, 7, 4, 3, 6, 2, 6, 2, 2, 4, 6, 1, 5, 6, 7, 2, 2, 4, 1, 2, 4, 5, 1, 2, 4, 5},
        {4, 5, 3, 1, 7, 8, 9, 8, 6, 7, 9, 7, 3, 5, 6, 7, 3, 4, 6, 2, 4, 6, 8, 9, 5, 8, 9, 9, 8, 6},
        {6, 8, 3, 2, 4, 6, 5, 4, 6, 3, 7, 4, 3, 4, 5, 6, 7, 8, 9, 3, 9, 7, 5, 9, 7, 2, 5, 3, 7, 9},
        {4, 5, 3, 1, 8, 4, 6, 3, 8, 7, 6, 1, 5, 8, 5, 1, 6, 1, 4, 3, 7, 8, 3, 8, 5, 3, 1, 5, 3, 6},
        {6, 8, 3, 2, 8, 3, 5, 6, 6, 9, 7, 6, 9, 7, 4, 2, 7, 6, 2, 9, 4, 7, 6, 7, 9, 2, 6, 7, 7, 2}};

//        mostrarMatriz(ejer1);
//        System.out.println(promedio(ejer1));
        int[][] ejer2 = {{3, 5},
        {2, 4},
        {-1, -2},
        {-1, 8}};

//        mostrarMatriz(ejer2);
//        System.out.println(sumaRectangular(ejer2));
//        System.out.println(Arrays.toString(sumaRectangular(ejer2)));
        int[][] ejer3 = {{1, 2, 3}, {4, 2, 0}, {1, 2, 3}};
//        mostrarMatriz(ejer3);
//        System.out.println(matrizEspecial(ejer3));

        int[][] ejer4 = {{1, 1, 5, 1, 1,}, {1, 1, 1, 1, 1}, {5, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 5, 1, 1}};

//        mostrarMatriz(ejer4);
//        System.out.println(repetidos(ejer4, 2, 1));
        int[][] ejer5 = {{0, 1, 0, 0},
        {1, 1, 1, 0},
        {0, 1, 0, 0},
        {1, 1, 0, 0}};

        mostrarMatriz(ejer5);
        System.out.println(calcularPerimetro(ejer5));

    }

    //  METODO PARA MOSTRAR LAS MATRICES  //
    public static void mostrarMatriz(int[][] mat) {
        System.out.println("");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");

    }

    // EJERCICIO 1 //
    public static float promedio(int[][] mat) {

        float total = 0;
        float contador = 0;

        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat[0].length; j++) {

                total += mat[i][j];

                contador++;

            }
        }

        float promedio = total / contador;

        return promedio;

    }

    // EJERCICIO 2 //
    public static int[] sumaRectangular(int[][] mat) {

        int columnas = mat[0].length;
        int[] sumaColumnas = new int[columnas];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < columnas; j++) {

                sumaColumnas[j] += mat[i][j];

            }

        }

        return sumaColumnas;

    }

    // EJERCICIO 3 //
    public static boolean matrizEspecial(int[][] mat) {

        boolean especial = true;
        int F = mat.length;
        int C = mat[0].length;

        // Para que tenga sentido debe ser cuadrada
        if (F != C) {
            especial = false;
        }

        int sumaRef = 0;

        for (int i = 0; i < C; i++) {
            sumaRef += mat[0][i];

        }

        for (int i = 1; i < F; i++) {
            int sumaFila = 0;
            for (int j = 0; j < C; j++) {
                sumaFila += mat[i][j];
            }
            if (sumaFila != sumaRef) {
                especial = false;
            }
        }

        for (int j = 0; j < C; j++) {
            int sumaCol = 0;
            for (int i = 0; i < F; i++) {
                sumaCol += mat[i][j];
            }
            if (sumaCol != sumaRef) {
                especial = false;
            }
        }

        // 4. Verificar la diagonal principal
        int sumaDiagonal = 0;
        for (int i = 0; i < F; i++) {
            sumaDiagonal += mat[i][i];
        }
        if (sumaDiagonal != sumaRef) {
            especial = false;
        }

        return especial;
    }

    // EJERCICIO 4 //
    public static boolean repetidos(int[][] mat, int fila, int col) {

        int valor = mat[fila][col];
        int filas = mat.length;
        int columnas = mat[0].length;
        boolean repetidos = false;

        // revisar la diagonal principal
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                if (i - fila == i - col && !(i == fila && j == col)) {

                    if (mat[i][j] == valor) {

                        repetidos = true;
                    }
                }

            }
        }
        // Revisar diagonal secundaria
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i - fila == col - j && !(i == fila && j == col)) {
                    if (mat[i][j] == valor) {
                        repetidos = true;
                    }
                }
            }
        }

        return repetidos;
    }

    // EJERCICIO 5 //
    public static int calcularPerimetro(int[][] mat) {

        int perimetro = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {

                if (mat[i][j] == 1) {

                    // arriba
                    if (i == 0) {

                        perimetro++;

                    } else {

                        if (mat[i - 1][j] == 0) {

                            perimetro++;
                        }
                    }
                    if (i == mat.length - 1) {

                        perimetro++;
                    } else {
                        if (mat[i + 1][j] == 0) {
                            perimetro++;
                        }
                    }
                    // izquierda
                    if (j == 0) {
                        perimetro++;
                    } else {
                        if (mat[i][j - 1] == 0) {
                            perimetro++;
                        }
                    }
                    // derecha
                    if (j == mat[0].length - 1) {
                        perimetro++;
                    } else {
                        if (mat[i][j + 1] == 0) {
                            perimetro++;
                        }
                    }

                }

            }

        }

        return perimetro;
    }

    
    // EJERCICIO 6 //
    
}
