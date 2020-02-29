/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backtracking;

/**
 *
 * @author HRL56
 */

import java.util.Arrays;
public class ProblemaReinas {
    
    public static final int n = 8;
    
    public static boolean reinas (int etapa, int solucion[], int n){
        
        if (etapa > n) {
            return false; // no encontró solucion
            
        }
        boolean exito = false;
        solucion[etapa] = -1;
        
        while(solucion[etapa] == n || exito){
            solucion[etapa] = solucion[etapa]+1; // seleccion de nueva opcion
            if (valido(solucion, etapa)) { // prueba si la solucion parcial es valida
                if(etapa!= n){
                    exito = reinas(etapa+1, solucion, n);//llamada recursiva
                    
                }
                else{
                    exito = true;
                }
                
            }
            
        }
        return exito;
    }
    
    public static boolean valido(int solucion[],int k){
       
        /*comprueba si el vector solucion construido hasta el paso k es k-prometedor es decir si la reina puede situiase en la columna k
        */
        for (int i = 0; i < k; i++) {
            if (solucion[i] == solucion[k] || Math.abs(solucion[i]-solucion[k]) == Math.abs(i-k)) {
                return false;
            }
            
        }
        return true;
    }
    
    public static void main(String[] args) {
        
        int solucion [] = new int [8];
        
        System.out.println(reinas(0, solucion, n));
        System.out.println(Arrays.toString(solucion));
       
        
        
    }
    
    
}
