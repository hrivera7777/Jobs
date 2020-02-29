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



public class NodoArbol {
    int dato; 
    NodoArbol hijoI, hijoD;
    
    public NodoArbol(int dato){
        this.dato = dato;
        hijoD = hijoI = null;
    }
    
    public String toString(){
        return "dato: " + dato;
    }
}
