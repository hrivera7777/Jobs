/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabulacion;

/**
 *
 * @author HRL56
 */
public class DevolverCambio {

    public final static int INF = 9999999;
    public int numMonedas;
    public int moneda;
    public int posX;
    public int posY;

    /* public DevolverCambio(int numMonedas, int moneda, int posX, int posY) {
     this.numMonedas = numMonedas;
     this.moneda = moneda;
     this.posX = posX;
     this.posY = posY;
     }*/
    public static void devolver(int c[][], int cantDenomi, int denoMonedas[], int cambio) {
        for (int i = 0; i < cantDenomi; i++) {
            c[i][0] = 0;
        }

        for (int i = 1; i < cantDenomi; i++) {
            for (int j = 1; j < cambio; j++) {

                if (i == 1 && j < denoMonedas[i]) {
                    c[i][j] = INF;
                }
                else if (i == 1 && j >= denoMonedas[i]){
                    c[i][j] = 1 + c[i][j - denoMonedas[i]];
                }
                else if (i > 1 && j < denoMonedas[i]) {
                    c[i][j] = c[i-1][j];
                } else {
                    c[i][j] = minimo(c[i - 1][j], 1 + c[i][j - denoMonedas[i]]);

                }

            }
        }

    }

    public static int minimo(int a, int b) {
        return (a < b) ? a : b;
    }

    public static void devolverObj(DevolverCambio c[][], int cantDenomi, int denoMonedas[], int cambio) {

        for (int i = 0; i < cantDenomi; i++) {
            c[i][0].numMonedas = 0;
            c[i][0].moneda = -1;
            c[i][0].posX = c[i][0].posY = -1;

        }

        for (int i = 1; i < cantDenomi; i++) {
            for (int j = 1; j < cambio; j++) {

                if (i == 1 && j < denoMonedas[i]) {
                    c[i][j].numMonedas = INF;
                    c[i][j].moneda = -1;
                    c[i][j].posX = c[i][j].posY = -1;

                } else if (i == 1) {
                    c[i][j].numMonedas = 1 + c[i][j - denoMonedas[i]].numMonedas;
                    c[i][j].moneda = denoMonedas[i];
                    c[i][j].posX = i;
                    c[i][j].posY = j - denoMonedas[i]; // why?
                } else if (j < denoMonedas[i]) {
                    // System.out.println(i);
                    c[i][j].numMonedas = c[i - 1][j].numMonedas;
                    c[i][j].moneda = -1;
                    c[i][j].posX = i - 1;
                    c[i][j].posY = j;

                } else if (c[i - 1][j].numMonedas < (1 + c[i][j - denoMonedas[i]].numMonedas)) {
                    c[i][j].numMonedas = c[i - 1][j].numMonedas;
                    c[i][j].moneda = -1;
                    c[i][j].posX = i - 1;
                    c[i][j].posY = j;
                } else {
                    c[i][j].numMonedas = 1 + c[i][j - denoMonedas[i]].numMonedas;
                    c[i][j].moneda = denoMonedas[i];
                    c[i][j].posX = i;
                    c[i][j].posY = j - denoMonedas[i];

                }
            } // fin for j

        }//fin for i

    }

    public static void valores(DevolverCambio c[][], int cantDenomi, int denoMonedas[], int cambio) {
        int px = cantDenomi;
        int py = cambio;
        int pi;
        int pj;

        while (px != 0 && py != -1) {
            if (c[px][py].moneda != -1) {
                //System.out.println("Devuleve una moneda de: " + denoMonedas[c[px][py].moneda]);
                System.out.println("Devuleve una moneda de: " + denoMonedas[px]);
            }
            pi = c[px][py].posX;
            pj = c[px][py].posY;
            px = pi;
            py = pj;
        }

    }

    public static void main(String[] args) {

        /* int cantMonedas = 5;
         int denoMonedas[] = {50, 100, 200, 500, 1000};
         int cambio = 2000;
         DevolverCambio mat [][] = new DevolverCambio[cantMonedas][cambio];
        
         devolver(mat, cantMonedas, denoMonedas, cambio);
         valores(mat, cantMonedas, denoMonedas, cambio);*/
        
        
        int cantMonedas = 6;
        int denoMonedas[] = {0,1, 2, 5, 10, 20};
        int cambio = 17;
        DevolverCambio mat[][] = new DevolverCambio[cantMonedas][cambio];

        for (int i = 0; i < cantMonedas; i++) {
            for (int j = 0; j < cambio; j++) {
                mat[i][j] = new DevolverCambio();

            }
        }

        devolverObj(mat, cantMonedas, denoMonedas, cambio);

        for (int i = 0; i < cantMonedas; i++) {
            for (int j = 0; j < cambio; j++) {
                System.out.print(mat[i][j].numMonedas + " ");

            }
            System.out.println("");
        }

        valores(mat, cantMonedas - 1, denoMonedas, cambio - 1);
        /////////////////////////////////////////////////////////
        
        
        cantMonedas = 6;
        cambio = 17;
        int mat2[][] = new int [cantMonedas][cambio];
        devolver(mat2, cantMonedas, denoMonedas, cambio);
        
        for (int i = 0; i < cantMonedas; i++) {
            for (int j = 0; j < cambio; j++) {
                System.out.print(mat2[i][j]+" ");

            }
            System.out.println("");
        }
        
        
        System.out.println("la cantidad de monedas es: " + mat2[cantMonedas-1][cambio-1]);
    }

}
