
public class PilaDeEnteros{
    // lanzada por apilar cuando la pila está llena
    
    public class Llena extends RuntimeException{}
    
    // lanzada por desapilar cuando la pila está vacia
    public class Vacia extends RuntimeException{}
    
    // pila de elementos
    
    public int [] pila;
    public int numElementos=0;
    
    /**constructor. Recibe el número máximo de
     * elementos que puede almacenar la pila*/
     
     public PilaDeEnteros(int maxNumElementos){
         pila = new int [maxNumElementos];
        }
        
     /**
      * añade un elemento sobre la cima de la pila
      */   
     public void apila(int elemento) throws Llena{
         if (numElementos == pila.length){
         throw new Llena();
        }
             pila[numElementos]=elemento;
             numElementos++;
            
        }
        
        /** 
         * elimina el elemento en la cima de la pila
         * 
         */
        
        public int desapila () throws Vacia{
            if (numElementos == 0 ){
                throw new Vacia();
            }
                numElementos--;
                return pila[numElementos];
                
        }
        
        /**
         * retorna verdadero si la pila está vacia 
         * 
         */
        
        public boolean llena(){
            return numElementos == pila.length;
        }
}
