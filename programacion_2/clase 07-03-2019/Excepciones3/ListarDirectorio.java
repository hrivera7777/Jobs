import java.io.*;
import java.util.*;
public class ListarDirectorio{
    
    public static void main (String args[]){
        String directorio;
        if (args.length > 0){
            directorio = args[0];
        }else {
            directorio = ".";
        }
        
        File actual = new File (directorio);
        System.out.print("El directorio es: ");
        
        try {
            System.out.println(actual.getCanonicalPath());
            
        }catch (IOException e){
             
        }
        System.out.print("Su contenido es: ");
        File [] archivo = actual.listFiles();
        for (int i=0; (archivo != null) && (i<archivo.length); i++ ){
            System.out.print("\t " + archivo[i].length());
            System.out.print("\t " + (new Date(archivo[i].lastModified())));
        }
        System.out.println();
    }
   
}
