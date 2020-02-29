#Programa 3.11 : programa 3_11.py
#Programa de sumulaciuon de cola de la impresora - la clase Impresora


class Impresora:
    def __init__(self, paginas):
        self.tasaPaginas = paginas # Velocidad nominal de la impresora (en pags/min)
        self.tareaActual = None # Bandera de disponibilidad de la impresora
        self.tiempoRestante = 0 # Tiempo que falta para estar disponibile

    def tictac(self): # simula el conteo regresivo del tiempo de ocupacion con una tarea

        if self.tareaActual != None: # si hay una tarea asignada
            self.tiempoRestante = self.tiempoRestante - 1 # conteo regresivo
            if self.tiempoRestante <= 0: # si trancurriotodo el tiempo de la terea # <=0 original == pero se cambia a <= para que la una tasa de impresion de paginas pueda ser un número diferente de un multiplo de 5
                self.tareaActual = None # Poner en "disponible"  a la impresora

    def ocupada(self): # metodo de consulta sobre la disponibilidad de la impresora
        if self.tareaActual != None: # Impresora ocupada
            return True
        else:    # la impresora esta disponible
            return False

    def iniciarNueva(self,nuevaTarea): #recibe un objeto de clase Tarea
        self.tareaActual= nuevaTarea # asignarle la nueva tarea a la impresora
        self.tiempoRestante = nuevaTarea.obtenerPaginas() * 60/self.tasaPaginas