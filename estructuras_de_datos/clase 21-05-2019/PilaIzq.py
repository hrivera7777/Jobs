# program 3.1 programa_3_01.py
# implementacion alternativa de una pila en python
# asumiendo que el tope está al principio de la lista
#Nota. comparar con al implementacion en el programa 3.1

class Pila

    def __init__(self):
        self.items = []

    def estaVacia(self):
        return self.items ==[]

    def incluir(self, item):
        self.items.inset(0,item)


    def extraer(self):
        return self.items.pop(0)

    def inspeccionar(self):
        return self.items[0]

    def tamano(self):
        return len(self.items)


