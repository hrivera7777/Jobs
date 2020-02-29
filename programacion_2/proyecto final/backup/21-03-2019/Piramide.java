
public class Piramide extends Solidos {
    private double base;
    private double altura;
    private double apotema;
    
    public Piramide (double base, double altura, double apotema ){
    
        this.base = base;
        this.altura = altura;
        this.apotema = apotema;
        
        
    
    }
    
    
    public double calcularSuperficie(){
        double superficie; 
        double perimetroBase = base * 4; 
        double areaLateral = (perimetroBase * apotema)/2 ;
        double areaBase = Math.pow(base, 2);
        
        superficie = areaBase + areaLateral;
        
        return superficie;
    }
    
    
    public double calcularVolumen() {
    
        double volumen; 
        double areaBase = Math.pow(base, 2);
        
        volumen = (areaBase * altura)/3;
        
        
        return volumen;
    }
    
    
}