# programa 5.1 progrma
# funcion de arbol binario

def ArbolBinario(r):
    return [r,[],[]]

def insertarIzquierdo(raiz, nuevaRama):
    t = raiz.pop(1) #extraer el hijo izquierddo de raiz, guardandolo en t

    if len(t) > 1:  #si hay hijo izquierdo, la longitud de t será > 1, (si tiene hijo la longitud es igual a 3 si no es igual a 0)
        raiz.insert(1,[nuevaRama,t,[]]) # en tal caso, t se hace hijo izq. del nuevo nodo
    else:               #si no había hijo izquierdo
        raiz.insert(1,[nuevaRama,[],[]]) # simplemente se inserta el nuevo nodo
    return raiz

def insertarDerecho(raiz, nuevaRama):
    t= raiz.pop(2)

    if len(t) > 1:
        raiz.insert(2,[nuevaRama,[],t])
    else:
        raiz.insert(2,[nuevaRama,[],[]])
    return raiz

def obtenerValorRaiz(raiz):
    return raiz[0] # consulta y devuelve el valor de la posicion 0 (donde está la raíz)

def asignarValorRaiz(raiz, nuevoValor):
    raiz[0]= nuevoValor # asigna nuevo valor a la posicion 0

def obtenerHijoIzquierdo(raiz):
    return raiz[1] # consulta y devuelve el valor de la posicion 1 (donde está hijo izq.)

def obtenerHijoDerecho(raiz):
    return raiz[2] # consulta y devuelve el valor de la posicion 2 (donde está hijo der.)