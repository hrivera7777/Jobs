

public class Alumno{
    
    String nombre;
    String apellidos;
    int anioDeNacimiento;
    int codigo;
    String grupo;
    char horario;
    private Direccion direccion;
    
    
    
    Alumno(String nombre, String apellidos, int anioDeNacimiento, int codigo , String grupo, char horario, String calle, int num ){
    
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.anioDeNacimiento = anioDeNacimiento;
        this.grupo = grupo;
        this.horario = horario;
        direccion = new Direccion(calle, num);
  
    }
    
    public String obtenerNombre(){
        return nombre +  " " + apellidos; 
    }
    
    public String obtenerGrupo(){
        return grupo;
    }
    
    public char obtenerHorario(){
        return horario;
    }
    
    public void asignarGrupo (String grupo, char horario){
        
        this.grupo = grupo;
        this.horario = horario;
        
    }
    
    public void asignarDireccion(Direccion dir){
        direccion = dir;
    }
    
    public String toString (){
        return nombre + " " + apellidos + " " + anioDeNacimiento + " " + direccion;
    }
    
    public void imprime (){
        System.out.print(" grupo "+ grupo + " " + horario);
    }
    
    class Direccion {
        String calle;
        int numero;
        
        Direccion (String calle, int num){
        
            this.calle = calle;
            numero = num;
            
        }
        
        public String toString(){
            return calle + " " + numero;
        }
        
    }
    


}
   