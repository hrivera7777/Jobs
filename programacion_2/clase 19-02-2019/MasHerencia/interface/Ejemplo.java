
public class Ejemplo{
    public static void main (String args[]){
    
        Persona vecino = new Persona ("APedro", "Pérez", 1980);
        Alumno unAlumno = new Alumno ("BHernán", "Hernandez", 1970, "01", 'm');
       
        
        unAlumno.imprime();
        System.out.println();
        
        Persona p1;
        Alumno alumno1 = new Alumno ("CPedro", "Pérez", 1980, "1920", 'm');
        p1 = alumno1; // conversion ascendete
        
        p1.imprime(); // utiliza el metodo de : alumno
        System.out.println();
        
        Alumno otroAlumno;
        otroAlumno = (Alumno) p1;
        otroAlumno.imprime();
        System.out.println();
        
        Persona p2 = new Alumno ("DPablo", "Suarez", 19730, "1920", 'm');
        Persona p3 = new Persona ("ELuis", "Gonzalez", 1975);
        Alumno a3;
        // a3 = p3 // error
        // Alumno p4 = new Persona("Luis", "Gonzalez", 1975); // tipos incopatibles
        
        if (p3 instanceof Alumno){
            a3 = (Alumno) p3;
            
        }
        
        
    }

}