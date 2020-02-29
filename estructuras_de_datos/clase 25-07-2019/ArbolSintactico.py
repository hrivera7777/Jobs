# program 5.9 : program 5_09.py

# codigo para crear un arbol de analisi sintactico

from Pila import Pila # importa la calse pila del modulo programa Pila

from Arbol2 import ArbolBinario # importa la clase arbol binario

def construirArbolSintactico(expresion):
    listaExpresion = expresion.split() # descomponer la expresion en sus simbolos individuales
    pilaPadres = Pila() # crea una pila para recordar cual es el nodo padre (al cual debemos volver)
    arbolExpresion = ArbolBinario('') # arbol bonario inicial(un nodo sin contenido)
    pilaPadres.incluir(arbolExpresion) # padre inicial se guarada en la pila
    arbolActual = arbolExpresion # el padre incial se marca como  " nodo actual"

    for i in listaExpresion:
        if i == '(':
            arbolActual.insertarIzquierda('')
            pilaPadres.incluir(arbolActual)
            arbolActual = arbolActual.obtenerHijoIzquierdo()
        elif i not in '+-*/)': # si es operando
            arbolActual.asignarValorRaiz(eval(i))
            padre = pilaPadres.extraer()
            arbolActual = padre
        elif i in '+-*/': # si es operador
            arbolActual.asignarValorRaiz(i)
            arbolActual.insertarDerecha('')
            pilaPadres.incluir(arbolActual)
            arbolActual = arbolActual.obtenerHijoDerecho()
        elif i == ')':
            arbolActual = pilaPadres.extraer()
        else:
            print("error: no se reconoce " + i)
    return arbolExpresion