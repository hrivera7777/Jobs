/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

/**
 *
 * @author HRL56
 */
import java.util.Arrays;

public class BubleSortR {

    public static void bubleSortRec(int vec[], int n, int i, boolean cambio) {

        if (i < n-1) {
            if (vec[i] > vec[i + 1]) {
                int aux = vec[i];
                vec[i] = vec[i + 1];
                vec[i + 1] = aux;
                
                bubleSortRec(vec, n, i + 1, true);
            } else {
               
                bubleSortRec(vec, n, i + 1, cambio);
            }

        }else if(cambio){
        
            bubleSortRec(vec, n-1, 0, false);
        }
       
        
    

    }

    public static void main(String[] args) {
        int vec[] = {222, 96, 12, 4, 75, 5, 3, 6};
        bubleSortRec(vec, vec.length, 0, true);

        System.out.println(Arrays.toString(vec));
    }
}
