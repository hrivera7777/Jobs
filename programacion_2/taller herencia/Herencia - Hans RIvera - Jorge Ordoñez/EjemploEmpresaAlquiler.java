import java.util.Scanner;
public class EjemploEmpresaAlquiler
{
   
   public static void main (String[] args){
      Scanner teclado = new Scanner (System.in); 
      
      
      Deportivos [] losDeportivos = new Deportivos [1];
       
      losDeportivos[0] = new Deportivos("YJN-063","Dodge - Charger",1995, "Negro", 300000, 2, false);
      
      Empresa empresaU = new Empresa (losDeportivos, null, null, null, null, null, null);
      
      System.out.println ("Ingrese los días de alquiler ");
      
      int diasAlquiler = teclado.nextInt();
      
      
      System.out.println("El precio de alquiler de un vehículo deportivo por " + diasAlquiler + " días es: " + losDeportivos[0].precioAlquilerVehiculo(diasAlquiler));
      losDeportivos[0].mostrarEnPantalla();
      
    
    }
   
    
}
