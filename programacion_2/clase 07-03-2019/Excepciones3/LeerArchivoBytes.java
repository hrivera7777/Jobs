import java.io.*;
public class LeerArchivoBytes{ // flujo de caracteres de entrada
   public static void main(String args[]){
       String nombreArchivo = "MiExcepcion.java";
       
       FileReader archivo;
       BufferedReader filtro;
       String linea;
       
       try{
           archivo = new FileReader (nombreArchivo);
           filtro = new BufferedReader (archivo);
           linea = filtro.readLine();
           while (linea != null){
               System.out.println(linea);
               linea = filtro.readLine();
            }
            filtro.close();
        }catch (IOException e){
             System.out.println("Imposible abir el archivo para leer");
        }
        
       
    } 
    
}
