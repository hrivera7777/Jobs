#progrma 1.7: progrma01_07.py
#Ejemplo de uso de la estructura de control for

listaPalabras = ["gato", "perro", "conejo"]
listaLetras = []

for unaPalabra in listaPalabras:
    for unaLetra in unaPalabra:
        listaLetras.append(unaLetra)


print(listaLetras)
