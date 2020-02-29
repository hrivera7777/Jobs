import java.io.*;
import java.util.*;
public class Serial{
    public static void main (String args[]){
        try{
            FileOutputStream archivo = new FileOutputStream("prueba.dat");
            ObjectOutputStream salida = new ObjectOutputStream(archivo);
            salida.writeObject("Hoy es: ");
            salida.writeObject(new Date());
            salida.close();
            
        
        }catch (IOException e){
            System.out.println("Problemas con el archivo");
        }
        
        try{
            FileInputStream archivo2 = new FileInputStream("prueba.dat");
            ObjectInputStream entrada = new ObjectInputStream(archivo2);
            
            String hoy = (String) entrada.readObject();
            Date fecha = (Date) entrada.readObject();
            entrada.close();
            System.out.println(hoy + fecha);
            
        
        }catch (FileNotFoundException e){
            System.out.println("no se pudo abrir el archivo");   
        }catch (IOException e){
            System.out.println("Problemas con el archivo");
        }catch (Exception e){
        
            System.out.println("Error al leer un objeto.");
        }
        
        
    }
}
