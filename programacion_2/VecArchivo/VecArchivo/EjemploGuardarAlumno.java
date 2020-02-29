import java.util.*;

public class EjemploGuardarAlumno {
    public static void main(String args[]){
      Alumno alumno1 = new Alumno("Pedro","Perez",2000);  
      Alumno alumno2 = new Alumno("Maria","Mendez",2001);  
      Alumno alumno3 = new Alumno("jorge","ordoñez",1995);
      Alumno alumno4 = new Alumno("Hans","Rivera",1992);
      //Alumno alumno5 = new Alumno("mariana","Rodas",2001);
      
      
      Vector<Alumno> alumnos = new Vector();
      
      alumnos.add(alumno1);
      alumnos.add(alumno2);
      alumnos.add(alumno3);
      alumnos.add(alumno4);
      //alumnos.add(alumno5);
      
      Alumno.guardarVectorAlumnos(alumnos);
      Alumno.leerVectorAlumnos();
      
      //alumno1.guardarAlumno();
      //alumno1.leerAlumno();
      //alumno2.imprime();
      //alumno3.imprime();
    }
}