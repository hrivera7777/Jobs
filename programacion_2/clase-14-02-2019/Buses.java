public abstract class Buses extends Vehiculo{
    
   protected int cantidadAsientosDisponibles;
   protected String tipoEnergia; // (gasolina, diesel o eléctrico)
    
   public Buses (String matricula, String marca, int modelo, String color, int precioAlquilerDia, int cantidadAsientosDisponibles, String tipoEnergia ){
       
        super(matricula, marca, modelo, color, precioAlquilerDia);
        
        this.cantidadAsientosDisponibles = cantidadAsientosDisponibles;
        this.tipoEnergia = tipoEnergia;
        
        
    
   } 
    
    
   public int getCantidadAsientosDisponibles(){
        return cantidadAsientosDisponibles;
   }
   
   public String getTipoEnergia(){
        return tipoEnergia;
   }
   
   
   public void setCantidadAsientosDisponibles(int cantidadAsientosDisponibles){
        this.cantidadAsientosDisponibles = cantidadAsientosDisponibles;
        
   } 
   
   public void setTipoEnergia(String tipoEnergia){
        this.tipoEnergia = tipoEnergia;
        
   } 

}
