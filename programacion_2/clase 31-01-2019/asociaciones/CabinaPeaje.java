
/**
 * Write a description of class CabinaPeaje here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CabinaPeaje{
    
    int totalPeajes;
    int totalCamiones;
    
    public CabinaPeaje(){
        totalCamiones=0;
        totalCamiones=0;
        
    }
    
    public void muestraDatos(){
        System.out.print("Total desde la última recogida - Peaje: ");
        System.out.println(totalPeajes);
        System.out.print("Camiones: ");
        System.out.println(totalCamiones);

    }
    
    public void recaudar (){
        System.out.println();
        System.out.println("**** Procediendo recaudación ****");
        muestraDatos();
        totalCamiones=0;
        totalPeajes=0;
        
    }
    
    public void calculaPeajes(Camion camion){
    
        int ejes = camion.obtenerEjes();
        int pesoTotal = camion.obtenerPesoTotal();
        int peaje = 10000 * ejes + 5000 * pesoTotal;
        System.out.print("Camión - Ejes: ");
        System.out.println(ejes);
        System.out.print("Peso Total");
        System.out.println(pesoTotal);
        System.out.print("Peaje: ");
        System.out.println(peaje);
        totalCamiones = totalCamiones + 1;
        totalPeajes = totalPeajes + peaje;
        
    }
    
}
   