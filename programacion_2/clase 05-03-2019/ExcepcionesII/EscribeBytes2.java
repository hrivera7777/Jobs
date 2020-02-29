import java.io.*;
public class EscribeBytes2{
   public static void main (String args []){
     String ruta = "C: //Practicas/Programacion";
     File archivo = new File(ruta, "datos.dat");
     try{
         FileOutputStream flujoSalida = new FileOutputStream(archivo);
         flujoSalida.close();
        
     }catch(IOException ioe){
        System.out.println("Error en acceso al archivo");
     }

   }
}
