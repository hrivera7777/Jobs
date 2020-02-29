
public class Personaje{
    
    public String nombre;
    public int tiempoVida = 100;
    
    public void muestraNombre (){
        System.out.println(nombre);
        
    }
    
    public void golpe(Personaje target){
    
        target.tiempoVida -= 10;
    }
    
}
