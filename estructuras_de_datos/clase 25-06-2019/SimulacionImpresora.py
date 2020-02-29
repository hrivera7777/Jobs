#Programa simulacionde la cola de la impresora  - simulacion principal

from Cola import * # importa la clase Cola
from Impresora import * # Importa la clase Impresora
from Tarea import * # Importa la clase Tarea

import random

def simulacion(numeroSegundos, paginasPorMinuto):
    impresoraLaboratorio = Impresora(paginasPorMinuto)
    colaImpresion = Cola()# cola de trabajos de la impresora
    tiemposEspera = []# lista para tiempos de espera

    for segundoActual in range(numeroSegundos): # ciclo de sumulacion
        if nuevaTareaImpresion():# funcion auxiliar para lanzar el dado 180 caras
            tarea = Tarea(segundoActual) # crear la tarea
            colaImpresion.agregar(tarea) # agregar la tarea a la cola
        if(not impresoraLaboratorio.ocupada()) and (not colaImpresion.estaVacia()):
            tareaSiguiente = colaImpresion.avananzar()
            tiemposEspera.append(tareaSiguiente.tiempoEspera(segundoActual))
            impresoraLaboratorio.iniciarNueva(tareaSiguiente)

        impresoraLaboratorio.tictac() # conteo regresivo de ocupacion

    esperaPromedio = sum(tiemposEspera)/float(len(tiemposEspera))
    print("Tiempo de espera promedio%6.2f segundos"%(esperaPromedio))
    print("Teras restantes %3d" %(colaImpresion.tamano()))

def nuevaTareaImpresion(): # simula un dado de 180 caras
    numero = random.randrange(1,181) # genera el numero aleatorio
    if numero == 180: # si sale 180, se ha creado una tarea
        return True
    else:   # no salio 180, por tanto no hay nueva tarea creada
        return False

