/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memoizacion;

/**
 *
 * @author HRL56
 */
public class mcm {
    
    public static void mcm(int mat[][], int a, int b, int fac){
        if(mat[a][b] !=0){
            return;
        }
        else{
            if(a%fac ==0 && b%fac == 0){
                mat[a][b] = fac;
                //System.out.println(fac);
            }
            /*else if(a%fac ==0){
                mcm(mat, a/fac,b,fac+1);
            }
            else if(b%fac ==0){
                mcm(mat, a,b/fac,fac+1);
            }
            */else{
                mcm(mat, a, b, fac+1);
                 //System.out.println(fac+1);
            }
        }
    }
    
    public static void main(String[] args) {
        
        int a=72;
        int b = 50;
        int mat [][] = new int [100][100];
        
        System.out.print("el mcm de "+ a + " y " + b+" es:");
        mcm(mat, a, b, 2);
        
        
        System.out.println(mat[a][b]);
    }
    
    
}
