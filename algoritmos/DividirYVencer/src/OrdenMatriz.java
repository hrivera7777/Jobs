


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HRL56
 */
public class OrdenMatriz {
    
    
    public static void ordMatFil(int [][] mat, int x2, int y1, int y2){
        
        int medio;
        
        if(y1> y2){
            
            mergeSort(mat[y1],0, mat[y1].length-1, new int [mat[y1].length]);
        }
        else {
            medio = (int) (y1+y2)/2;
            
            ordMatFil(mat, x2, y1, medio-1);
            ordMatFil(mat, x2, medio+1, y2);
            
        }
        
    }
    
    
    public static void mergeSort(int vec[], int ini, int fin, int temp[]){
        
        int medio;
        
        if(ini < fin){
            medio = (int) (ini + fin)/2;
            
            mergeSort(vec, ini, medio, temp);
            mergeSort(vec, medio+1, fin, temp);
            fusionar(vec, ini, medio, medio+1, fin, temp);
            
            
        }
        
        
        
    }
    
    public static void fusionar(int [] vec, int ini1, int fin1, int ini2, int fin2, int [] temp ){
        int z = ini1;
        int numEle = (fin2 - ini1)+1;
        
        while(ini1 <= fin1 && ini2 <= fin2 ){
            if(vec[ini1]< vec[ini2]){
                
                temp[z++] = vec[ini1++];
            }
            else {
                temp[z++] = vec[ini2++];
            }
        }
        
        while(ini1 <= fin1){
            temp[z++] = vec[ini1++];  
        }
        
        while(ini2 <= fin2){
             temp[z++] = vec[ini2++];  
        }
        for (int i = 0; i < numEle; i++, fin2--) {
            vec[fin2] = temp[fin2];
        }
        
        
        
    }
    
    
    
    
    public static void main(String[] args) {
        int mat8[][] = {{2, 1, 3}, 
                        {5, 6, 7}, 
                        {8, 9, 4}};
        
        int mat[][] = {{2, 1, 3},
                      {5, 6, 7},
                      {8, 9, 4}};
        
        int mat9 [][] = new int [mat.length][mat[0].length] ;
        //sumMatrizRec(mat, mat8, mat7,0, 0, 2, 2); //inicio x 0, inicio y 0 fin x col-1 
        ordMatFil(mat, 0, 0, 2);
        
        
         for (int[] mat1 : mat9) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat1[j]+" ");
            }
            System.out.println("");
        }
    }
    
    
}
