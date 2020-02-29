
public class EjemploAgregacion{
    
    public static void main(String [] args){
        
        Alumno alumno = new Alumno("Peter", "Perez", 1960, 24 ,"tres" , 'm', "Avenida Santander", 45 );
        
        System.out.println("Datos alumno: " + alumno);
        Alumno.Direccion direccion = alumno.new Direccion ("Avenida Paralela", 23);
        
        alumno.asignarDireccion(direccion);
        System.out.println("Datos alumno: " + alumno);
        
       // Claustro claustro1 = new Claustro();
        
    }
   
}
