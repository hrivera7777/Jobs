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
public class DistanciaLevenshtein {
    
    public static void distanciaLe(int c[][], char [] x, char []y, int n1, int n2){
        
        for (int i = 0; i <= n1; i++) {
            for (int j = 0; j <= n2; j++) {
                if(i==0){
                    c[i][j] = j;
                }
                else if (j == 0){
                    c[i][j] = i;
                }
                else if ( x[i-1] == y[j-1]){
                    c[i][j] = c[i-1][j-1];
                }
                else{
                    c[i][j] = 1+ min2(c[i-1][j], c[i][j-1], c[i-1][j-1]);
                    
                }
            }
            
        }
        
    }
    
    public static int min(int a, int b, int c){
        
        if (a < b && a<c){
            return a;
        }
        else if(b<a && b<c){
            return b;
        }
        else{
            return c;
        }
    }
    
    public static int min2(int a, int b, int c){
        int m = (a<b) ? a:b;
        return (m<c) ? m:c;        
    }
    
    
    public static void main(String[] args) {
        
        char [] x = {'o','t','r','o'};
        char [] y = {'a','l','g','o'};
        
        int mat [][] = new int[50][50];
        
        distanciaLe(mat, y, x, 4, 4);
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
        
    }
    
}
