public class Piramide extends Solido{
    private double base;
    private double altura;
    private double apotema;

    public Piramide (double base, double altura, double apotema ){

        this.base = base;
        this.altura = altura;
        this.apotema = apotema;

    }
    
    public void calcularSuperficie(){
        double perimetroBase = base * 4; 
        double areaLateral = (perimetroBase * apotema)/2 ;
        double areaBase = Math.pow(base, 2);

        superficie = areaBase + areaLateral;

        
    }

    public void calcularVolumen() {

        double areaBase = Math.pow(base, 2);
        volumen = (areaBase * altura)/3;

    }
    
    public double getBase(){
        return base;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public double getApotema(){
        return apotema;
    }
    
}