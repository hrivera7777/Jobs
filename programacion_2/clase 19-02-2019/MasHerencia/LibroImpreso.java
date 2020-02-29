
public class LibroImpreso extends Libro{
    
    LibroImpreso(String titulo){
        super(titulo);
    
    }
    
    public int difusion(){
        return 0;
    }
    
    public void escribirDescripcion(){
        System.out.println("Descripción del libro impreso ");
    
    }
    

}