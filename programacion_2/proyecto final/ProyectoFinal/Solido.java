
public abstract class Solido{
    protected double superficie; 
    protected double volumen;

    public abstract void calcularSuperficie();

    public abstract void calcularVolumen();
    
    public double getSuperficie(){
        return superficie;
    }
    
    public double getVolumen(){
        return volumen;
    }

}
