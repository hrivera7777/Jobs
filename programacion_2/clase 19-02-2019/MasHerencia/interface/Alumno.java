
public class Alumno extends Persona implements Docente{
    
    String grupo; 
    char horario;
    
    
    Alumno(String nombre, String apellido, int anioDeNacimiento){//solo llama al constructor de la clase padre
        super(nombre, apellido, anioDeNacimiento);
    }
    
    Alumno(String nombre, String apellido, int anioDeNacimiento, String grupo, char horario){
        this(nombre, apellido, anioDeNacimiento);
        this.grupo = grupo;
        this.horario = horario;
        
    }
    
    String obtenerNombre (){
        return nombre + " " + apellido;
    }
    
    void imprime (){//modificado y llamando el metodo desde la clase padre
        super.imprime();
        
        System.out.print(" Grupo" + grupo + " " + horario);
    }
    
    public void asignarGrupo(String grupo, char horario){
        this.grupo = grupo;
        this.horario = horario;
        
    }
    
    public String obtenerGrupo(){
        return grupo;
    }
    
    public char obtenerHorario(){
        return horario;
    }
    
    

}