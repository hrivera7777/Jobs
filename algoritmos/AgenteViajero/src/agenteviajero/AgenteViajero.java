/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenteviajero;

/**
 *
 * @author HRL56
 */

import java.util.Arrays;
public class AgenteViajero {

    /**
     * @param args the command line arguments
     */
    static final int INF = 9999;

    /*static int masCorto(int[][] ady, int nodoI, int[] camino) {

        return 0;
    }*/
    
    static boolean esta(int[]camino, int nodo){
        for (int i = 0; i < camino.length; i++) {
            if(camino[i] == nodo){
                return true;
            }
        }
        return false;
        
    }

    static int[] agenteV(int[][] ady, int nodoI) {
       int camino [] = new int[ady.length];
       int tam =0 ;
       camino[tam++] = nodoI;
       int nodoAux =0; // nodo resultante que se ingresa al camino
       while(tam < ady.length){
           int min = INF;
           for (int i = 0; i < ady.length; i++) {
               if(ady[nodoI][i] < min && !esta(camino, i)){
                   min = ady[nodoI][i];
                   nodoAux = i;
                   
               }
           }
           camino[tam++] = nodoAux;
           nodoI = nodoAux;
       }
       
       
       return camino; 
    }
    
    
    

    public static void main(String[] args) {
        // TODO code application logic here
        
        int ady [] [] = {{INF,45,40,25,50},
                          {45, INF, 10, 55, 35},
                          {40, 10, INF, 20, 30},
                          {25, 55, 20, INF, 15},
                          {50, 35, 30, 15, INF}};
        
        System.out.println("el camino iniciando en 0 es" + Arrays.toString(agenteV(ady,0)));
    }

}
