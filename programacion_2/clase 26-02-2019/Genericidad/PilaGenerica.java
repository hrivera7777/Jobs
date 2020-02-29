import java.util.*;
public class PilaGenerica<E>
{
   //Atributos
  private Vector <E> listaElementos;
  private int longitud = -1;
  private final int MAXELEM =100;
  
  //constructor
  public PilaGenerica(){
      listaElementos = new Vector<E>();
      longitud = -1;
    }
  
    // Operaciones
  public int tamanio(){
     return (longitud +1); 
    
  }  
  public boolean estaVacia(){
    return (longitud <0);
    
  }
  
  public void empilar (E pElemento){
      longitud = longitud +1;
      listaElementos.add(longitud, pElemento);
    }
  
  public E desempilar (){
    E elemento = null;
    if (estaVacia()){
        longitud = longitud -1;
    }
    return elemento;  
    }
  
   public E cima(){
       if (estaVacia()){
           System.out.println("La pila está vacía");
           
        } 
        return  listaElementos.elementAt(longitud);
           
        
        
    } 
}
