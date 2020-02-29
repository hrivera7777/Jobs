/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backtracking;

/**
 *
 * @author HRL56
 * Hans RIvera
 */
public class Caballos {
    
    public static void mostrar(int matriz [][]){
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 1; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println("\n");
        
    }
    
    public static boolean factible(int tablero[][], int px, int py){
        
        if(px>=1 && px<=8 && py>=1 && py<=8 && tablero[px][py]==-1){
            return true;
        }
        else{
            return false;
        }
        
        
    }
    
    
    
    
    public static void movimientoCaballo(int tablero[][], int px, int py, int nc, int vecm1[], int vecm2[]){
        
        if (nc == 64) {
            mostrar(tablero);
            
        }
        else{
           // System.out.println("1");
            if(factible(tablero, px, py)){
                tablero[px][py] = nc; // se introduce el número del caballo en el tablero para saber en que posición queda
                for (int i = 1; i <= 8; i++) { // se llama recursivamente cada caballo hasta terminar la posición de cada uno
                    movimientoCaballo(tablero, px+vecm1[i], py + vecm2[i] , nc + 1, vecm1, vecm2);
                }
                tablero[px][py] = -1;
            }
        }
    }
    
    
    public static void main(String[] args) {
        
        
        int Vec1[]={0, 2, 1, -1, -2, -2, -1, 1, 2}; // movimiento de los caballos 
        int Vec2[]={0, 1, 2,  2, 1, -1,-2, -2 ,-1 };
        
        int tablero[][] = new int [9][9];
        
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                tablero[i][j] = -1;
                
            }
        }
        
        
        mostrar(tablero);
        
        movimientoCaballo(tablero, 1, 1, 1, Vec1, Vec2);
        
        
        
    }
    
}
