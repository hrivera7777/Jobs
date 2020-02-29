import java.io.*;
import java.util.*;
import Matricula.*;
public class Grupo {

    private String nombre;
    private Alumno [] alumnos;
    
    private int numAlumnos;
    
    public Grupo (String nombre, int tamaño) throws Exception {
    
        if (tamaño <1){
            throw new Exception("Tamaño insuficiente");
        }
        
        this.nombre = nombre;
        alumnos = new Alumno [tamaño];
        numAlumnos =0;
       
    }
      
    public boolean estaVacio (){
        return numAlumnos ==0;
    }
    
    public boolean estaLleno(){
        return numAlumnos == alumnos.length;
    }
    
    public void añadir (Alumno alumno) throws Exception {
        if(estaLleno()){
            throw new Exception ("Grupo lleno, Imposible añadir.");
             
        }
        
        alumnos [numAlumnos] = alumno;
        numAlumnos++;
    }
    
    public boolean eliminar(Alumno alumno){
    
            int pos= buscar(alumno);
            if (pos<0){
                return false;
            }
            
            for(int i=0; i<numAlumnos; i++){
                alumnos[i] = alumnos [i++];
            }
            numAlumnos --;
            return true;
            
    }
    
    public int buscar (Alumno alumno){
        for (int i=0; i<numAlumnos; i++){
            if(alumnos[i]== alumno){
            return i;
            }
            
        }
        return -1;
    }
}
