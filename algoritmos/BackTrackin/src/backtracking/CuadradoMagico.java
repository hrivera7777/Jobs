/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package backtracking;
import java.util.Arrays;
/**
 *
 * @author HRL56
 */
public class CuadradoMagico {

    public static boolean solucion(int tablero[], int n, int constante){
        int mat[][] = new int [n][n];
        int y = 0;
        
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n; j++) {
                mat[i][j]= tablero[y];
                y++;
              //  System.out.print(mat[i][j]);
            }
            //System.out.println();
        }
        
        int sumDP=0;
        int sumDS=0;
        int sumF[] = new int [n] ;
        int sumC [] = new int [n];
        
        boolean fc=false;
        
        
        for (int i = 0; i < n; i++) {
            sumDP += mat[i][i];
            sumDS += mat[i][(n-1)-i];
                
            for (int j = 0; j < n; j++) {
                sumF[i] += mat[i][j];
                //System.out.println("sumF " + sumF);
                sumC [i] += mat[j][i];
                //System.out.println("sumC " + sumC);
            }
            
        }
        
        
        for (int i = 0; i < n; i++) {
              // System.out.println("sf"+sumF[i] );
               //System.out.println("sC"+sumC[i] );
           
             if ((sumF[i]==constante)&& (sumC[i]==constante) && (sumDP == constante) && (sumDS == constante)) {
                fc= true;
            }
            
        }
        return fc;
            
        
        /*if (fc && sumDP == constante && sumDS == constante) {
            return true;
            
        }
        else {
            return false;
        }*/
        
    }
    
    public static boolean solucion2(int tablero[], int n, int constante){
        int mat[][] = new int [n][n];
        int y = 0;
        
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n; j++) {
                mat[i][j]= tablero[y];
                y++;
              //  System.out.print(mat[i][j]);
            }
            //System.out.println();
        }
        
        int sumDP=0;
        int sumDS=0;
        int sumF[] = new int [n] ;
        int sumC [] = new int [n];
        
        boolean fc=false;
        
        
        for (int i = 0; i < n; i++) {
            sumDP += mat[i][i];
            sumDS += mat[i][(n-1)-i];
                
            for (int j = 0; j < n; j++) {
                sumF[i] += mat[i][j];
                //System.out.println("sumF " + sumF);
                sumC [i] += mat[j][i];
                //System.out.println("sumC " + sumC);
            }
            
        }
        
        
        for (int i = 0; i < n; i++) {
              // System.out.println("sf"+sumF[i] );
               //System.out.println("sC"+sumC[i] );
           
             if ((sumF[i]<=constante)&& (sumC[i]<=constante) && (sumDP <= constante) && (sumDS <= constante)) {
                fc= true;
            }
            
        }
        return fc;
            
        
        /*if (fc && sumDP == constante && sumDS == constante) {
            return true;
            
        }
        else {
            return false;
        }*/
        
    }
    
    
    
    
    
    public static void mostrar(int tablero[], int n){
        
        for (int i = 0; i < n*n; i++) {
           System.out.print(tablero[i]);
           
               // if (i == n) {
              // System.out.println("\nhere");
                
            //} 
        }
        System.out.println("\n\n");
        
    }
    
    public static void cuadradoM(int tablero[], int n, int constante, int etapa){
        
        if(etapa == n*n){
            if(solucion(tablero, n, constante)){
                mostrar(tablero,n);
            }
            
        }
        
        else {
            for (int i = 1; i <= n*n; i++) {
                tablero[etapa] = i;
                cuadradoM(tablero, n, constante, etapa+1);
                
            }
        }
        
    }
    
    
    public static void cuadradoM2(int tablero[], int n, int constante, int etapa){
        if(etapa == n*n){
            mostrar(tablero,n);
        }
        else{
            for (int i = 1; i <= n*n; i++) {
                tablero[etapa] = i;
                
                if(solucion2(tablero,  n,  constante)){
                    cuadradoM2(tablero, n, constante, etapa+1);
                 }
            }
        }
        
        
    }
    
    
    
    public static void main(String[] args) {
        
       // int n = 8;
        int n = 3;
        
        int tablero[] = new int [n*n];
      // int tablero[] = {1,9,5,9,5,1,5,1,9};
        
        int constante = 15;
        //int constante = 15;
         
        cuadradoM(tablero, n, constante, 0);
        //cuadradoM2(tablero, n, constante, 0);
        
        
        
        
        /*for (int i = 0; i < n*n; i++) {
            tablero[i] = 1;
        }*/
        
      //System.out.println(solucion(tablero, n, constante));
        
        
    }
    
}
