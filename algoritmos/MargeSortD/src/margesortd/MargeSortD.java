/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package margesortd;

/**
 *
 * @author HRL56
 */
import java.util.Arrays;

public class MargeSortD {

    /**
     * @param args the command line arguments
     */
    static void fusion(int vec1[], int n1, int vec2[], int n2, int vec[]) {

        int x = 0, y = 0, z = 0;

        while (x < n1 && y < n2) {
            if (vec1[x] < vec2[y]) {
                vec[z++] = vec1[x++];
            } else {

                vec[z++] = vec2[y++];
            }
        }
        while (x < n1) {
            vec[z++] = vec1[x++];
        }
        while (y < n2) {
            vec[z++] = vec2[y++];
        }
    }

    static void fusion2(int vec[], int res[], int izq, int finIzq, int der, int finDer) {

        int z = izq; // la parte mas izquierda del vector no necesariamente es 0 por eso es necesario usar izq como referente
        int numele = finDer - izq + 1;

        while (izq <= finIzq && der <= finDer) {
            if (vec[izq] < vec[der]) {
                res[z++] = vec[izq++];
            } else {

                res[z++] = vec[der++];
            }
        }
        while (izq <= finIzq) {
            res[z++] = vec[izq++];
        }
        while (der <= finDer) {
            res[z++] = vec[der++];
        }

        for (int i = 0; i < numele; i++, finDer--) {
            vec[finDer] = res[finDer];
        }
    }

   /* static void mezcla(int vector[], int temp[], int izq, int fizq, int der, int fder) {
        int postemp = izq, numele, i;
        numele = fder - izq + 1;
        while (izq <= fizq && der <= fder) {
            if (vector[izq] < vector[der]) {
                temp[postemp++] = vector[izq++];
            } else {
                temp[postemp++] = vector[der++];
            }
        }
        while (izq <= fizq) {
            temp[postemp++] = vector[izq++];
        }
        while (der <= fder) {
            temp[postemp++] = vector[der++];
        }
        for (i = 0; i < numele; i++, fder--) {
            vector[fder] = temp[fder];
        }
    }*/

    static void mergeS(int[] vec, int ini, int fin, int[] res) {

        int mitad;

        if (ini < fin) {

            mitad = (int) (ini + fin) / 2;

            mergeS(vec, ini, mitad, res);
            mergeS(vec, mitad + 1, fin, res);

            fusion2(vec, res, ini, mitad, mitad + 1, fin);

        }

    }

    public static void main(String[] args) {
        // TODO code application logic here

        //prueba del marge sort 
        int vec[] = {2, 6, 7, 2, 1, 6, 78, 5, 6};

        int vec1[] = {1, 2, 3, 5, 6, 9, 12};
        int vec2[] = {12, 23, 35, 56, 69, 97, 122};
        int dos[] = new int[vec1.length + vec2.length];
        fusion(vec1, vec1.length, vec2, vec2.length, dos);
        System.out.println("la fusion del vec1 y vec2 es: " + Arrays.toString(dos));

        mergeS(vec, 0, vec.length - 1, new int[vec.length]);

        System.out.println("el vector ordenado es: " + Arrays.toString(vec));
    }

}
