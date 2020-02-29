class Pelicula {
        
    private String nombre;
    private int año;
    
    public Pelicula (String nombre, int año){
        
        this.nombre=nombre;
        this.año=año;
    }
    
    public String getNombre(){
    
        return nombre;
    }
    
      public int getAño(){
    
        return año;
    }
    
    
    private void setNombre(String nombre){
        this.nombre=nombre;
        
    }
    
    private void setAño(int año){
        this.año=año;
        
    }
    
    
    
}

