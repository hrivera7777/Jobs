#deficion de la clase ArbolBinario

class ArbolBinario:
    def __init__(self,objetoRaiz):
        self.clave = objetoRaiz
        self.izquierda= None
        self.derecha = None
    def insertarIzquierda(self, nuevoNodo):
        if self.izquierda == None: # si no hay hijo izquierdo simplemente se agrega el nuevo nodo
            self.izquierda == ArbolBinario(nuevoNodo) #... el cual a su vez es  un arbol binario(recurisividad)

        else: # si existia el hijo izquierdo, este se hace hijo izquierdo del nuevo nodo
            t= ArbolBinario(nuevoNodo) #... el cual, a su vez es un arbol binario (recursividad)
            t.izquierda = self.izquierda # conectar el hijo que ya existia como hijo nuevo del nuevo nodo
            self.izquierda = t # conectar el nuevo nodo como hijo izquierdo del nodo actual

    def insertarDerecha(self, nuevoNodo):
        if self.derecha == None:
            self.derecha = ArbolBinario(nuevoNodo)
        else:
            t= ArbolBinario(nuevoNodo)
            t.derecha = self.derecha
            self.derecha = t

