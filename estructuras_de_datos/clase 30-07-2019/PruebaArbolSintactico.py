
from ArbolSintactico import *
prueba = '( ( A + ( B * C ) ) + D )'

r = construirArbolSintactico(prueba)

print(r.asignarValorRaiz())
print(r.obtenerHijoIzquierdo().obtenerHijoIzquierdo().obtenerValorRaiz())
print(r.obtenerHijoDerecho())