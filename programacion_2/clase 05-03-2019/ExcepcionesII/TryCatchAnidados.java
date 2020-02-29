
public class TryCatchAnidados{
    
    public static void main(String args[]){
    
        try {
        
            System.out.println("Paso 1");
            try{
                System.out.println("Paso 2");
                Object b= null;
                b.toString(); // lanza una NullPointerException
                System.out.println("Paso 3");
                
            }catch (NullPointerException npe){ // NullPointerException
                System.out.println("Paso 4");
            }
            System.out.println("Paso 5");
        }catch (Exception e){
            System.out.println("Paso 6");
        }
     }
}
   
