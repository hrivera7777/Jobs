# Programa 3.5 programa_3_05.py
# programa de conversion de decimal a binario

from Pila import Pila # importa clase Pila del modulo programa 03 01

def dividirPor2(numeroDecimal):
    pilaResiduo = Pila()

    while numeroDecimal > 0:

        residuo = numeroDecimal % 2
        pilaResiduo.incluir(residuo)
        numeroDecimal = numeroDecimal // 2

    cadenaBinaria = ""

    while not pilaResiduo.estaVacia():
        cadenaBinaria = cadenaBinaria + str(pilaResiduo.extraer())

    return cadenaBinaria

