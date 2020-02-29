
public class PruebaHerencia{
    
    public static void main(String [] args){
        GranMago granMago1 = new GranMago();
        granMago1.nombre = "Gandalf";
        granMago1.muestraNombre();
        ((Personaje) granMago1).muestraNombre();
    
    }

}
    