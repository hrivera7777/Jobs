#Programa simulacionde la cola de la impresora  - simulacion principal

from Cola import * # importa la clase Cola
from Impresora import * # Importa la clase Impresora
from Tarea import * # Importa la clase Tarea

import random

def simulacion(numeroSegundos, paginasPorMinuto):
    impresoraLaboratorio = Impresora(paginasPorMinuto)
    colaImpresion = Cola()# cola de trabajos de la impresora
    tiemposEspera = []# lista para tiempos de espera
    totalPaginas = []
    trabajosPorPagina  = [0]*20


    for segundoActual in range(numeroSegundos): # ciclo de sumulacion
        if nuevaTareaImpresion():# funcion auxiliar para lanzar el dado 180 caras
            tarea = Tarea(segundoActual) # crear la tarea
            colaImpresion.agregar(tarea) # agregar la tarea a la cola
            totalPaginas.append(tarea.obtenerPaginas()) # primera modificacion para el promedio de paginas

            # conteo para la cantidad de trabajos por pagina.
            if tarea.obtenerPaginas() == 1:
                trabajosPorPagina[0] += 1

            elif tarea.obtenerPaginas() == 2:
                trabajosPorPagina[1] += 1

            elif tarea.obtenerPaginas() == 3:
                trabajosPorPagina[2] += 1

            elif tarea.obtenerPaginas() == 4:
                trabajosPorPagina[3] += 1

            elif tarea.obtenerPaginas() == 5:
                trabajosPorPagina[4] += 1

            elif tarea.obtenerPaginas() == 6:
                trabajosPorPagina[5] += 1

            elif tarea.obtenerPaginas() == 7:
                trabajosPorPagina[6] += 1

            elif tarea.obtenerPaginas() == 8:
                trabajosPorPagina[7] += 1

            elif tarea.obtenerPaginas() == 9:
                trabajosPorPagina[8] += 1

            elif tarea.obtenerPaginas() == 10:
                trabajosPorPagina[9] += 1

            elif tarea.obtenerPaginas() == 11:
                trabajosPorPagina[10] += 1

            elif tarea.obtenerPaginas() == 12:
                trabajosPorPagina[11] += 1

            elif tarea.obtenerPaginas() == 13:
                trabajosPorPagina[12] += 1

            elif tarea.obtenerPaginas() == 14:
                trabajosPorPagina[13] += 1

            elif tarea.obtenerPaginas() == 15:
                trabajosPorPagina[14] += 1

            elif tarea.obtenerPaginas() == 16:
                trabajosPorPagina[15] += 1

            elif tarea.obtenerPaginas() == 17:
                trabajosPorPagina[16] += 1

            elif tarea.obtenerPaginas() == 18:
                trabajosPorPagina[17] += 1

            elif tarea.obtenerPaginas() == 19:
                trabajosPorPagina[18] += 1

            else:
                trabajosPorPagina[19] += 1

            # totaltrabajosPorPagina =trabajosPorPagina(tarea.obtenerPaginas())#






        if(not impresoraLaboratorio.ocupada()) and (not colaImpresion.estaVacia()):
            tareaSiguiente = colaImpresion.avananzar()
            tiemposEspera.append(tareaSiguiente.tiempoEspera(segundoActual))
            impresoraLaboratorio.iniciarNueva(tareaSiguiente)

        impresoraLaboratorio.tictac() # conteo regresivo de ocupacion

    esperaPromedio = sum(tiemposEspera)/float(len(tiemposEspera))
    print("Tiempo de espera promedio%6.2f segundos"%(esperaPromedio))
    print("Teras restantes %3d" %(colaImpresion.tamano()))

    suma = 0 # suma para el total de paginas
    for i in totalPaginas:

        suma += totalPaginas[i]
        prom = suma / len(totalPaginas)
    #print("suma",suma)
    paginas = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20] # lista para mostrar las paginas de los trabajos

    print("número promedio de páginas por trabajo impreso ", prom)
    print("Número de trabajos por número de páginas", paginas, ": ", trabajosPorPagina)
    print()
    print()

def nuevaTareaImpresion(): # simula un dado de 180 caras
    numero = random.randrange(1,181) # genera el numero aleatorio
    if numero == 180: # si sale 180, se ha creado una tarea
        return True
    else:   # no salio 180, por tanto no hay nueva tarea creada
        return False



def trabajosPorPagina(paginas): # funcion auxiliar no necesaria
    trabajosPorPagina = [0]*20

    if tarea.obtenerPaginas() == 1:
        trabajosPorPagina[0] += 1

    elif tarea.obtenerPaginas() == 2:
        trabajosPorPagina[1] += 1

    elif tarea.obtenerPaginas() == 3:
        trabajosPorPagina[2] += 1

    elif tarea.obtenerPaginas() == 4:
        trabajosPorPagina[3] += 1

    elif tarea.obtenerPaginas() == 5:
        trabajosPorPagina[4] += 1

    elif tarea.obtenerPaginas() == 6:
        trabajosPorPagina[5] += 1

    elif tarea.obtenerPaginas() == 7:
        trabajosPorPagina[6] += 1

    elif tarea.obtenerPaginas() == 8:
        trabajosPorPagina[7] += 1

    elif tarea.obtenerPaginas() == 9:
        trabajosPorPagina[8] += 1

    elif tarea.obtenerPaginas() == 10:
        trabajosPorPagina[9] += 1

    elif tarea.obtenerPaginas() == 11:
        trabajosPorPagina[10] += 1

    elif tarea.obtenerPaginas() == 12:
        trabajosPorPagina[11] += 1

    elif tarea.obtenerPaginas() == 13:
        trabajosPorPagina[12] += 1

    elif tarea.obtenerPaginas() == 14:
        trabajosPorPagina[13] += 1

    elif tarea.obtenerPaginas() == 15:
        trabajosPorPagina[14] += 1

    elif tarea.obtenerPaginas() == 16:
        trabajosPorPagina[15] += 1

    elif tarea.obtenerPaginas() == 17:
        trabajosPorPagina[16] += 1

    elif tarea.obtenerPaginas() == 18:
        trabajosPorPagina[17] += 1

    elif tarea.obtenerPaginas() == 19:
        trabajosPorPagina[19] += 1

    else:
        trabajosPorPagina[20] += 1

    return trabajosPorPagina