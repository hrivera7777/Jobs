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

public class Mediana {
    
    public static int medianaDosVec(int vec1 [], int vec2[], int n){
        
        int mediana;
        int temp [] = new int [2*n];
        
        fusionar(vec1, vec2, n, temp);
        
        if(n%2==0){
            mediana = ((2*n)+1)/2;
            return temp[mediana];
        }
        else{
            mediana = (temp[n])+(temp[n+1])/2;
            return mediana;
        }
        
        
        
        
    }
    
    public static void fusionar (int vec1 [], int vec2[], int n, int temp[]){
        int z =0;
        
        int ini1 = 0;
        int ini2 = 0;
        
        while(ini1<= n-1 && ini2 <= n-1){
            if(vec1[ini1] < vec2[ini2]){
                temp[z++] = vec1[ini1++];
            }
            else{
                temp[z++] = vec2[ini2++];
            }
        }
        
        while(ini1 <= n-1){
            temp[z++] = vec1[ini1++];
        }
        while(ini2 <= n-1){
            temp[z++] = vec2[ini2++];
        }
        
        
    }
    
    public static void main(String[] args) {
        
        int vec1 [] = {1,5,6,38,49};
        int vec2 [] = {20,25,26,28,29};
        int n = vec1.length;
        int temp[] = new int [2*n];
        fusionar(vec1, vec2, n, temp);
        
        System.out.println(Arrays.toString(temp));
        
        int mediana  = medianaDosVec(vec1, vec2, n-1);
        System.out.println("la mediana es: " + mediana);
    }
    
}
