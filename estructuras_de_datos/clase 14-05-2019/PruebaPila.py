#Prueba del Programa 3.1 programa_3_01Prueba.py
#Prueba de la implementación de una pila en python
# asumiendo que el tope está al final de la lista

from Pila import Pila

p= Pila()
print(p.estaVacia())
p.incluir(4)
p.incluir("perro")
print(p.inspeccionar())
p.incluir(True)
print(p.tamano())
print(p.estaVacia())
p.incluir(8.4)
print(p.extraer())
print(p.extraer())
print(p.tamano())
