/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HRL56
 */
public class OcurrenciasVector {
    
    public static int ocurrencias(int vec[], int num, int ini, int fin){
        if(ini > fin){
            return 0;
            
        }
        else{
            if(vec[ini] == num){
                return 1 + ocurrencias(vec, num, ini+1, fin);
            }
            else if(vec[fin] == num){
                return 1 + ocurrencias(vec, num, ini, fin-1);
            }
            else{
                return ocurrencias(vec, num, ini+1, fin-1);
            }
            
        }
    }
    
    public static void main(String[] args) {
        int vec[] = {2,6,4,2,4,2,6,2,2,4,5};
        
        int num = 2;
        
        int ocurren = ocurrencias(vec, num, 0, vec.length-1);
        
        System.out.println("ocurrencias " + ocurren);
    }
    
}
