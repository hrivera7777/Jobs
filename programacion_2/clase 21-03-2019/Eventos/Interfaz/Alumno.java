package Interfaz;
import java.util.*;


public class Alumno{
    private String nombre;
    private String apellidos;
    private int anioDeNacimiento;
    private char horario;
    
    public Alumno(String nombre, String apellidos, int anio, char horario){
        
        this.nombre=nombre;
        this.apellidos= apellidos;
        anioDeNacimiento = anio;
        this.horario = horario;
        
        
    }
    
    public String toString(){
        return nombre + " " + apellidos + anioDeNacimiento + "" + horario;
    }
    
    public char dameHorario(){
        return horario;
    }
    
}
