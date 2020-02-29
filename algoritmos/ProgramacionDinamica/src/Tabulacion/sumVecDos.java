/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabulacion;

/**
 *
 * @author HRL56
 *
 *
 * Dado un conjunto de N números enteros positivos, donde N>1, se debe
 * determinar si dichos números pueden dividirse en dos grupos cuya suma sea la
 * misma.
 *
 */
import java.util.Arrays;

public class sumVecDos {

    public static void ordenarVec(int vec[], int n) {
        int i, j, temp;
        for (i = 0; i < n - 1; i++) {
            for (j = i + 1; j < n; j++) {
                if (vec[i] < vec[j]) {
                    temp = vec[i];
                    vec[i] = vec[j];
                    vec[j] = temp;
                }
            }
        }
    }
    
    

    public static boolean dosGrupos(int vec[], int res1[], int res2[], int n) {
        ordenarVec(vec,n);
        
        int temp = 0;

        int w = 0;
        int z = 0;
        int suma = 0;
        int mitad = 0;
        int aux = 0;

        for (int j = 0; j < n; j++) {
            suma += vec[j];

        }

        if (suma % 2 != 0) {
            return false;
        } else {

            mitad = suma / 2;

            for (int i = 0; i < n; i++) {
                temp = aux + vec[i];
                if (temp <= mitad) {
                    aux += vec[i];
                    res1[z++] = vec[i];
                } else {
                    res2[w++] = vec[i];
                }

            }

            if (!sm(res1, z, mitad) && !sm(res2, w, mitad)) {
                return false;
            } else {
                return false;
            }
            

        }

    }

    public static boolean sm(int vec[], int a, int b) {
        int sum = 0;
        for (int i = 0; i < a; i++) {
            sum += vec[i];
        }
        if (sum > b || sum < b) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        int vec[] = {1, 20, 3, 9, 2, 11, 4};
        ordenarVec(vec, vec.length);
        System.out.println(Arrays.toString(vec));

        int res1[] = new int[vec.length];
        int res2[] = new int[vec.length];

        System.out.println(dosGrupos(vec, res1, res2, vec.length));
        System.out.println(Arrays.toString(res1));
        System.out.println(Arrays.toString(res2));
    }

}
