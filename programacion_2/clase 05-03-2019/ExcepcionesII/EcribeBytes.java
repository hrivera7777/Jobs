import java.io.*;
public class EcribeBytes{
    public static void main (String args []) throws IOException{
     String ruta = "C: //Practicas/Programacion";
     File archivo = new File(ruta, "datos.dat");
     FileOutputStream flujoSalida = new FileOutputStream(archivo);
     flujoSalida.close();
     System.out.println("Error en acceso al archivo");
    }
    
}
