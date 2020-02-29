print("estructuras")

# programa 1.1 progrma 01_01.py
#progrma de ejemplo de operaciones aritméticas
print("\n")


print(2+3*4)
print((2+3)*4)
print(2**10)
print(6/3)
print(7/3)
print(7//3)
print(7%3)
print(3/6)
print(3//6)
print(3%6)
print(2**100)


# # programa 1.2 progrma 01_02.py
# #Ejemplo de uso de operadores lógicos y relacionales
print("\n")


print (5==10)
print (10>5)
print ((5>=10)and (5<=10))
print(type(4.5))



# # programa 1.3 progrma 01_03.py
# #Caracteristicas de importe del operdaor de repertición
print("\n")


miLista=[1,2,3,4]
A = [miLista]*3
print(A)
miLista[2]=45

print(A)



# # programa 1.4 progrma 01_04.py
# #Caracteristicas de importe del operdaor de repertición
print("\n")


miLista = [1024,3,True,6.5]

miLista.append(False)
print(miLista)

miLista.insert(2,4.5)
print(miLista)

print(miLista.pop())

print(miLista.pop(1))

print(miLista)

miLista.pop(2)
print(miLista)

miLista.sort()#ordena de menor a mayor
print(miLista)

miLista.reverse()
print(miLista)

print(miLista.count(6.5))# cuenta cuantas veces ocurre

print(miLista.index(4.5))

miLista.remove(6.5)
print(miLista)

del miLista[0]
print(miLista)


