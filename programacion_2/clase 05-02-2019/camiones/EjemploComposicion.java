

public class EjemploComposicion{
    public static void main(String [] args){
        Alineacion equipoTitular = null;
        String[] nombres_defensas = {"Yerry Mina", "Oscar Murillo", 
                                     "Davison Sánchez", "Johan Mojica", "Santiago Arias", "Abel Aguilar",
                                     "Farid Díaz", "Carlos Sanchez", "Mateus Uribe"};
         
         String [] nombres_suplentes_campo = {"Cristian Zapata","Wilmar Barrios",  };   
         equipoTitular = new Alineacion ("David Ospina", "Falcao García",
                                         nombres_defensas,nombres_suplentes_campo.length, 
                                         nombres_suplentes_campo );
         
         equipoTitular.mostrarAlineacion();
    }

}
    