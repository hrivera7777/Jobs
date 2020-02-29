#Prueba del programa 3.3: progrma _3_03Prueba.py
# Prueba del programa para la veriudicaion de parentesis

from ParentesisBalanceados import verificarParentesis

verificacion = verificarParentesis("(2+1)")


if verificacion:
    print( "los paréntesis están balanceados")

else:
    print("los paréntesis no están balanceados")