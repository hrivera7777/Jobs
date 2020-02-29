# Programa 3.8 programa 3.08.py
# Programa de evaluacion de expresiones en notacion sufija

from Pila import Pila # importar clase pila del modulo programa 3.01
import string



#def evaluacionOperandos(operador):

#    if operador == "*":
#        return 1

#    elif operador == "/":
#        return 2

#    elif operador == "+":
#        return 3

#    elif operador == "-":
#        return 4
#    elif operador is string.punctuation:
#        return 5

#def evalaucionNumeros(numero):

#    if simbolo in string.digits:
#        valor += numero

#    return valor


def evaluacionNotacionSufija (expresionSufija):
    pilaOperandos = Pila()
    listaSimbolos = expresionSufija.split(",")
    #operadoresValidos = [1,2,3,4]

    for simbolo in listaSimbolos:
        #print(simbolo)

        #if simbolo in string.digits: #"0123456789"
           #pilaOperandos.incluir(int(simbolo))



        # numero = ""

        # if evaluacionOperandos(simbolo) == 0:
        # numero += simbolo
        # pilaOperandos.incluir(int(numero))

        #else:
        #    operando2 = pilaOperandos.extraer()
        #    operando1 = pilaOperandos.extraer()
        #    resultado = hacerAritmetica(simbolo,operando1,operando2)
        #    pilaOperandos.incluir(resultado)

        try:

            if simbolo in "+-/*": # evaluacionOperandos(simbolo)

                operando2 = pilaOperandos.extraer()
                operando1 = pilaOperandos.extraer()
                resultado = hacerAritmetica(simbolo,operando1,operando2)
                pilaOperandos.incluir(resultado)

            else:
                pilaOperandos.incluir(int(simbolo))

        except ValueError:
            print("el simbolo", simbolo, "es incorrecto, no se puede realizar la operacion")


    return pilaOperandos.extraer()

def hacerAritmetica (operador, operandoIzquierda, operandoDerecha):
    if operador == "*":
        return operandoIzquierda * operandoDerecha

    elif operador == "/":
        return operandoIzquierda / operandoDerecha

    elif operador == "+":
        return operandoIzquierda + operandoDerecha

    elif operador == "-":
        return operandoIzquierda - operandoDerecha


