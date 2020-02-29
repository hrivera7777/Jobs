from ArbolSintactico import *
from EvaluacionArbolSintactico import *


prueba = '( 3 + ( 4 * 5 ) )'
arbolSintac = construirArbolSintactico(prueba)

print(evaluar(arbolSintac))
