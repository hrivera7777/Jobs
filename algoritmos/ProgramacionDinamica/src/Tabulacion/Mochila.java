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
public class Mochila {
    
    public static final int INF = -999999999;
    
    public static void mochilaPD(int c[][], int peso[], int valor[], int capacidad, int elementos) {

        for (int i = 0; i < elementos; i++) {
            c[i][0] = 0;
        }

        for (int i = 1; i < elementos; i++) {
            for (int j = 1; j < capacidad; j++) {
                if (i == 1 && j < peso[i]) {
                     c[i][j] = INF;
                }
                else if(i==1){
                    c[i][j] = valor[i] + c[i][j-peso[i]];
                }
                else if(j < peso[i]){
                    c[i][j] = c[i-1][j];
                }
                else{
                    c[i][j] = maximo(c[i-1][j], valor[i]+ c[i][j-peso[i]]);
                }
            }

        }

    }
    
    public static int maximo(int a, int b) { 
	return (a > b) ? a : b; 
} 

    
    public static void main(String[] args) {
        
        int elementos =4;
        int capacidad = 20;
        int pesos [] = {7,5,6,8};
        int valor [] = {3,2,1,4};
        
        int mat[][] = new int [25][25];
        
        mochilaPD(mat, pesos, valor, capacidad, elementos);
        
        for (int i = 0; i < elementos; i++) {
            for (int j = 0; j < capacidad; j++) {
                System.out.print(mat[i][j] + " " );  
                
            }
            System.out.println("");
        }
        
        System.out.println("la solucion es: " + mat[elementos-1][capacidad-1]);
        
       
    }

}
