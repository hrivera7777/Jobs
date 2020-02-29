#programa 3.3 programa_3_03.py
#Programa la verificacion de parentesis balanceados

from Pila import Pila # importar clase Pila del mpdulo progtama Pila

def verificarParentesis(cadenaSimbolos):
    p = Pila()
    balanceados = True
    indice = 0

    while indice < len(cadenaSimbolos) and balanceados:
        simbolo = cadenaSimbolos[indice]

        if simbolo == "(":
            p.incluir(simbolo)

        #elif simbolo != ")" and simbolo !="(":
            #balanceados = True

        elif simbolo == ")":

            if p.estaVacia():
                balanceados = False

            else:
                p.extraer()

        indice += 1


    if balanceados and p.estaVacia():
        return True
    else:
        return False

