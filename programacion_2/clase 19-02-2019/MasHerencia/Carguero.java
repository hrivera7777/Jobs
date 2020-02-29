
public class Carguero extends Barco {
    public Carguero(){
        System.out.println("Se crea un carguero. ");
    }
    public void alarma(){
        System.out.println("S.O.S desde un carguero. ");  
    }
    public void alarma(String mensaje){
        System.out.println("Mensaje" + mensaje + "enviado desde un Carguero. "); 
    }
}
