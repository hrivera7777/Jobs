cadenaConversion = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"

def conversionRecursiva(n,base):
    if n < base: # caso base
        return cadenaConversion[n]

    else:
        return conversionRecursiva(n//base,base) + cadenaConversion[n%base]

