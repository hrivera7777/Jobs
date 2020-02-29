#Prueba del programa 3.9 programa_3_09Prueba.py
# Prueba de la implementacion de una cola en Python
# asumiendo que el frente está al final de la lista

from Cola import Cola # importar la clase cola

c = Cola ()

print (c.estaVacia())
c.agregar("perro")
c.agregar(4)
c= Cola()

print(c.estaVacia())
c.agregar(4)
c.agregar("perro")
c.agregar(True)
print(c.tamano())
c.agregar(8.4)

print(c.avananzar())
print(c.avananzar())
print(c.tamano())
