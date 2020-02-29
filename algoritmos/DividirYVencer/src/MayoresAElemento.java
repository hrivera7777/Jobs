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

public class MayoresAElemento {
    
    ///elementos mayores a un numero dado en un vector
    
    public static void mayores(int vec[], int num, int ini, int fin, int resul[], int z){
        
        if(ini<=fin){
            if(vec[ini]> num){
                resul[z] = vec[ini];
                mayores(vec, num, ini+1, fin, resul, z+1);
            }
            else if(vec[fin]> num){
                resul[z] = vec[fin];
                mayores(vec, num, ini, fin-1, resul, z+1);
                
            }
            else{
                mayores(vec, num, ini+1, fin-1, resul, z);
            }
        }
    }
    
    public static void main(String[] args) {
        int vec[] = {2,6,8,79,5,41,2,6};
        int resul[] = new int [vec.length];
        
        int num = 3;
        
        mayores(vec, num, 0, vec.length-1, resul, 0);
        
        System.out.println("los elementos mayores a " + num + " son: " + Arrays.toString(resul));
        
        
    }
    
}
