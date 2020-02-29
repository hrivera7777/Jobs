public class PruebaCabinaPeaje{
    public static void main (String [] args){
        CabinaPeaje cabina = new CabinaPeaje();
        Camion camion1 = new Camion (5,100);
        Camion camion2 = new Camion (2,5);
        cabina.calculaPeajes(camion1);
        cabina.muestraDatos();
        cabina.calculaPeajes(camion2);
        cabina.recaudar();
        
    }
    
}