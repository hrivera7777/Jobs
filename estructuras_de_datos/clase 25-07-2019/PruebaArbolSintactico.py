
from ArbolSintactico import *
r = construirArbolSintactico('( ( A + ( B * C ) ) + D )')

print(r.asignarValorRaiz())
print(r.obtenerHijoIzquierdo().obtenerHijoIzquierdo().obtenerValorRaiz())
print(r.obtenerHijoDerecho())