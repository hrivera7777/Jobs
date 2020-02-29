import java.io.*;
public class SentenciaThrow1{
        
    public static void main(String args[]) throws Exception{
        System.out.println("Paso 1");
        int a = 1;
        if(a == 1){
            //Exception e;
            
            //e = new Exception();
            
            //trow e;
            throw new Exception("Se lanzó una excepción");
        }
        System.out.println("Paso 1");
    }
        
}
