public class Furgonetas extends Vehiculo{
    protected String tipoFurgoneta;
    
    public Furgonetas (String matricula, String marca, int modelo, String color, int precioAlquilerDia
                       , String tipoFurgoneta ){
       
        super(matricula, marca, modelo, color, precioAlquilerDia );
        
        this.tipoFurgoneta = tipoFurgoneta;
        
        
    
    } 
    
    public String getTipoFurgoneta(){
        return tipoFurgoneta;
    }
    
    public void setTipoFurgoneta(String tipoFurgoneta){
        this.tipoFurgoneta = tipoFurgoneta;
        
    }
    
}