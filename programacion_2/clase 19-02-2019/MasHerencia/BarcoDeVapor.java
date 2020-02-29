
public class BarcoDeVapor extends Barco {

    public BarcoDeVapor(){
        System.out.println("Se crea un Barco de Vapor. ");
    }

    public void alarma(){
        System.out.println("S.O.S desde un barco de Vapor. ");  
    }

    public void alarma(String mensaje){
        System.out.println("Mensaje" + mensaje + "enviado desde un barco de Vapor. "); 
    }
}
