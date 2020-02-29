# Prueba del program 3.13 program 3.13prueba.py
# Programa de sumulacuion de cola de la impresora - prueba de la simulacion

from SimulacionImpresora import *

print("Simulación para un periodo de 360 minutos y una tasa de impresion de 7 paginas por minuto ")

simulacion(3600000,7) # in range(10) para ver 10 pasadas  mil horas tiempo actual

print("Simulación para un periodo de 60 minutos y una tasa de impresion de 10 paginas por minuto ")
simulacion(3600000,10)