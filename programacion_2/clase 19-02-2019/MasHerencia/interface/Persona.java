
public class Persona{
    
    String nombre;
    String apellido;
    int anioDeNacimiento;
        
    Persona(String nombre, String apellido, int anioDeNacimiento){
        this.nombre = nombre;
        
        this.apellido = apellido;
        
        this.anioDeNacimiento = anioDeNacimiento;
        
    }
    void imprime (){
        
        System.out.print("Datos personales: " + nombre + " " +  apellido
        + " " + " (" + anioDeNacimiento + " )" );
    }
    


}