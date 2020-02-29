
public class Prueba{
    public static void main (String args[]){
    
        final int numLibros = 2;
        
        Libro[] w = new Libro [numLibros];
        
        w[0] = new LibroImpreso ("La lógica de lo impensable ");
        w[1] = new LibroElectronico ("Catársis ");
        
        for (int i=0; i< numLibros; i++){
            
            w[i].escribirDescripcion();
        
        }
    }

}
