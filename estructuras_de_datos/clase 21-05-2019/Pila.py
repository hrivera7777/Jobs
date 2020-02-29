# program 3.1 programa_3_01.py
# implementacion de un pila en python
# asumiendo que el tope está al final de la lista

class Pila:
    def __init__(self):
        self.items = []# esto es una lista

    def estaVacia(self):
        return self.items == []

    def incluir(self, item):
        self.items.append(item)# metodo que agreada al final dela lista

    def extraer(self):
        return self.items.pop()

    def inspeccionar(self):
        return self.items[len(self.items)-1]

    def tamano(self):
        return len(self.items)



