//Integrantes Hans Rivera Londoño y Jorge Luis Ordoñez 

class Serie {

    private String nombre;
    private int año;
    private int cantidadTemporadas=0;
    private int cantidadEpisodios=0;
    private String resumen;
    private int valoracion;
    private int duracion=0;
    private String genero;
    private Pelicula pelicula=null;
   
    public Serie(String nombre, int año, int duracion, String genero){
        this.nombre=nombre;
        this.año=año;
        this.duracion=duracion;
        this.genero=genero;
       
    }
    
    public Serie (String nombre, int año, int duracion, String genero, int cantidadTemporadas, int cantidadEpisodios, String resumen, int valoracion, Pelicula pelicula){
    
        this(nombre, año, duracion, genero);
        this.cantidadTemporadas=cantidadTemporadas;
        this.cantidadEpisodios=cantidadEpisodios;
        this.resumen=resumen;
        this.valoracion=valoracion;
        this.pelicula=pelicula;
    
    }
    
    public String getNombre(){
    
        return nombre;
    }
    
      public int getAño(){
    
        return año;
    }
    
    public int getCantidadTemporadas(){
        
        
        return cantidadTemporadas;
    }
    
    public int getCantidadEpisodios(){
      
        
        return cantidadEpisodios;
    }
    
    public String getResumen(){
        
        
        return resumen;
    }
    
    public int getValoracion (){
        
        return valoracion;
    }
    
    
    public int getDuracion(){
    
        return duracion;
    }
    
    public String getGenero(){
    
        return genero;
    }
    
    
    public Pelicula getPelicula(){
    
        return pelicula;
    }
    
    
    
    
    private void setNombre(String nombre){
    
        this.nombre=nombre;
    }
    
    
    private void setAño(int año){
    
        this.año=año;
    }
    
    private void setCantidadTemporadas(int cantidadTemporadas){
        
        
        this.cantidadTemporadas=cantidadTemporadas;
    }
    
    private void setCantidadEpisodios(int cantidadEpisodios){
      
        
        this.cantidadEpisodios=cantidadEpisodios;
    }
    
    private void setResumen(String resumen){
        
        
        this.resumen=resumen;
    }
    
    private void setValoracion (int valoracion){
        
        this.valoracion=valoracion;
    }
    
    
    private void setDuracion(int duracion){
    
        this.duracion=duracion;
    }
    
    private void setGenero(String genero){
    
        this.genero=genero;
    }
    
    
    private void setPelicula(Pelicula pelicula){
    
        this.pelicula=pelicula;
    }
    
    
    
    public String convertirValoracion(int valoracion){
    String convertirV="sin valoración";
    
    
    switch(valoracion){
    case 1 : 
            convertirV="Pésima";
            break;
            
    case 2 : 
            convertirV="Mala";
            break; 
            
    case 3 : 
            convertirV="Regular";
            break;
            
    case 4 : 
            convertirV="Buena";
            break;
            
    case 5 : 
            convertirV="Excelente";
            break;        
            
    }
    
    
    
    return convertirV;
    }
    
    
    public void mostrarDatos(){
    
    
        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.println("Nombre: "+ getNombre());
        System.out.println("Año: " + getAño());
        System.out.println("Duracion: " + getDuracion()+ " min");
        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.println("Cantiadad de Temporaradas: "+ getCantidadTemporadas());
        System.out.println("Cantiadad de Episodios: "+ getCantidadEpisodios());
        System.out.println("Género: "+ getGenero());
        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.println("Resumen: "+ getResumen());
        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.println("Valoracion: "+ convertirValoracion(getValoracion()));
        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.println("Película: "+ getPelicula());
        
    }
    
    
    public void asignarPelicula(Pelicula a){
        
    
        this.pelicula=a;
        
    }
    
    public boolean tienePelicula(){
    
        if (pelicula==null){
            
        return false;
            
        }else{ 
        
        return true;
        }
    
    }
    
    
    
    public static void main(String args[]){
    
    
        Serie strangerThings=new Serie("Stranger Things", 2016, 50, "Fantástico", 2, 17,"Homenaje a los clásicos misterios sobrenaturales de los años 80, \n'Stranger Things' es la historia de un niño que desaparece en el pequeño \n pueblo de Hawkins, Indiana, sin dejar rastro en 1983. En su búsqueda \n desesperada, tanto sus amigos y familiares como el sheriff local se ven \n envueltos en un enigma extraordinario: experimentos ultrasecretos, \n fuerzas paranormales terroríficas y una niña muy, muy rara... (FILMAFFINITY)", 5, null);
        
        strangerThings.mostrarDatos();
        
        //Pelicula stmovie=new Pelicula("Stranger Things Movie", 2019);
        
        //strangerThings.asignarPelicula(stmovie);
        
        //strangerThings.mostrarDatos();
        
    }
    
}