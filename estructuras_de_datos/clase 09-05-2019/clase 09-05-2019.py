def raizCuadrada(n):
    raiz = n/2 # la suposucuon inicial será 1/2 de n

    for k in range (20):
        raiz = (1/2)*(raiz + (n/raiz))

    return raiz


print (raizCuadrada(2))