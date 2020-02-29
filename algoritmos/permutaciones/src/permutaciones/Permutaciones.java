/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package permutaciones;

/**
 *
 * @author HRL56
 */
public class Permutaciones {
    
    
    public static void permutaciones(int tablero [], int n){
        do{
            int cs=0;
            cs++;
         //   mostrar(tablero,n);
            
        }while(permutar(tablero,n, n+1));
        
    }
    
    public static boolean permutar(int vector [], int i, int n){
        int p;
        if(i>1){
            if(vector[i]>vector[i-1]){
                p = posMenor(vector, i, n, vector[i-1]);
                intercambiar(vector[p], vector[i-1]);
                mergeSortD(vector, i, n, new int [n]);
                return true;
                
            }
        }
        else {
            return permutar(vector, i-1,n);
                 
        }
        return false;
    }
    
    
    public static int posMenor(int vec[], int i, int n, int sig){
        int x, m =0;
        
        for(x = n-1; x>=i; x--){
            
            if(vec[x]>sig){
                m = x;
                x = -1;
            }
            
        }
        return m;
        
    }
    
    public static void intercambiar(int num1, int num2){
        
        int aux = num1 ;
        num1 = num2;
        num2 = aux;
        
    }
    
    public static void mergeSortD(int vec[], int ini, int fin, int temp[]){
        int mitad;
        if(ini< fin){
            mitad = (ini+fin)/2;
            mergeSortD(vec, ini, mitad, temp);
            mergeSortD(vec, mitad+1, fin, temp);
            fusionar(vec, ini, mitad, mitad+1, fin, temp);
        }
        
    }
    
    public static void fusionar(int vec[], int izq, int finizq, int der, int finder, int temp[] ){
        int z = izq;
        int numElem= finder-izq +1;
        
        while(izq<= finizq && der<= finder ){
            if(vec[izq]< vec[der]){
                temp[z++] = vec[izq++];
            }
            else{
                temp[z++] = vec [der++];
            }
            
        }
        
        while(izq<= finizq){
            temp[z++] = vec[izq++];
        }
        while(der<= finder){
            
            temp[z++] = vec[der++];
            
        }
        
        for(int i=0; i<numElem; i++, finder--){
            
            vec[finder] = temp[finder];
        }
        
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
