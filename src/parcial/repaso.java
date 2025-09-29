package parcial;


public class repaso {


    public static void main(String[] args) {

        
        
    }
    
    
    
    public static double valorDecimal(int[] datos){
    
        boolean empezar = false;
        
        double retorno = 0;
        
        for (int i = 0; i < datos.length; i++) {
            
            if(datos[i]!=0){
            
                empezar = true;
            }
            
            if (empezar) {
                
             retorno+= datos[i]*10 + datos[i];
            
                
            }
            
        }
        
        
        return retorno;
        
        
        
    }
    
}
