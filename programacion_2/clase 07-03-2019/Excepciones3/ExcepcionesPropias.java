
public class ExcepcionesPropias{

    public static void main (String args[]){
        try {
        
            System.out.println("Paso 1");
            throw new MiExcepcion();
        }catch(MiExcepcion me) {
            
            System.out.println("Paso 2");
            System.out.println("Capturada: " + me.toString());
            System.out.println("Paso 3");
        
            
        }
    }
    
}
