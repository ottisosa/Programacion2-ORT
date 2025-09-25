package parcial;

public class parcialGPT1 {

    public static void main(String[] args) {

        
    }
 
    public static String buscarEdad(int[] edades, int valor){
    
        boolean esta = false;
        int primera = 1;
        int ultima = 0;
        
        for (int i = 0; i < edades.length && esta; i++) {

            if (edades[i] == valor) {
                
                primera = i;
         
                esta = true;
            }
            
        }
        
        if(esta){
        
            esta = false;
        for (int i = edades.length-1; i >= 0 && esta; i--) {

            if(edades[i] == valor){
            
                ultima = i;
                
                esta = true;
                
                
            }
            
        }
       
        }
        
        if (esta == false) {
            
            return "NO ESTA";
            
        }else{
        
            return "Primera: " + primera + " Ultima: " + ultima;
        }
        
    }

    
    public static int[][] generarMapa(int filas, int asientosPorFila){
    
        int [][] nueva = new int [filas][asientosPorFila];
        int asiento = 1;
        
        for (int i = 0; i < nueva.length; i++) {

            for (int j = 0; j < nueva[0].length; j++) {

                nueva[i][j] = asiento;
                
                asiento ++;
            }
            
        }
       
        
        return nueva;
    }

    
    public static boolean esVIP(int[][] mapa, int numero){
    
        boolean esVip = false;
        
        
        for (int i = 0; i < mapa.length; i++) {

            for (int j = 0; j < mapa[0].length; j++) {

                
                if (numero == mapa[0][j]){
                    
                    esVip = true;
                    
                }
                
                if (numero == mapa[i][mapa.length -1 ]) {
                    
                    esVip = true;
                }
                
                
            }
            
        }
        
        
        
        
        return esVip;
    }

    
}
