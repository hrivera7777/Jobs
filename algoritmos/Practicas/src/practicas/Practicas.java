/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas;

/**
 *
 * @author HRL56
 */
import java.util.Arrays;

public class Practicas {// practicas primer parcial (algoritmos voraces y recursividad)

    /**
     * @param args the command line arguments
     */
    static final int r = 50;

    static int[] gasolinera(int[] vec, int r) {
        int camino[] = new int[vec.length - 1];
        int gasolina = r;
        int total = 0; // recorido total desde punto a punto b 
        int recorrido = 0;
        for (int i = 0; i < vec.length; i++) {
            total += vec[i];
        }
        int j = 0;
        int k = 0;
        if (total <= r) {
            return camino;
            
        } else {
            while (recorrido < total) {
           // for (int i = 0; i < vec.length; i++) {

                if (gasolina - vec[j] <= 0) {
                    camino[k] = j;
                    gasolina = r;
                    recorrido += vec[j];
                    j++;
                    k++;
                } else {
                    gasolina -= vec[j];
                    recorrido += vec[j];
                    j++;
                }

          //  }
            }
        }
        return camino;
    }

    static int subEnCad(char[] cadena, char[] subC) {
        int contFinal = 0;
        int contSubC;

        if (cadena.length < subC.length) {
            return 0;
        } else {
            contSubC = 0;
            for (int i = 0; i < cadena.length; i++) {
                if (subC.length > contSubC + 1) {
                    if (cadena[i] == subC[contSubC]) {
                        contSubC++;
                    }
                } else {

                    contFinal++;
                    contSubC = 0;

                }
            }
        }

        return contFinal;
    }

    public static void main(String[] args) {
        // TODO code application logic here

        char[] cadena = {'l', 'a', ' ', 'r', 'i', 's', 'a', ' ', 'p', 'i', 's', 'a'};
        char[] Subadena = {'i', 's', 'a'};
        System.out.println("la sub cadena está " + subEnCad(cadena, Subadena));

        System.out.println("");
        System.out.println("");
        System.out.println("problema 2");
        System.out.println("\n\n");

        int vec[] = {8, 25, 20, 13, 19};

        System.out.println("las gasolineras que debe visitar es: " + Arrays.toString(gasolinera(vec, r)));

    }

}
