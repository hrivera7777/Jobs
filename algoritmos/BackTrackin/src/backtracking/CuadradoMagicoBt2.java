/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backtracking;

/**
 *
 * @author HRL56
 */
public class CuadradoMagicoBt2 {

    public static void mostrar(int tablero[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static boolean esta(int matriz[][], int n, int x, int y, int posible) {
        for (int j = 0; j < 10; j++) {
            for (int k = 0; k < 10; k++) {
                if (matriz[j][k] == posible) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean factible(int matriz[][], int n, int valor, int x, int y, int posible) {
        int sumF[] = new int[n];
        int sumC[] = new int[n];
        int sumD1 = 0;
        int sumD2 = 0;

        if (esta(matriz, n, x, y, posible)) {
            return false;
        } 
        else {
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    sumF[i] += matriz[i][j];
                    sumC[i] += matriz[j][i];

                }
            }

            if (x == n - 1 && y == n - 1) {
                for (int k = 0; k < x; k++) {
                    sumD1 += matriz[k][k];
                    sumD2 += matriz[k][n - k];
                }
                for (int w = 0; w < x; w++) {
                    if (sumD1 == valor && sumD2 == valor && sumF[w] == valor && sumC[w] == valor) {
                        return true;

                    } else {
                        return false;
                    }
                }

            }
            else {
                for (int w = 0; w < 10; w++) {
                    if (sumF[w] <= valor && sumC[w] <= valor) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void cuadrado(int tablero[][], int n, int valor, int x, int y) {
        if (x == n) {
            mostrar(tablero, n);
            if (y < n) {
                for (int i = 0; i < n * n; i++) {
                    tablero[x][y] = i;
                    if (factible(tablero, n, valor, x, y, i)) {

                        cuadrado(tablero, n, valor, x, y + 1);
                    }
                    tablero[x][y] = -1;
                }

            } else {
                cuadrado(tablero, n, valor, x + 1, 0);
            }
        }

    }

}
