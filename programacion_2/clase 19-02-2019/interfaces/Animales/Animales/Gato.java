package Animales;


public class Gato extends Mamifero implements PuedeMoverse, PuedeNadar{
    
    int numeroPatas;
    
    public void mover(){
        System.out.println("El gato es el que se mueve");
    
    }
    
    public void nadar(){
        System.out.println("El gato nada");
    }
    
    
}
