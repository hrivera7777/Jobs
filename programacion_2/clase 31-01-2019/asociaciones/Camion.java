
public class Camion{
    int ejes; 
    int pesoTotal;
    
    public Camion (int ejes, int pesoTotal){
        this.ejes = ejes;
        this.pesoTotal= pesoTotal;
    }
    
    public int obtenerEjes(){
        return ejes;
    }
    
    public int obtenerPesoTotal(){
        return pesoTotal;
    }
    
}