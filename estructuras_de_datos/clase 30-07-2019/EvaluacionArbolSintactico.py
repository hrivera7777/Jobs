# programa 5.10 programa 5_10.py

# funcion recursiva para evalular un arbol de analisis sintactivo binario
import operator # modulo operator

def evaluar(arbolSintactico):
    # diccionario con las parejas simboolo de operacion y operaciones correspondientes (modulo operator)
    operadores = {'+':operator.add, '-':operator.sub, '*':operator.mul, '/':operator.truediv}
    hijoIzquierda = arbolSintactico.obtenerHijoIzquierdo() # extraer hijo izquierdo
    hijoDerecha = arbolSintactico.obtenerHijoDerecho()  # extraer hijo derecho
    if hijoIzquierda and hijoDerecha: # si hay tanto hijo izquierdo como hijo derecho, entonces:
        fn = operadores[arbolSintactico.obtenerValorRaiz()] # consulta el diccionario
        return fn(evaluar(hijoIzquierda), evaluar(hijoDerecha)) # recursividad
    else:
        return arbolSintactico.obtenerValorRaiz()# caso base. no hay recursion cuando llegamos a las hojas

