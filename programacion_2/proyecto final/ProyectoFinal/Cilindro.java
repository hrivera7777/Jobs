public class Cilindro extends Solido{ 
    private double radio;
    private double altura;

    public Cilindro(double radio, double altura ){

        this.radio = radio;
        this.altura = altura;

    }
    public void calcularSuperficie(){
        superficie  = 2 * (Math.PI) * radio * altura;

    }

    public void calcularVolumen() {
        volumen = (Math.PI) * (Math.pow(radio,2)) * altura ;

    }

    public double getRadio(){
        return radio;
    }
    
    public double getAltura(){
        return altura;
    }
}