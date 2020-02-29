# Programa 3.13 programa_3_13.py
# programa de verificacion de palindromos
#frente a la derecha de la lista


from ColaDoble import * # Importar la clase ColaDoble
import string

def verificarPalindromo(cadena):# la funcion recibe una cadena
    colaDobleCaracteres = ColaDoble() # creamos una cola doble vacia

    for caracter in cadena: # iteramos sovre los caracteres de la cadena enviada
        if caracter != " ":
            colaDobleCaracteres.agregarFinal(caracter.lower())# Agregarkis a la cola doble


    aunIguales = True # suposicion unicial (asumiremos inicialmente que si es palindromo)

    while colaDobleCaracteres.tamano() > 1 and aunIguales: # criterios para continuar
        primero = colaDobleCaracteres.removerFrente() # extraer del frente
        ultimo = colaDobleCaracteres.removerFinal() # extraer del final

        if primero != ultimo: # comparar y sin son diferentes
            aunIguales = False #falsear la bandera

    return aunIguales # devolvemos el valor de la bandera. si es True entonces es palindromo