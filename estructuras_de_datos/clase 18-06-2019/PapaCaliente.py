#programa 3.10 programa 3_10.py
#progrma de simulacion del juego de papa caliente

from Cola import *
import random

def papaCaliente(listaNombres,N): # N es el numero de rotaciones max en aleatorio
    colaSimulacion = Cola()

    for nombre in listaNombres: # ciclo para ingresar jugadores a la cola
        colaSimulacion.agregar(nombre)

    while colaSimulacion.tamano() > 1:
        for i in range(random.randrange(1,N)): # rotaciones # con aleatoriedad
            colaSimulacion.agregar(colaSimulacion.avananzar())
        print("Eliminado", colaSimulacion.avananzar())
        #colaSimulacion.avananzar() # eliminacion del que quedo en el frente

    return colaSimulacion.avananzar() # devolver el ganador
