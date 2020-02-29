# Programa 3.9 programa_3_09.py
# Implementacion de uan cola en python
# asumiendo que el frente está al inicio de la lista

class Cola:
    def __init__(self):
        self.items = []

    def estaVacia(self):
        return self.items == []

    def agregar(self, item):
        self.items.append(item)

    def avananzar(self):
        return self.items.pop(0)

    def tamano(self):
        return len(self.items)

    def inspeccionar(self):
        return self.items[0]

