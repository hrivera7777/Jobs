# Programa 1.5: programa 01_05.py
#Ejemplo de un diccionario

capitales ={"Caldas": "Manizales", "Risaralda": "Pereira"}

print(capitales["Caldas"])

capitales["Quindio"]="Armenia"

print(capitales)

capitales["Tolima"]="Ibague"

print(len(capitales))

for k in capitales:
    print(capitales[k], "es la capital de ",k)

#prueba input


unNombre = input("Por favor ingrese su nombre")

print(unNombre)

# Programa 1.6: programa 01_06.py
#Ejemplo de uso de input

unNombre = input("Por favor ingrese su nombre")

print("su nombre en letras mayúsculas es: ", unNombre.upper(), "y tiene una longitud de: ", len(unNombre))


radioCadena = input("por favor ingrese el radio del circulo")

radio = float(radioCadena)

diametro = 2* radio
print(diametro)
