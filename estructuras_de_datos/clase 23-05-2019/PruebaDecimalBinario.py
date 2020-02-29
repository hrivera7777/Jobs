# prueba del programa 3.5: programa_3_05Prueba.py
#Prueba del programa de conversion de decimal a binario

from ConversionDecimalBinaria import dividirPor2

from ConversionABases import conversionBase

numeroDecimal = 182
base = 8

cadenaBinaria = dividirPor2(numeroDecimal)

cadenaBinaria2 = conversionBase(numeroDecimal, base)

print("el número ", numeroDecimal, "en binario es:", cadenaBinaria)


print("el número ", numeroDecimal, "en la base", base , cadenaBinaria2)