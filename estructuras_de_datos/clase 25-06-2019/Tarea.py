#Programa 3.12 progrma 3_12.py
# Programa de simulacion de cola de la impresora - la clase Tarea

import random

class Tarea:

    def __init__(self, tiempo):

        self.marcaTiempo = tiempo # Momento de creacion de tarea
        self.paginas = random.randrange(1,21) # num de paginas

    def obtenerMarca(self): # metodo de consulta de la marca de tiempo
        return self.marcaTiempo
    def obtenerPaginas(self): # Metodo de comnsulta de num de paginas
        return self.paginas
    def tiempoEspera(self, tiempoActual): # para calcular el tiempo de espera en cola
        return tiempoActual- self.marcaTiempo
