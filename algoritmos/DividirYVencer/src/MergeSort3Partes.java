
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HRL56
 */
public class MergeSort3Partes {
    
    public static void mergeSort3(int vec[], int ini, int fin, int temp[]){
        int tercio, p1, p2;
        tercio= (int) (fin-ini)/3;
            p1 = ini + tercio;
            p2 =  tercio + p1;
        
        if(ini < fin){
            
            
            mergeSort3(vec, ini, p1, temp);
            mergeSort3(vec, p1+1, p2, temp);
            mergeSort3(vec, p2+1, fin, temp);
            fusion3(vec,ini, p1, p1+1, p2, p2+1, fin, temp);
        }
    }
    
    public static void fusion3(int vec[], int izq, int fizq, int cen, int fcen, int der, int fder, int temp[]){
        
        int numElm = fder-izq+1;
        int z = izq;
        
        while(izq<=fizq && cen<=fcen && der<=fder){
            if(vec[izq]<vec[cen] && vec[izq]<vec[der]){
                temp[z++] = vec[izq++];
            }
            else if(vec[cen]<vec[izq]&&vec[cen]<vec[der]){
                temp[z++] = vec[cen++];
            }
            else{
                temp[z++] = vec[der++];
            }
        }
        
        while(izq<=fizq && cen<=fcen){
            if(vec[izq]< vec[cen]){
                temp[z++] = vec[izq++];
            }
            else {
                temp[z++] = vec[cen++];
            }
        }
        
        while(cen<=fcen && der<=fder){
            if(vec[cen]< vec[der]){
                temp[z++] = vec[cen++];
            }
            else {
                temp[z++] = vec[der++];
            }
        }
        
        while(izq<=fizq && der<=fder){
            if(vec[izq]< vec[der]){
                temp[z++] = vec[izq++];
            }
            else {
                temp[z++] = vec[der++];
            }
        }
        
        while (izq <= fizq){
            temp[z++] = vec[izq++];
            
        }
        
        while (cen <= fcen){
            temp[z++] = vec[cen++];
            
        }
        
        while (der <= fder){
            temp[z++] = vec[der++];
            
        }
        for (int i = 0; i < numElm; i++, fder--) {
            vec[fder] =temp[fder];
        }
    }
    
     public static void main(String[] args) {
        // TODO code application logic here

        //prueba del marge sort 
        int vec[] = {2, 6, 7, 2, 1, 66, 12, 5, 6,1,5,4,4,5};
       // int vec2[] = {2, 6, 7, 2, 1, 6, 78, 5, 6,1};

        //int vec1[] = {1, 2, 3, 5, 6, 9, 12};
        //int vec2[] = {12, 23, 35, 56, 69, 97, 122};
       // int dos[] = new int[vec1.length + vec2.length];
        //fusion3(vec1, vec1.length, vec2, vec2.length, dos);
       // System.out.println("la fusion del vec1 y vec2 es: " + Arrays.toString(dos));

        System.out.println("el vector sin ordenar es: " + Arrays.toString(vec));
       
        mergeSort3(vec, 0, vec.length - 1, new int[vec.length]);

        System.out.println("el vector ordenado es: " + Arrays.toString(vec));
        
        /*System.out.println("\n");
        
        System.out.println("el vector sin ordenar es: " + Arrays.toString(vec2));
       
        mergeSort3(vec2, 0, vec.length - 1, new int[vec.length]);

        System.out.println("el vector ordenado es: " + Arrays.toString(vec2));*/
    }
    
}
