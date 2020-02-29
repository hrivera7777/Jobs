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
public class trianguloPascal {
    
    public static void trianguloP(int mat[][], int n){
        mat[0][0] =1;
        for (int i = 1; i < n; i++) {
            mat[i][0] =1;
            for (int k = 1; k < i; k++) {
                mat[i][k] = mat[i-1][k] + mat[i-1][k-1];
                
            }
            mat[i][i] =1;
        }
        
    }
    public static void main(String[] args) {
        int mat[][] = new int [30][30];
        
        int n = 6;
        
        trianguloP(mat, n);
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] +" ");
            }
            System.out.println("");
        }
    }
    
}
