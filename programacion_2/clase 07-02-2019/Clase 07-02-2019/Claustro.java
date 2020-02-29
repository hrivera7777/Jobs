
public class Claustro{
    private Profesor titular, rector;
    private Alumno alumno;
    private Administrativo repAdministracion;
    
    
    Claustro(Profesor rector, Profesor titular, Alumno alumno, Administrativo repAdministrativo){
        this.rector = rector;
        this.titular = titular;
        this.alumno = alumno;
        this.repAdministracion = repAdministracion;
    
    }
    
    public void imprimeClautro(){
        System.out.println("El Claustro consiste de: ");
        System.out.print("Rector:");
        rector.imprime();
        System.out.print("Profesor titular: ");
        titular.imprime();
        System.out.print("Alumno: ");
        alumno.imprime();
        System.out.print("Representante de la administración: ");
        repAdministracion.imprime();
    
    }
}