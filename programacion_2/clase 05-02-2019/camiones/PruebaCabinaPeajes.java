
public class PruebaCabinaPeajes{

    public static void main (String [] args){
        CabinaPeaje cabina = new CabinaPeaje();
        Camion camion1 = new Camion (5,100);
        cabina.añadir(camion1);
        cabina.calculaPeaje();
        cabina.recaudar();
    
    }
    
}