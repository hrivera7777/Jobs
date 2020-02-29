# program 3.1 programa_3_01.py
# conversion infija a sufija
# asumiendo que el tope está al final de la lista

from ConversionInfixSufix import infija_a_sufija

entrada = "A * B - C * D"

print("resultado es: ", infija_a_sufija(entrada))

entrada3 = "( A + B ) * ( C + D )"

print("resultado es: ", infija_a_sufija(entrada3))

entrada2 = "( A + B ) * C - ( D - E ) * ( F + G )"

print("resultado es: ", infija_a_sufija(entrada2))

entrada4 = "( 22 + 5 ) * ( 5 + 6 )"

print("resultado es: ", infija_a_sufija(entrada4))

entrada5 = "A + A * C + C + D * D * A"

print("resultado es: ", infija_a_sufija(entrada5))

entrada6 = "A + C + D * A * C + D * B / A - B / C"

print("resultado es: ", infija_a_sufija(entrada6))