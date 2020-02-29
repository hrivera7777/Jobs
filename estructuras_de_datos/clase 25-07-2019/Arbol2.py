#deficion de la clase ArbolBinario

class ArbolBinario:
    def __init__(self,objetoRaiz):
        self.clave = objetoRaiz
        self.izquierda= None
        self.derecha = None

    # insercion de un nuevo hijo izquierdo
    def insertarIzquierda(self, nuevoNodo):
        if self.izquierda == None: # si no hay hijo izquierdo simplemente se agrega el nuevo nodo
            self.izquierda == ArbolBinario(nuevoNodo) #... el cual a su vez es  un arbol binario(recurisividad)

        else: # si existia el hijo izquierdo, este se hace hijo izquierdo del nuevo nodo
            t = ArbolBinario(nuevoNodo) #... el cual, a su vez es un arbol binario (recursividad)
            t.izquierda = self.izquierda # conectar el hijo que ya existia como hijo nuevo del nuevo nodo
            self.izquierda = t # conectar el nuevo nodo como hijo izquierdo del nodo actual
    #insercion de un nuevo hijo derecho
    def insertarDerecha(self, nuevoNodo):
        if self.derecha == None:
            self.derecha = ArbolBinario(nuevoNodo)
        else:
            t = ArbolBinario(nuevoNodo)
            t.derecha = self.derecha
            self.derecha = t

# metodos de acceso para la clase arbolBinario

    def obtenerValorRaiz(self):
        return self.clave

    def asignarValorRaiz(self,obj):
        self.clave = obj

    def obtenerHijoIzquierdo(self):
        return self.izquierda

    def obtenerHijoDerecho(self):
        return self.derecha