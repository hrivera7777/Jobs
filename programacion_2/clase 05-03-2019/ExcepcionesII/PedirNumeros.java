import java.io.*;
public class PedirNumeros{
    public static void main(String []args){
        int numero = -1;
        int intentos = 0;
        String linea;
        BufferedReader teclado = new BufferedReader(
        new InputStreamReader(System.in));
        
        do{
            try{
                System.out.println("Introduzca un número entre 0 y 100");
                
                linea = teclado.readLine();
                numero = Integer.parseInt(linea);
            }catch(IOException e){
                System.out.println("error al leer del teclado");
            }catch (NumberFormatException e){
                 System.out.println("Debe introducir un numero entre 0 y 100");
            }finally {
                intentos ++;
            }
            
        }while (numero < 0 || numero > 100);
             System.out.println("Número introducido es: " + numero);
         System.out.println("Número de intentos es: " + intentos);
        
    }
}
