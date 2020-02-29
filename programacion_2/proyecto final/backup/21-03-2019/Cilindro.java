public class Cilindro extends Solidos{ 
    private double radio;
    private double altura;
    
    public Cilindro(double radio, double altura ){
    
        this.radio = radio;
        this.altura = altura;
        
        
    
    }
    
    
    public double calcularSuperficie(){
        double superficie; 
        
        superficie  = 2 * (Math.PI) * radio * altura;
        
        return superficie;
    }
    
    
    public double calcularVolumen() {
    
        double volumen; 
        
        volumen = (Math.PI) * (Math.pow(radio,2)) * altura ;
        
        return volumen;
    }
    
    
}