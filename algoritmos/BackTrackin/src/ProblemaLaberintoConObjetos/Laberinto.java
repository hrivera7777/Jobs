/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemaLaberintoConObjetos;

/**
 *
 * @author HRL56
 */
import java.util.ArrayList;

public class Laberinto {
    
    private Casilla[][] tablero;
    
    private ArrayList <ArrayList<Casilla>> caminos;
    
    public Laberinto (Casilla [][] tablero){
        
        this.tablero = tablero;
        caminos = new ArrayList<>();
    }
    
    
    
    
    
    
}
