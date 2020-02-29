import java.io.*;
public class Excepciones{
    public static void main(String args[]){
        try{
            metodo1();
            
        }catch (NullPointerException npe){
        
            System.out.println("Se ha producido una  " + "NullPointerException, capturada en el main.");
        
        }   
    } 
    
    public static void metodo1(){
        try {
            metodo2();
        }catch(Exception npe){// Exception es una excepcion generica
           System.out.println("Se ha producido una  " + "NullPointerException, capturada en el método 1 .");
        }
        
    }
    
    public static void metodo2(){
            metodo3();
    }
    
    public static void metodo3(){
            Object a = null;
            a.toString();
    }
}

