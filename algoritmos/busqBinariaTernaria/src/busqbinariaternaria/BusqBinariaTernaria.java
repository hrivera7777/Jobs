/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busqbinariaternaria;

/**
 *
 * @author HRL56
 */
public class BusqBinariaTernaria {

    /**
     * @param args the command line arguments
     */
    public static boolean busqBinRec(int vec[], int num, int izq, int der) {

        if (izq > der) {
            return false;

        }
        int medio = (izq + der) / 2;
        if (vec[medio] == num) {
            return true;
        } else {
            if (vec[medio] > num) {
                return busqBinRec(vec, num, izq, medio - 1);
            } else {
                return busqBinRec(vec, num, medio + 1, der);

            }

        }

    }

    public static boolean busqTerRec(int vec[], int num, int izq, int der) {

        int tercio = (der - izq) / 3;
        int p1 = izq + tercio;
        int p2 = p1 + tercio;
        if (izq > der) {
            return false;
        }
        if (vec[p1] == num || vec[p2] == num) {
            return true;
        } else {
            if (vec[p1] > num) {
                return busqTerRec(vec, num, izq, p1 - 1);
            } else if (vec[p2] > num) {
                return busqTerRec(vec, num, p1 + 1, p2 - 1);
            } else {
                return busqTerRec(vec, num, p2 + 1, der);
            }
        }

    }

    public static boolean busqTerDesor(int vec[], int num, int izq, int der) {

        if (izq > der) {
            return false;
        } else {
            int tercio = (der - izq) / 3;
            int p1 = izq + tercio;
            int p2 = p1 + tercio;
            if (vec[p1] == num || vec[p2] == num) {
                return true;

            } else {
                return busqTerDesor(vec, num, izq, p1 - 1) || busqTerDesor(vec, num, (p1 + 1), (p2 - 1)) || busqTerDesor(vec, num, (p2 + 1), der);
            }
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here

        int vec[] = {1, 2, 3, 5, 7, 9, 12, 15, 16, 19};
        int vec2[] = {21, 235, 1, 53, 17, 99, 172, 15, 162, 3};
        int num = 3;

        System.out.println("¿el número se encuentra?(binaria) " + busqBinRec(vec, num, 0, vec.length - 1));
        System.out.println("¿el número se encuentra?(ternaria) " + busqTerRec(vec, num, 0, vec.length-1));
        System.out.println("¿el número se encuentra?(ternaria2) " + busqTerDesor(vec2, num, 0, vec.length - 1));
    }

}
