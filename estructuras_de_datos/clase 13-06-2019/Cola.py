 #Programa 3.9 programa_3_09.py
# Implementacion de uan cola en python
# asumiendo que el frente está al final de la lista

class Cola:
    def __init__(self):
        self.items =[]

    def estaVacia(self):
        return self.items == []

    def agregar(self, item):
        self.items.insert(0,item)

    def avananzar(self):
        return self.items.pop()

    def tamano(self):
        return len(self.items)

    def inspeccionar(self):
        return self.items[len(self.items)-1]
    
