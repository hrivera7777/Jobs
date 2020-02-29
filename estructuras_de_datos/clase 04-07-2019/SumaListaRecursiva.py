
def sumaListaRecursiva(l):
    if len(l) == 1:
        return l[0]

    else:
        return l[0] + sumaListaRecursiva(l[1:])


print(sumaListaRecursiva([1,3,5,7,9]))