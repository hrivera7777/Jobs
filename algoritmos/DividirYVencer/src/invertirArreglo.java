/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HRL56
 */
import java.util.Arrays;
public class invertirArreglo {
    
    public static void invertirArr(int vec[], int ini, int fin){
        if(ini<fin){
            int aux = vec[ini];
            vec[ini] = vec[fin];
            vec[fin] = aux;
            invertirArr(vec, ini+1, fin-1);
        }
        
    }
    
    public static void main(String[] args) {
        
        int vec [] = {1,2,3,4,5,6,7};
        
        
        
        System.out.println("el arreglo es:" +Arrays.toString(vec)); 
        
        invertirArr(vec, 0, vec.length-1);
        
        System.out.println("el arreglo al revés es:" +Arrays.toString(vec)); 
        
        
    }
    
}
