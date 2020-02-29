public class Calculos {
    public static void main (String args[]){
        int [] array = {34, 1 , 433, 23, 434, -12, -6, 4, 232, 3, 0,-2};
        int mayor, menor, suma;
        mayor = array [0];
        menor = array[0];
        suma =0;
        
        for (int i=0; i<array.length; i++){
            if (array [i] > mayor){
                mayor = array[i];
            }
            if(array[i] < menor){
                menor= array[i];
            }
            suma= suma + array[i];
        }
        System.out.println("El Mayor valor es: " + mayor);
        System.out.println("El menor valor es: " + menor);
        System.out.println("La suma es: " + suma);
        System.out.println("La media de los valores es: " + suma/array.length);
        
    }
}
//ejemplo de array