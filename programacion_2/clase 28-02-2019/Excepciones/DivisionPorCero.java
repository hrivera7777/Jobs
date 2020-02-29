public class DivisionPorCero{
    
    private static int divide (int a, int b){
       System.out.println("Divide: antes de dividir"); 
       
       int div = a/b;
       
       System.out.println("Divide: después de dividir");
       return div;
        
    }
    
    private static void intermedio(){
        System.out.println("Intermedio: antes de divide");
        
        int div = divide(2,0);
        
        System.out.println("Intermedio: resultado: " + div);
        
    }
    
    public static void main (String [] args){
        System.out.println("main: antes de intermedio");
        intermedio();
        System.out.println("main: después de intermedio");
        
        // int i = 10;
        //int j = 0;
        //System.out.println(i/j);
        //System.out.println("Fin");
    
    }
    
}
