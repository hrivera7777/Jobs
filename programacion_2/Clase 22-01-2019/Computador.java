public class Computador {
    private String marcaDelComputador;
    private double velocidadDelComputador = 2.3;
    public int identificador;
    
    public Computador (int identificador){
        this.identificador = identificador;
        
    
    }
    
    public Computador (int identificador, String marcaDelComputador, double velocidadDelComputador){
            this(identificador);
            
            this.marcaDelComputador = marcaDelComputador;
            this.velocidadDelComputador = velocidadDelComputador;
    
    }
    
    
    public String getMarcaDelComputador(){
        return marcaDelComputador;
    }
    
    public double getVelocidadDelComputador(){
        return velocidadDelComputador;
    }
    
    public int getIdentificador (){
        return identificador;
    }
    
    private void setMarcaDelComputador (String marcaDelComputador){
        this.marcaDelComputador = marcaDelComputador;
    }
    
    private void setVelocidadDelComputador (double velocidadDelComputador){
        this.velocidadDelComputador= velocidadDelComputador;
        
    }
    
    private void setIdentificador (int identificador){
        this.identificador = identificador;
    }
    
    
    public void muestraDatos (){
        System.out.println("El identificador es: " + getIdentificador());
        System.out.println("La marca del computador es: " + getMarcaDelComputador());
        System.out.println("La Velocidad del computador es: " + getVelocidadDelComputador());
    }
    
    public int precioComputador (){
        if(marcaDelComputador.equalsIgnoreCase("Acer") && velocidadDelComputador <2.2){
            return 1200000;
        }else if (marcaDelComputador.equalsIgnoreCase("Acer") && velocidadDelComputador >= 2.2){
            return 1400000;
        }else if (marcaDelComputador.equalsIgnoreCase("Dell") && velocidadDelComputador < 2.2){
            return 1300000;
        }else if (marcaDelComputador.equalsIgnoreCase("Dell") && velocidadDelComputador >= 2.2){
            return 1500000;
        }
        else {
            return 0;
        }
    }
    
    public int mayorVelocidad (Computador a){
        if(this.getVelocidadDelComputador() > a.getVelocidadDelComputador()){
            
            return this.getIdentificador();
            
        }else if (this.getVelocidadDelComputador() < a.getVelocidadDelComputador()){
            
            return a.getIdentificador();
            
        }else{
            return 0;
        }
            
        }
    
        public static void main (String args[]){
            Computador a = new Computador (5, "acer", 2.5);
            Computador b = new Computador (6, "Dell", 2.3);
            
            System.out.println(a.precioComputador());
            System.out.println(b.precioComputador());
            
            a.muestraDatos();
            b.muestraDatos();
            
            System.out.println(a.mayorVelocidad(b));
            
            
        }
        
}