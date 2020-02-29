# prueba del programa 3.6: programa_3_06Prueba.py
#Prueba del programa de conversion de decimal a cualquier base (max base 60)

from ConversionABases import conversionBase

numeroDecimal = 2019
#base = 8

cadenaOctal = conversionBase(numeroDecimal, 8)

cadenaDoce = conversionBase(numeroDecimal, 12)

cadenaHexadecimal = conversionBase(numeroDecimal, 60)


print("el número ", numeroDecimal, "en la base", 8 , cadenaOctal)

print("el número ", numeroDecimal, "en la base", 12 , cadenaDoce)

print("el número ", numeroDecimal, "en la base", 16 , cadenaHexadecimal)