public class Almacen {
    private int[] datos;
    private int numDatos;
    
    public Almacen(int tamanio){
        datos = new int [tamanio];
        numDatos = 0;
    }
    
    public boolean estaVacio(){
        return numDatos ==0;
    }
    
}