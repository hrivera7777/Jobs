
public class LibroElectronico extends Libro{
    
    LibroElectronico(String titulo){
        super(titulo);
        
    }
    
    public int difusion(){
        return 1;
    }
    
    public void escribirDescripcion(){
        
        System.out.println("Descripción del libro electrónico ");
    }


}
   