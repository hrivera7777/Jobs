# Programa 3.12 programa_3_12.py
# Implementacion de uan cola doble en python
#frente a la derecha de la lista

class ColaDoble:
    def __init__(self):
        self.items = []

    def estaVacia(self):
        return self.items == []

    def agregarFrente(self, item):
        self.items.append(item)

    def agregarFinal(self, item):
        self.items.insert(0, item)

    def removerFrente(self):
        return self.items.pop()

    def removerFinal(self):
        return self.items.pop(0)

    def tamano(self):
        return len(self.items)

    def inspeccionarFrente(self):
        return self.items[len(self.items) - 1]

    def inspeccionarFinal(self):
        return self.items[0]
