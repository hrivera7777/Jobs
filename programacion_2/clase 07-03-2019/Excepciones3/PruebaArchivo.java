import java.io.*;
public class PruebaArchivo{ //flujo se datos de caracteres
    
    public static void main(String args[]){
        String nombreArchivo ="prueba.txt";
        FileWriter escribir;
        
        try {
            escribir = new FileWriter(nombreArchivo);
            for (char c = 'a'; c<= 'z'; c++){
                escribir.write(c);
            }
            escribir.close();
        }catch (IOException e){
            System.out.println("Imposible abrir el archivo para escribir");
        }
        
        FileReader leer;
        int c;
        
        try{
            leer = new FileReader(nombreArchivo);
            c=leer.read();
            while(c != -1){
                System.out.println((char) c);
                c= leer.read();
            }
            leer.close();
        } catch(IOException e){
            System.out.println("Imposible abrir el archivo para escribir");
        
        }
    
        
        
    
    }
    
    
   
}
