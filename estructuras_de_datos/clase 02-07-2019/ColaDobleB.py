# Programa 3.12 programa_3_12.py
# Implementacion de uan cola doble en python
#frente a la derecha de la lista

class ColaDoble:
    def __init__(self):
        self.items = []

    def estaVacia(self):
        return self.items == []

    def agregar(self, item, extremo):
        if extremo == "frente":
            self.items.append(item)

        elif extremo == "final":
            self.items.insert(0, item)


    def remover(self, extremo):
        if extremo == "frente":
            return self.items.pop()

        elif extremo == "final":
            return self.items.pop(0)


    def tamano(self):
        return len(self.items)

    def inspeccionar(self, extremo):
        if extremo == "frente":
            return self.items[len(self.items) - 1]
        
        elif extremo == "final":
            return self.items[0]




