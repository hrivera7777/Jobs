# Programa 3.6 programa_3_06.py
# programa de conversion de decimal a cualquier base (maximo base 60)

from Pila import Pila # importa clase Pila del modulo programa_03_01

def conversionBase(numeroDecimal, base):
    digitos = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"

    pilaResiduo = Pila()

    while numeroDecimal > 0:

        residuo = numeroDecimal % base
        pilaResiduo.incluir(residuo)
        numeroDecimal = numeroDecimal // base

    nuevaCadena = ""

    while not pilaResiduo.estaVacia():
        nuevaCadena = nuevaCadena + digitos [pilaResiduo.extraer()]

    return nuevaCadena
