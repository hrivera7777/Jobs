
public class PruebaMetodoGenerico{
    
    public static void main (String [] args){
         System.out.println("Ejemplo de método genérico");
         String r;
         r = MetodoGenerico.aCadena(new Integer(8), new Integer(-11));
         System.out.println("r = " + r);
         System.out.println("Con tipo double  = " + MetodoGenerico.aCadena(new Double(8), new Double(-11))); 
         System.out.println("Con tipo char  = " + MetodoGenerico.aCadena('a','z'));
         System.out.println("Con tipo boolean  = " + MetodoGenerico.aCadena(true,false));
     
         
         
         
         
        }
   
}
