public abstract class Vehiculo{
    protected String matricula;
    protected String marca;
    protected int modelo;
    protected String color;
    protected int precioAlquilerDia;
 
    public Vehiculo(String matricula, String marca, int modelo, String color, int precioAlquilerDia ){
       this.matricula = matricula;
       this.marca= marca;
       this.modelo = modelo;
       this.color = color;
       this.precioAlquilerDia = precioAlquilerDia;
        
    
    } 
    
    public String getMatricula(){
        return matricula;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public int getModelo(){
        return modelo;
    }
    
    public String getColor(){
        return color;
    }
    
    public int getPrecioAlquilerDia(){
        return precioAlquilerDia;
    }
    
    protected void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    protected void setMarca(String marca){
        this.marca = marca;
    }
    
    protected void setModelo(int modelo){
        this.modelo = modelo;
    }
    
    protected void setColor(String color){
        this.color = color;
    }
    
    protected void setPrecioAlquilerDia(int precioAlquilerDia){
        this.precioAlquilerDia = precioAlquilerDia;
    }
    
   
    public int precioAlquilerVehiculo(int diasAlquiler){
        return (diasAlquiler * getPrecioAlquilerDia()); 
    } 
    
    public void mostrarEnPantalla(){
        System.out.println("Número de matricula: " + matricula);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Precio alquiler día: " + getPrecioAlquilerDia());
    }
    
}