/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicks;

import java.util.Arrays;

/**
 *
 * @author HRL56
 */
public class QuickS {

    /**
     * @param args the command line arguments
     */
    
    static void intercambio(int vec[], int cam1, int cam2){
        
        int aux = vec[cam1];
        vec[cam1] = vec[cam2];
        vec[cam2] = aux;
        
    }
    
    static int buscarPivote(int vec[], int ini, int fin) {

        int pos;

        int pivote = vec[ini];

        int cont = 0;

        for (int x = ini + 1; x < fin; x++) {
            if (vec[x] < pivote) {
                cont++;
            }
        }
        pos = cont + ini;
        intercambio(vec, ini, pos);

        int i = ini, j = pos + 1;

        while (i < pos && j <= fin) {
            
            if(vec[i]<pivote){
                i++;
            }
            else if (vec[j]>=pivote){
                j++;
            }
            else if(vec[i]>=pivote && vec[j]< pivote){
                
                intercambio(vec, i, j);
                i++;
                j++;
            }
            
        }

        return pos;

    }

    static void quickSort(int vec[], int ini, int fin) {

        if (ini < fin) {

            int pivote = buscarPivote(vec, ini, fin);

            quickSort(vec, ini, pivote - 1);
            quickSort(vec, pivote + 1, fin);

        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
        
        
         int vec[] = {2, 6, 7, 2, 1, 6, 78, 5, 6};
         
         System.out.println("el vector es: " + Arrays.toString(vec));
         
         quickSort(vec, 0, vec.length-1);
         
         System.out.println("el vector ordenado es: " + Arrays.toString(vec));
        
        
        
    }

}
