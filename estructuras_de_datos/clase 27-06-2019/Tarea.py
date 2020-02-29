#Programa 3.12 progrma 3_12.py
# Programa de simulacion de cola de la impresora - la clase Tarea

import random
import math

class Tarea:
    paginas = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]

    def __init__(self, tiempo):

        self.marcaTiempo = tiempo # Momento de creacion de tarea
        #self.paginas = random.randrange(1,21) # num de paginas  con una distribucion uniforme
        med = (paginas[8]+paginas[9]) / 2
        des = desviacionStandar()
        #
        self.paginas = round(random.gauss(mediana(), desviacionStandar()))  # num de paginas con distribucion gaussiana

        if self.paginas > 20:
            self.paginas = 20

        elif self.paginas < 1:
            self.paginas = 1



    def obtenerMarca(self): # metodo de consulta de la marca de tiempo
        return self.marcaTiempo
    def obtenerPaginas(self): # Metodo de comnsulta de num de paginas
        return self.paginas
    def tiempoEspera(self, tiempoActual): # para calcular el tiempo de espera en cola
        return tiempoActual- self.marcaTiempo

    def mediana():
        paginas = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
        return (paginas[8]+paginas[9]) / 2

    def desviacionStandar():
        paginas = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]

        x = sum(paginas)/len(paginas)
        suma =0
        for i in paginas:
            suma = (paginas - x)^2
            des = sqrt(suma)
        return des