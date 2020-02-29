/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemamonedasvoraz;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Hans Rivera
 */
public class ProblemaMonedasVoraz {

    /**
     * @param args the command line arguments
     *
     * problema voraz cambio de monedas (devolucion)
     */
    public static void bubleSort(int vec[]) {

        int aux;
        boolean cambio = true;
        int tam = vec.length;

        do {
            cambio = false;
            for (int i = 0; i < tam - 1; i++) {

                if (vec[i] > vec[i + 1]) {

                    aux = vec[i];
                    vec[i] = vec[i + 1];
                    vec[i + 1] = aux;
                    cambio = true; // variable bandera para verificar si hay cambio en el arreglo

                }

            }
            tam--;
        } while (cambio);

    }

    public static void insertionSort(int vec[]) {

        int key;
        int i;

        for (int j = 1; j < vec.length; j++) {

            key = vec[j];
            i = j - 1;
            while (i >= 0 && vec[i] > key) {
                vec[i + 1] = vec[i];
                i = i - 1;
            }
            vec[i + 1] = key;

        }

    }

    public static String solucionMonedas(int objetivo, int monedas[]) {

        insertionSort(monedas);
        String respuesta = "La solucion encontrada es: ";
        int i = monedas.length-1;// banderas
        int j = 0;//banderas
        int solucion = 0;

//        while(solucion != objetivo){
//            
//            i = monedas.length-1;
//            
//            while(i>=0){
//                
//                if((solucion+monedas[i])<=objetivo){
//                    
//                    solucion += monedas[i];
//                    respuesta += "\n Una moneda de: "+monedas[i];
//                }else{
//                    i=i-1;
//                }
//            }
//        }
        while (i >= 0) {

            if ((solucion + monedas[i]) <= objetivo) {

                solucion = solucion + monedas[i];
                j++; // cuenta cuantas veces se toma la moneda seleccionada
            } else {
                if (j == 1) {
                    respuesta += "\n      " + j + " moneda de: " + monedas[i];

                } else if (j > 1) {
                    respuesta += "\n      " + j + " monedas de: " + monedas[i];
                }
                i = i - 1;
                j = 0;

                if ((solucion + monedas[0]) > objetivo) {

                    solucion = objetivo;
                }

            }
        }

        return respuesta;
    }

    public static void main(String[] args) {
        // TODO code application logic here

        int arr1[] = {2, 1, 2, 5, 7, 6, 8, 1, 2, 3, 9, 3, 4};
        int arr2[] = {2, 1, 2, 5, 7, 6, 8, 1, 2, 3, 9, 3, 4};

        System.out.println("se organiza el arreglo con buble Sort ");
        System.out.println("el arreglo inicial es: " + Arrays.toString(arr1));
        bubleSort(arr1);
        System.out.println("El arreglo ordenado es:  " + Arrays.toString(arr1));

        System.out.println("\n\nse organiza el arreglo con insertion Sort ");
        System.out.println("el arreglo inicial es: " + Arrays.toString(arr2));
        insertionSort(arr2);
        System.out.println("El arreglo ordenado es:  " + Arrays.toString(arr2));

        //String entrada;
        //int entrada;
        int cantidad = 1;
        boolean bandera = true;
        int monto = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("se lee la cantidad de valores de monedas a utilizar");

        while (bandera) {
            try {
                cantidad = teclado.nextInt() ; // se usa +1 para completar el espacio necesario

                if (cantidad <= 0) {
                    System.out.println("ingrese un número mayor a cero");
                    bandera = true;
                } else {
                    bandera = false;
                }

            } catch (NumberFormatException e) {
                System.out.println("ingresó un caracter incorrecto, intente nuevamente");
                bandera = true;
            }
        }
        int monedas[] = new int[cantidad];
        
        
        System.out.println("ingrese los valores de las monedas disponibles\n ");
        bandera = true;
        while (bandera) { // se llena el vector con la cantidad de monedas

            try {

                for (int i = 0; i < cantidad; i++) {
                    System.out.println("ingrese el valor de la moneda " + (i+1));
                    monedas[i] = teclado.nextInt();

                }
                bandera = false;

            } catch (NumberFormatException e) {
                System.out.println("ingresó un caracter incorrecto, ingrese nuevamente los elementos");
                bandera = true;
            }
            
        }
        
        
        System.out.println("\n\nIngrese el monto para el cambio");
        
        bandera = true;
        while (bandera) {  
        try {
                monto = teclado.nextInt();
                bandera = false;
              

            } catch (NumberFormatException e) {
                System.out.println("ingresó un caracter incorrecto, intente nuevamente");
                bandera = true;
            }
        }
        
        System.out.println(solucionMonedas(monto, monedas));
        

    }

}
