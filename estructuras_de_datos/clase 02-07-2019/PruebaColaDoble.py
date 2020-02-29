#Prueba del programa 3.12: programa 3_12.py
# prueba del program de implementacion de una cola doblemente terminada en python

from ColaDoble import * # importar la clase cola Doble

d= ColaDoble()

print(d.estaVacia())

d.agregarFinal(4)
d.agregarFinal("perro")
d.agregarFrente("gato")
d.agregarFrente(True)

print(d.tamano())
print(d.estaVacia())
d.agregarFinal(8.4)

print(d.removerFinal())

print(d.removerFrente())
print(d.tamano())

print(d.inspeccionarFinal())
print(d.inspeccionarFrente())
