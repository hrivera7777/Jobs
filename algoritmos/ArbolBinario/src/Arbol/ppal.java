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
public class ppal {
    public static void main(String[] args) {
        ArbolBinario arbolBinario = new ArbolBinario();
        arbolBinario.insertar(1);
        arbolBinario.insertar(7);
        arbolBinario.insertar(5);
        arbolBinario.insertar(8);
        arbolBinario.ver(arbolBinario.raiz);
        
        
    }
}
