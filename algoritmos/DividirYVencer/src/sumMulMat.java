/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HRL56
 */
public class sumMulMat {
    
    public static void sumMatrizRec(int a[][], int b[][], int c[][], int x1, int y1, int x2, int y2){
        int mx, my;
        if(x1==x2 && y1==y2){
            c[x1][y1] = a[x1][y1] + b[x1][y1];
        }
        else if(x1 <=x2 && y1 <= y2){
                mx = (x1+x2)/2;
                my = (y1+y2)/2;
                sumMatrizRec(a, b, c, x1, y1, mx, my);
                sumMatrizRec(a, b, c, mx+1, y1, x2, my);
                sumMatrizRec(a, b, c, x1, my+1, mx, y2);
                sumMatrizRec(a, b, c, mx+1, my+1, x2, y2);
            
        }
        
    }
    
    public static void multMatRec(int a[][], int b[][], int c[][], int x1, int y1, int x2, int y2 ){
        int mx, my;
        
        if(x1==x2 && y1 == y2){
            
            c[x1][y1] += (a[x1][y1] * b[x1][y1]);
            
            
        }
        else if (x1<= x2 && y1 <= y2){
            mx = (x1+x2)/2;
            my = (y1+y2)/2;
            multMatRec(a, b, c, x1, y1, mx, my);
            multMatRec(a, b, c, mx+1, y1, x2, my);
            multMatRec(a, b, c, x1, my+1, mx, y2);
            multMatRec(a, b, c, mx+1, my+1, x2, y2);
            
            
        }
        
        
    }
    
    
    public static void main(String[] args) {
        int mat8[][] = {{2, 1, 3}, 
                        {5, 6, 7}, 
                        {8, 9, 4}};
        
        int mat[][] = {{2, 1, 3},
                      {5, 6, 7},
                      {8, 9, 4}};
        
        int mat7 [][] = new int [mat.length][mat[0].length] ;
        sumMatrizRec(mat, mat8, mat7,0, 0, 2, 2); //inicio x 0, inicio y 0 fin x col-1 
        
        
        
         for (int[] mat1 : mat7) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat1[j]+" ");
            }
            System.out.println("");
        }
         
         System.out.println("\n\n");
         System.out.println("\n\n");
         
           int mat9 [][] = new int [mat.length][mat[0].length] ;
         multMatRec(mat, mat8, mat9,0, 0, 2, 2); //inicio x 0, inicio y 0 fin x col-1 
        
        
        
         for (int[] mat1 : mat9) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat1[j]+" ");
            }
            System.out.println("");
        }
         
         
         
    }
    
}
