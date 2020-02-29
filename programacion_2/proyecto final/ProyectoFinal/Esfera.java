public class Esfera extends Solido{ 
    private double radio;

    public Esfera (double radio){

        this.radio = radio;

    }

    public void calcularSuperficie(){

        superficie = (4 * (Math.PI)) * (Math.pow(radio , 2));

    }

    public void calcularVolumen() {

        volumen = (4 * Math.PI)/3 * (Math.pow(radio , 3));

    }
    
    public double getRadio(){
        return radio;
    }
}