from Arbol2 import *
from RecorridosArbolesBinarios import *

miArbol = ArbolBinario('A')
miArbol.insertarIzquierda('D')
miArbol.insertarIzquierda('B')
miArbol.obtenerHijoIzquierdo().insertarDerecha('E')
miArbol.insertarDerecha('G')
miArbol.insertarDerecha('C')
miArbol.obtenerHijoDerecho().insertarIzquierda('F')
#recorrido en preorden
print('recorrido en preorden:')
preorden(miArbol)
print('')

print('recorrido en postrden:')
postorden(miArbol)
print('')

print('recorrido en en orden:')
enorden(miArbol)
print('')