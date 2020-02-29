#programa 3.4 programa_3_04.py
#Programa para solucionar el problema de verificación de simbolos balanceados

from Pila import Pila # importar clase Pila del modulo progtama Pila

def verificarSimbolos(cadenaSimbolos):
    p = Pila()
    balanceados = True
    indice = 0

    while indice < len(cadenaSimbolos) and balanceados:
        simbolo = cadenaSimbolos[indice]

        if simbolo in "([{":
            p.incluir(simbolo)

        elif simbolo in ")]}":
            if p.estaVacia():
                balanceados = False
            else:
                tope = p.extraer()
                if not parejas(tope,simbolo):
                        balanceados = False

        indice += 1


    if balanceados and p.estaVacia():
        return True

    else:
        return False


def parejas (simboloApertura, simboloCierre):
    aperturas = "([{"
    cierre = ")]}"

    return aperturas.index(simboloApertura) == cierre.index(simboloCierre)
