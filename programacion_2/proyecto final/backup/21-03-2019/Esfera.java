public class Esfera extends Solidos { 
    private double radio;

    public Esfera (double radio){

        this.radio = radio;

    
    }

    public double calcularSuperficie(){
        double superficie; 

        superficie = (4 * (Math.PI)) * (Math.pow(radio , 2));

        return superficie;
    }

    public double calcularVolumen() {
        double volumen; 
        try{
            volumen = (4 * (Math.PI))/3 * (Math.pow(radio , 3));
            return volumen;

        }catch (ArithmeticException e){

            return 0;    
        }

    }
    
}