/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backtracking;

/**
 *
 * @author HRL56
 */
public class MochilaBt {
   /* int MAX = 10;
    int pesos[] = new int [MAX];
    int valores[] = new int [MAX];
    
    public MochilaBt(){
        
    }*/
    
    public static void mochila(int capacidad, int n, int pesos[], int valor[], int sumaP, int sumaV, int mejorV, int resp[], int nr){
     
        if(sumaP <= capacidad){
            if(mejorV< sumaV ){
                mejorV = sumaV;
            }
            else{
                for (int i = 0; i < n; i++) {
                    
                    if(sumaP + pesos[i] <= capacidad){
                        resp[nr] = i;
                        mochila(capacidad, n, pesos, valor, sumaP + pesos[i], sumaV+ valor[i], mejorV, resp, nr+1);
                        resp[nr] = -1;
                    }
                    
                }
            }
        }
    }
}
