class Alumno {
    
    public Alumno(String nombre, String apellidos, int año){
        
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.añoNacimiento=año;
        
        }
        
    public Alumno(String nombre, String apellidos, int año,int código ,  String grupo, char horario){
            this(nombre,apellidos,año); //simpre debe estar en la primer linea 
            this.código=código;
            this.grupo=grupo;
            this.horario=horario;
            
        
        }
        
    
     private String nombre;     //atributo
     private String apellidos;  //atributo
     private int añoNacimiento; //atributo
     private int código;    //atributo
     private String grupo;  //atributo
     private char horario;  //atributo
     private Alumno compañero;  //atributo que referencia a otro objeto
 

    
    public void colocarGrupo(String grupo, char horario){
        
        this.grupo=grupo;
        this.horario=horario;
        
     }
     
    public void colocarGrupo(String nuevoGrupo){
        grupo=nuevoGrupo;
         
        }
     
    public String obtenerGrupo(){
            return grupo;
            
     }
        
     
     
    public void imprime(){
            System.out.println("Nombre:" + nombre);
            System.out.println("Apellido:" + apellidos);
            System.out.println("Año de nacimiento:" + añoNacimiento);
            System.out.println("Código:" + código);
            System.out.println("Grupo:" + obtenerGrupo());
            System.out.println("Horario:" + horario);
     }
     
     public static void main (String args[]){
        
        Alumno alumno1=new Alumno("Pedro","Perez", 2000);
        Alumno alumno2=new Alumno("Maria", "Mendez", 2001);
       
        System.out.println("Alumno 1:");
        alumno1.imprime();
        
        System.out.println("");
        System.out.println("Alumno 2:");
        alumno2.imprime();
        System.out.println("");
        Alumno delegado;
        delegado = alumno1;
     
        delegado.colocarGrupo("3-A",'T');
        System.out.println("Delegado");
        delegado.imprime();
        alumno1.imprime();
        
        
        if (alumno1== alumno2){
        
         System.out.println("son iguales");
        } else {System.out.println("Son diferentes");
        
        }
        
        alumno1.colocarGrupo("5-A",'M');
        Alumno e1=new Alumno("hi", "hi" , 2000);
        e1.modificar(alumno1);
        System.out.println("Grupo: " + alumno1.obtenerGrupo());
       
        alumno1.colocarGrupo("11-A", 'M');
        alumno1.colocarGrupo("11-B");
        
        
        }
     
    public void modificar (Alumno a){
         a=new Alumno("a", "a", 1950);
         a.colocarGrupo("00",'M');
        }
        
        
        
    }

