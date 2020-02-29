/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backtracking;

/**
 *
 * @author HRL56
 * Hans Rivera
 */
public class Suma15 {

    public static void sumar15(int tablero[], int pos) {
        if (pos == 10) {
            if (solucion(tablero)) {
                mostrar(tablero);
            }
        } else {
            for (int x = 1; x <= 9; x++) {
                tablero[pos] = x;
                sumar15(tablero, pos + 1);
            }
        }
    }

    public static boolean solucion(int tablero[]) {
        int x, sf1, sf2, sf3, sc1, sc2, sc3, sd1, sd2;
        sf1 = sf2 = sf3 = sc1 = sc2 = sc3 = sd1 = sd2 = 0;
        for (x = 1; x <= 3; x++) {
            sf1 += tablero[x];
            sf2 += tablero[3 + x];
            sf3 += tablero[6 + x];
            sc1 += tablero[3 * (x - 1) + 1];
            sc2 += tablero[3 * (x - 1) + 2];
            sc3 += tablero[3 * (x - 1) + 3];
        }
        sd1 += tablero[1] + tablero[5] + tablero[9];
        sd2 += tablero[3] + tablero[5] + tablero[7];
        if(sf1 == 15 && sf2 == 15 && sf3 == 15 && sc1 == 15
                && sc2 == 15 && sc3 == 15 && sd1 == 15 && sd2 == 15) {
            return true;
        } else {
            return false;
        }
    }

    public static void mostrar(int tablero[]) {
        
        for (int i = 1; i < tablero.length; i++) {
            
            System.out.print(tablero[i]);
            if (i % 3==0) {
                System.out.println();
                
            }
        }
        
        System.out.println("\n");
        

    }

    public static boolean factible(int tablero[]) {
        return false;

    }

    public static void sum15(int tablero[], int nr) {
        int x;

        if (nr == 10) {
            mostrar(tablero);
        } else {
            for (x = 1; x <= 9; x++) {
                tablero[nr] = x;
                if (factible(tablero)) {
                    sum15(tablero, nr + 1);
                }
                tablero[nr] = -1;
            }
        }
    }
    
    
    public static void main(String[] args) {
        
        
        int tablero [] = new int [10];
        
        sumar15(tablero, 0);
        
    }

}
