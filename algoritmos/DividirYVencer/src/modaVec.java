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
public class modaVec {
    
    public static void moda(int vec[], int ini, int fin, int res[]){
        
        if(ini <= fin){
            
            int medio = (ini+fin)/2;
            if(vec[ini] == vec[medio]){
                res[vec[medio]] ++;
                moda(vec, ini, medio-1, res);
            }
            else if(vec[medio] == vec[fin]){
                res[vec[medio]]++;
                moda(vec, medio+1, fin, res);
            }
            else{
                moda(vec, ini, medio, res);
                moda(vec, medio+1, fin, res);
            }
            
        }
       
    }
    
    public static void main(String[] args) {
        int vec[] = {1,2,2,3,3,5};
        int res[] = new int [5];
        moda(vec, 0, vec.length-1, res);
        System.out.println(Arrays.toString(res));
        
        System.out.print("la moda del vector " + Arrays.toString(vec)+ " es: ");
        int max =0;
        /*for (int i = 0; i < res.length; i++) {
             max = res[i];
            
        }*/
        for (int i = 1; i < res.length; i++) {
            if (res[i] >= res[i-1] && res[i]>0) {
                System.out.print(i + " ");
                
                
            }
        }
    }
}
