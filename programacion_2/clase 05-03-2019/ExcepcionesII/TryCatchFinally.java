
public class TryCatchFinally{
    
    public static void main(String args[]){
        
        try{
            System.out.println("Paso 1");
            int a= 10/0;
            System.out.println("Paso 2");
        }catch (ArithmeticException e){
            System.out.println("Paso 3");
        }finally{
            System.out.println("Paso 4");
        }
        
        try{
            System.out.println("Paso 5");
            int a= 10/1;
            System.out.println("Paso 6");
            
        }catch (ArithmeticException e){
            System.out.println("Paso 7");
            
        }finally{
            System.out.println("Paso 8");
        }
        
        
        
        
    }
    
}
