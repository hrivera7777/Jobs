import java.util.*;
import Matricula.Alumno;
public class GrupoV{
    private String nombre;
    private Vector alumnos;
    public GrupoV(String nombre){
        this.nombre = nombre;
        alumnos = new Vector ();
    }
    
    public boolean estaVacio(){
        return alumnos.size() == 0;
    }
    
    public boolean estaLleno(){
        return false; // un vector nunca se llena 
        
    }
    
    public void añadir (Alumno alumno){
        
        alumnos.add(alumno);
            
    }
    
    public boolean eliminar (Alumno alumno){
    
            int pos = buscar(alumno);
            
            if(pos < 0){
                return false;
            }
            alumnos.removeElementAt(pos);
            return true;
    }
    
    public int buscar (Alumno alumno){
        Alumno a1;
        for (int i=0; i<alumnos.size(); i++){
            a1= (Alumno) alumnos.elementAt(i); // es obligatorio hacer le casting 
            if (a1.equals(alumno)){
            return i;
           }
        }
        return -1;
    }
    
}