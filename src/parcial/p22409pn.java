package parcial;

public class p22409pn {

    public static void main(String[] args) {

    }

    //  EJERCICIO 1 //
    public static String proceso(String[] teclas, String texto) {

        String retorno = "";

        texto = texto.toUpperCase();

        for (int i = 0; i < texto.length(); i++) {

            String letra = texto.charAt(i) + "";

            for (int j = 2; j < teclas.length; j++) {

                if (teclas[j].contains(letra)) {

                    retorno = retorno + "" + j;

                }

            }

        }

        return retorno;

    }

    // EJERCICIO 2  //
    // A //
    public static int cantImpar(int[][] matriz) {

        int retorno = -1;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[0].length; j++) {

                int elem = matriz[i][j];
                int cant = 0;

                for (int k = 0; k < matriz.length; k++) {

                    for (int l = 0; l < matriz[0].length; l++) {

                        if (matriz[k][l] == elem) {

                            cant++;

                        }

                    }

                }

                if (cant % 2 == 1) {

                    retorno = elem;
                }

            }

        }

        return retorno;

    }

    // B //
    public static int[][] generar(int[][] mat) {

        int[][] nueva = new int[mat.length][mat[0].length];

        int suma = 0;

        for (int j = 0; j < mat[0].length; j++) {

            suma += mat[j][0];

        }

        for (int i = 0; i < mat.length; i++) {

            nueva[i][0] = suma;
            
            for (int j = 0; j < mat[0].length; j++) {
                
                nueva[i][j]= mat[i][j];
            } 

        }

        return nueva;
    }

}
