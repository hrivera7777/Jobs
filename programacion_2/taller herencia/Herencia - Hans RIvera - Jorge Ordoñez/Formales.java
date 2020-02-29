
public class Formales extends Vehiculo{
    
    protected int numeroPuertas;
    protected boolean descapotables;
    
   public Formales (String matricula, String marca, int modelo, String color, int precioAlquilerDia, int numeroPuertas,
                       boolean descapotables ){
       
        super(matricula, marca, modelo, color, precioAlquilerDia);
        
        this.numeroPuertas = numeroPuertas;
        this.descapotables = descapotables;
        
        
    
    } 
    
   
   public int getNumeroPuertas(){
        return numeroPuertas;
   }
    
    
   public boolean getDescapotables(){
        return descapotables;
   }
    
    
   protected void setNumeroPuertas(int numeroPuertas){
        this.numeroPuertas = numeroPuertas;
   }
    
 
   protected void setDescapotables(boolean descapotables){
        this.descapotables = descapotables;
   } 

}