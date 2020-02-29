/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arboles;

/**
 *
 * @author HRL56
 */
//arbol binario
public class TipoArbol {
    
    final int MAX = 1000;
    int arb[];
    
    public TipoArbol(){
        arb = new int [MAX];
    }
    
    int hijoIzq(int i){
        return 2* i+1;
    }
    
    int hijoDer(int i){
        return 2* i+2;
    }
    
    void insertar (int arbol [], int raiz, int valor ){
        if(arbol[raiz] == -1){
            arbol[raiz] = valor;
            arbol[hijoIzq(raiz)] = arbol[hijoDer(raiz)] = -1;
            
        }
        else {
            if(valor > arbol[raiz]){
                insertar(arbol, hijoDer(raiz), valor);
            }
            else{
                insertar(arbol, hijoIzq(raiz), valor);
            }
        }
    }
    
    int altura (int arbol[], int raiz){
       if(arbol[raiz]==-1){
           return 0;
       }
       else{
           int izq = altura(arbol, hijoIzq(raiz));
           int der = altura(arbol, hijoDer(raiz));
           if(izq>der){
               return izq+1;
           }
           else{
               return der+1;
           }
       }
    }
    
    void crear (int arbol[], int raiz, int vec[], int n){
        if(arbol[raiz] != -1){
            crear(arbol, hijoIzq(raiz), vec, n);
            vec[n++] = arbol[raiz];
            crear(arbol, hijoDer(raiz), vec, n);
        }
    }
    
    public static void main(String[] args) {
        
    }
    
}
