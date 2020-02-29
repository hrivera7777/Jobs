
public class Profesor{
   String nombre;
    String apellidos;
    
    public Profesor (String nombre, String apellidos){
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    
    public void imprime (){
        System.out.println(nombre + " " + apellidos);
    }
}
