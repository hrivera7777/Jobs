
/**
 * Write a description of class TryCatchFinally2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TryCatchFinally2
{ 
    public static void main(String args[]){
        try{
            System.out.println("Paso 1");
            int a= 10/0; // Lanza una ArithmeticException
            System.out.println("Paso 2");
        }catch (ArithmeticException e){
            System.out.println("Paso 3");
        }catch (Exception e){
            System.out.println("Paso 4");
        }
        
        try{
            System.out.println("Paso 5");
            int a= 10/1;  // no lanza excepcion 
            System.out.println("Paso 6");
            Object b = null;
            b.toString(); // lanza una NullPointerException
            System.out.println("Paso 7");
            
        }catch (ArithmeticException e){
            System.out.println("Paso 8");
            
        }catch (NullPointerException e){
            System.out.println("Paso 9");
            
        }catch (Exception e){
            System.out.println("Paso 10");
        }
    
    }
}
