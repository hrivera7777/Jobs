import java.util.*;
public class CabinaPeaje{
    private int totalPeajes;
    private Vector listaCamiones;

    public CabinaPeaje(){
        listaCamiones = new Vector();
        totalPeajes = 0;
        
    }
    
    public void muestraDatos(){
    
        System.out.print("Camiones: ");
        System.out.println(listaCamiones.size());
        System.out.print("Total desde la última recogida - Peaje: ");
        System.out.println(totalPeajes);
        
    }
    
    public void recaudar(){
        muestraDatos();
        listaCamiones.removeAllElements();
        totalPeajes = 0;
    }
    
    public void añadir (Camion camion){
    
        listaCamiones.add(camion);
    }
    public void calculaPeaje(){
    
        for (int i=0; i<listaCamiones.size(); i++){
        
            Camion cam = (Camion) listaCamiones.elementAt(i);
            int ejes = cam.obtenerEjes();
            int pesoTotal = cam.obtenerPesoTotal();
            int peaje = 10000 * ejes + 5000 * pesoTotal;
            System.out.print("Camión: " + (i+1) + " - Ejes:  ");
            System.out.println(ejes);
            System.out.print("Camión: " + (i+1) + " - Peso total: " );
            System.out.println(pesoTotal);
            System.out.print("Camión: " + (i+1)+ " - Peaje: ");
            System.out.println(peaje);
            totalPeajes = totalPeajes + peaje;
        }
        
    }
    
}