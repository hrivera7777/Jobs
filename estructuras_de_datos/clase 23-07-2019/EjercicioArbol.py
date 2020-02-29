from FuncionesArbolRecursivo import *

arbol = ArbolBinario('a')

insertarIzquierdo(arbol,'e')

insertarIzquierdo(arbol,'d')

insertarIzquierdo(arbol,'b')

insertarDerecho(obtenerHijoIzquierdo(obtenerHijoIzquierdo(arbol)),'f')
#tem = ArbolBinario('h')
#insertarIzquierdo(tem,'i')

insertarDerecho(arbol,'h')
insertarDerecho(arbol,'c')

insertarIzquierdo(obtenerHijoDerecho(arbol),'g')
insertarIzquierdo(obtenerHijoDerecho(obtenerHijoDerecho(arbol)),'i')






print(arbol)