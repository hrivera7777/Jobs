
public class SentenciaThrow3{
    public static void main(String args[]) throws Exception{
        try{
            int a =1;
            System.out.println("Paso 1");
            NullPointerException npe;
            npe = new NullPointerException();
            
            if(a == 1 ){
                throw npe;
            }
            System.out.println("Paso 2");
        }catch (NullPointerException npe){
            System.out.println("Paso 3");
            npe.printStackTrace();
            System.out.println("Paso 2");
            //Lanza una excepción que ha capturado
            throw npe;
            
        }
        
        
    
    }
}
