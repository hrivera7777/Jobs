package Animales;



public class Murcielago extends Mamifero implements PuedeVolar, PuedeMoverse{
    
    public void volar(){
        System.out.println("El murcielago es el que vuela ");
    
    }
    
     public void mover(){
        System.out.println("El murcielago es el que se mueve");
    
    }
    
    
}
