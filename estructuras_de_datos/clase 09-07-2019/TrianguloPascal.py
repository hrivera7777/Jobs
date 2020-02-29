from Combinatorio import *

def trianguloPascal(n):# n = al número de niveles
    if n  <= 1:
        print(combibinatorio(0,0))


    else:
        print(trianguloPascal(combibinatorio(n,n-1)))

        #print(combibinatorio(), combibinatorio(n,n-1), 1)