#programa 5.11 programa5.11.py

def preorden(arbol):
    if arbol !=None:
        print(arbol.obtenerValorRaiz()),
        preorden(arbol.obtenerHijoIzquierdo())
        preorden(arbol.obtenerHijoDerecho())

def postorden(arbol):
    if arbol != None:
        postorden(arbol.obtenerHijoIzquierdo())
        postorden(arbol.obtenerHijoDerecho())
        print(arbol.obtenerValorRaiz())

def enorden(arbol):
    if arbol != None:
        enorden(arbol.obtenerHijoIzquierdo())
        print(arbol.obtenerValorRaiz())
        enorden(arbol.obtenerHijoDerecho())