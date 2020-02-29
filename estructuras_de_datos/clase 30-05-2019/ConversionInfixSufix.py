# program 3.1 programa_3_01.py
# conversion infija a sufija
# asumiendo que el tope está al final de la lista

from Pila import Pila # import clase pila del modulo programa 3_01
import string

def infija_a_sufija(expresionInfija):
    precedencia = {}

    precedencia["*"] = 3
    precedencia["/"] = 3
    precedencia["+"] = 2
    precedencia["-"] = 2
    precedencia["("] = 1
    pilaOperadores = Pila()
    listaSufija =[]
    listaSimbolos = expresionInfija.split()
    #print(listaSimbolos) # solo para mostrar que tiene el split (la lista resultante)
    for simbolo in listaSimbolos:

        if simbolo in "+-*/":
            while (not pilaOperadores.estaVacia()) and (precedencia[pilaOperadores.inspeccionar()]) >= precedencia[simbolo]:
                listaSufija.append(pilaOperadores.extraer())
            pilaOperadores.incluir(simbolo)

        #if simbolo in string.digits: # para letras mayusculas :  string.ascii_uppercase:
        #   listaSufija.append(simbolo)

        elif simbolo == "(":
            pilaOperadores.incluir(simbolo)

        elif simbolo == ")":
            simboloTope = pilaOperadores.extraer()
            while simboloTope != "(":
                listaSufija.append(simboloTope)
                simboloTope = pilaOperadores.extraer()
        else:
            listaSufija.append(simbolo)

        #else:
         #   while(not pilaOperadores.estaVacia()) and (precedencia[pilaOperadores.inspeccionar()]) >= precedencia[simbolo]:
          #      listaSufija.append(pilaOperadores.extraer())
           # pilaOperadores.incluir(simbolo)
    while not pilaOperadores.estaVacia():
        listaSufija.append(pilaOperadores.extraer())

    return " ".join(listaSufija)
