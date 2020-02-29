#Prueba del programa 3.4: progrma _3_04Prueba.py
# Prueba del programa para solucionar el problema de verificacion de simbolos Balanceados


from SimbolosBalanceados import verificarSimbolos

verificacion = verificarSimbolos("{{(4[89-54][78785+41])}(55)}")


if verificacion:
    print( "los símbolos están balanceados")

else:
    print("los símbolos no están balanceados")

