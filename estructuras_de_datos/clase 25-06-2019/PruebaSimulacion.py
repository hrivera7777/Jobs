# Prueba del program 3.13 program 3.13prueba.py
# Programa de sumulacuion de cola de la impresora - prueba de la simulacion

from SimulacionImpresora import *

print("Simulación para un preiod de 60 minutos y una tasa de impresion de 5 paginas por minuto ")
for i in range(10):
    simulacion(3600,7)

print("Simulación para un preiod de 60 minutos y una tasa de impresion de 10 paginas por minuto ")
for i in range(10):
    simulacion(3600,10)