#programa 3.13 programa3_05 py. progrma para el problema de las torres de Hanoi


# funcion para imprir movimientos

def moverDisco(delDisco,alDisco):
    print("Mover disco de %s a %s" %(delDisco,alDisco))

#funcion recursiva:
def moverTorre(altura,delPoste,alPoste,conPoste): # delposte es origen, alposte es destino, conposte es intermedio
    if altura >= 1:
        moverTorre(altura-1,delPoste,conPoste,alPoste)
        moverDisco(delPoste,alPoste)
        moverTorre(altura-1,conPoste,alPoste,delPoste)


#prueba:

moverTorre(5,"origen", "destino", "intermedio")
