import java.io.*;
public class Alumno implements Serializable{
    String nombre;
    String apellidos;
    int anioNacimiento;
    int codigo;
    String grupo;
    char horario;
    
    Alumno(String nombre, String apellidos, int anio){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.anioNacimiento = anioNacimiento;
    }
    
    Alumno (String nombre, String apellidos, int anio, int codigo, String grupo, char horario ){
        this(nombre, apellidos, anio);
        this.codigo = codigo;
        this.grupo = grupo;
        this.horario = horario;
    }
    
    
    void colocarGrupo (String nuevoGrupo, char nuevoHorario){
        grupo = nuevoGrupo;
        horario = nuevoHorario;
    }
    
    String obtenerGrupo(){
        return grupo;
    }
    
    void imprime(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Año de nacimiento: " + anioNacimiento);
        System.out.println("Codigo: " + codigo);
        System.out.println("grupo: " + grupo);
        System.out.println("Horario: " + horario);
    }
    
    void guardarAlumno(){
        try{
            FileOutputStream archivo = new FileOutputStream("Alumno.dat");
            ObjectOutputStream salida = new ObjectOutputStream(archivo);
            salida.writeObject(this);
            salida.close();
            
        }catch (IOException e){
            System.out.println("problemas al escribir el archivo");
        }
        
    }
    
    void leerAlumno(){
        try{
            FileInputStream archivo = new FileInputStream("Alumno.dat");
            ObjectInputStream entrada = new ObjectInputStream(archivo);
            Alumno alumno1 = (Alumno) entrada.readObject();
            alumno1.imprime();
            entrada.close();
        }catch (FileNotFoundException e){
            System.out.println("no se pude leer el archivo");
            
            
        }catch (IOException e){
             System.out.println("problemas al leer el archivo");
        }catch (Exception e){
            System.out.println("Error al leer el archivo.");
        }
        
        
    }
    
}
