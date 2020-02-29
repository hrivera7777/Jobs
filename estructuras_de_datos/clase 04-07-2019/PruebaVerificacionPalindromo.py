# Programa 3.14 programa_3_14.py
# programa prueba de  verificacion de palindromos
#frente a la derecha de la lista


from VerificacionPalindromo import *

cadena = "reconocer"

verificar = verificarPalindromo(cadena)

if verificar:
    print("La cadena", cadena, "es palíndroma")
else:
    print("la cadena", cadena, " no es palíndroma")





