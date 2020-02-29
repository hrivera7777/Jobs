/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol;

/**
 *
 * @author HRL56
 */
public class ArbolBinario {
    NodoArbol raiz;
    
    public ArbolBinario(){
        raiz = null;
    }
    public void insertar (int dato){
        NodoArbol nuevo = new NodoArbol(dato);
        if(raiz == null){
            raiz = nuevo;
        }else {
            NodoArbol tmp = raiz;
            NodoArbol padre;
            while(true){
                padre = tmp;
                if (dato< tmp.dato) {//izquierda
                    tmp = tmp.hijoI;
                        if (tmp == null) {
                            padre.hijoI = nuevo;
                            return;
                        
                    }
                    
                }else{//derecha
                    tmp = tmp.hijoD;
                        if (tmp == null) {
                            padre.hijoD = nuevo;
                            return;
                    }
                }
            }
        }
        
    }
    public boolean vacio(){
        return raiz == null;
    }
    
    public void ver(NodoArbol nodo){
        if (nodo !=null) {
            ver(nodo.hijoI);
            System.out.println(nodo.dato);
            ver(nodo.hijoD);
        }
    }
}
