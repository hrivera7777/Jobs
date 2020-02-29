/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caminocortografo;

import java.util.Arrays;
/**
 *
 * @author HRL56
 */
public class CaminoCortoGrafo {

    /**
     * @param args the command line arguments
     */
    
    
    static int  numNodos =6;
    static int ady [][] = new int [numNodos][numNodos];
    static final int INF = 9999;
    
    
    public static int[] caminos(int mat[][], int n, int inicio, int fin){
        
        boolean salida = false;
        int ruta[] = new int [n];
        int nr;
        int mejor;
        nr =0;
        ruta[nr++] = inicio;
        
        while (inicio!= fin && !salida){
            mejor = masCorta(mat,n,inicio,fin,ruta,nr);
            if(mejor != -1){
                ruta[nr++] = mejor;
                inicio = mejor;
                
            }
            else{
                salida = true;
            }
        }
        
        
        
        return ruta;
    }
    public static int masCorta(int mat[][], int n, int inicio, int fin, int ruta[], int nr){ //ruta mas corta
        
        int menor = INF, pos =0;
        
        for(int x =0; x<n; x++){
            if(mat[inicio][x]< menor && !esta(ruta,nr,x)){
                
                menor = mat[inicio][x];
                pos = x;
              // return pos;
            }
             
        }
        
        if (menor == INF){
            return -1;
        }else{
            return pos;
        }
    }
    
    
    public static boolean esta(int ruta[], int n, int nodo){ // verifica si el nodo se encutra ya en la ruta
        for(int x=0; x<n; x++){
            if(ruta[x] == nodo){
                return true;
            }
        }
        return false;
    }
    
    
    public static void main(String[] args) {
        
        
        
         ady [0][1] =  ady[1][0] = 10;
         
         ady[0][3]= ady[3][0] = 5;
         
         ady[0][4]= ady[4][0] = 8;
         
         ady[1][2] = ady[2][1] = 6;
       
         ady[2][3] = ady[3][2] =9;
         
         ady[2][5] = ady[5][2] =10;
         
         ady[3][5] = ady[5][3]=4;
         
         ady[4][5] = ady[5][4]=7;
         
         for(int i=0; i<5; i++){
             
             for(int j=0; j<numNodos; j++){
               if(ady[i][j] == 0){
                   ady[i][j] = INF;
               }   
             }
         }
         
         for(int i=0; i<numNodos; i++){
             for(int j=0; j<numNodos; j++){
                 System.out.print(ady[i][j] + " - - -");
                 
             }
                System.out.println("");
         }
         
         System.out.println(Arrays.toString(caminos(ady,numNodos, 0, 2)));
          
    }
    
}
