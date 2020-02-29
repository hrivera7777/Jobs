import java.io.*;
import java.util.*;
public class Alumno implements Serializable{
    String nombre;
    String apellido;
    int aNacimiento;
    int codigo;
    String grupo;
    char horario;
    
    Alumno(String nombre, String apellidos, int año) {
            this.nombre = nombre;  this.apellido = apellidos;  this.aNacimiento = año;
    }
        
    Alumno(String nombre, String apellido, int año, int codigo, String grupo, char horari) {
            this(nombre,apellido,año);
            this.grupo = grupo;
            this.horario = horario;
            this.codigo = codigo;
    }
        
    void colocarGrupo(String grupo, char horario){
        this.grupo = grupo;
        this.horario = horario;
    }
    
    public void colocarGrupo(String nuevoGrupo) {  
        grupo = nuevoGrupo;
    }

    String obtenerGrupo(){
        return grupo;
    }
    
    void imprime(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Año de Nacimiento: " + aNacimiento);
        System.out.println("codigo: " + codigo);
        System.out.println("Grupo: " + obtenerGrupo());
        System.out.println("Horario: " + horario);
    }
    
    
    void guardarAlumno(){
       try {
         FileOutputStream archivo = new FileOutputStream("Alumno.dat");
         ObjectOutputStream salida = new ObjectOutputStream(archivo);
         salida.writeObject(this);
         salida.close();
        }catch(IOException e) {
            System.out.println("Problemas al escribir el archivo");
        }
    }
  
    void leerAlumno() {
         try {
         FileInputStream archivo = new FileInputStream("Alumno.dat");
         ObjectInputStream entrada = new ObjectInputStream(archivo);
         Alumno alumno1 = (Alumno) entrada.readObject();
         alumno1.imprime();
         entrada.close();
        }catch(FileNotFoundException e) {
            System.out.println("no se encontró el archivo");
        }catch(IOException e) {
            System.out.println("Problemas con el archivo");
        }catch(Exception e) {
            System.out.println("Error al leer el objeto");
        }
    }
      
    public static void guardarVectorAlumnos(Vector <Alumno> alumnos){
        try {
         FileOutputStream archivo = new FileOutputStream("VecAlumnos.dat");
         ObjectOutputStream salida = new ObjectOutputStream(archivo);
         salida.writeObject(alumnos);
         salida.close();
        }catch(IOException e) {
            System.out.println("Problemas al escribir el archivo");
        }
    
    }
    
    public static void leerVectorAlumnos() {
        try {
             FileInputStream archivo = new FileInputStream("VecAlumnos.dat");
             ObjectInputStream entrada = new ObjectInputStream(archivo);
             Vector vectorAlumnos = (Vector) entrada.readObject();
             Alumno alumno1;
             for(int i =0; i< vectorAlumnos.size(); i++){
                
                 alumno1 = (Alumno) vectorAlumnos.elementAt(i);
                 alumno1.imprime();
                
             }
             entrada.close();
         
        }catch(FileNotFoundException e) {
             System.out.println("no se encontró el archivo");
        }catch(IOException e) {
             System.out.println("Problemas con el archivo");
        }catch(Exception e) {
             System.out.println("Error al leer el objeto");
        }
    }


    
    
}


