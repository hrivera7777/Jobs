
public class Administrativo extends Persona{
    Administrativo(String nombre, String apellidos, int anioDeNacimiento){
        super(nombre, apellidos, anioDeNacimiento);
    }
    
    void imprime (){
        System.out.println(nombre + " " +apellido);
    }
}
    