import java.util.*;
public class PilaCaracteres{
  //Atributos
  private Vector listaElementos;
  private int longitud = -1;
  private final int MAXELEM =100;
  
  //constructor
  public PilaCaracteres(){
      listaElementos = new Vector();
      longitud = -1;
    }
  
    // Operaciones
  public int tamanio(){
     return (longitud +1); 
    
  }  
  public boolean estaVacia(){
    return (longitud <0);
    
  }
  
  public void empilar (Character pElemento){
      longitud = longitud +1;
      listaElementos.add(longitud, pElemento);
    }
  
  public Character desempilar (){
    Character elemento = null;
    if (estaVacia()){
        System.out.println("La pila está vacía");
    }else {
        elemento = (char) listaElementos.elementAt(longitud);
        longitud = longitud -1;
    }
    return elemento;  
    }
  
   public Character cima(){
       if (estaVacia()){
           System.out.println("La pila está vacía");
           
        } 
        return (char) listaElementos.elementAt(longitud);
           
        
        
    } 
    
    
}
