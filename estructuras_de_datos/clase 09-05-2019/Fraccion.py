def mcd(m,n):
    while m % n != 0:
        mViejo = m
        nViejo = n
        m = nViejo
        n = mViejo % nViejo
    return n




class Fraccion:
    #Aquí se escriben los métodos

    def __init__(self, arriba, abajo):

        self.num = arriba
        self.den = abajo

    def mostrar(self):
        print (self.num, "/",self.den)

    def __str__(self):
        return str(self.num)+"/"+str(self.den)

    def __add__(self, otraFaccion):
        #(ad+cb)/bd
        nuevoNum = self.num*otraFaccion.den + self.den * otraFaccion.num

        nuevoDen = self.den * otraFaccion.den
        comun = mcd(nuevoNum , nuevoDen)

        return Fraccion(nuevoNum//comun, nuevoDen//comun)

    def __sub__(self, otraFaccion):
        # (ad+cb)/bd
        nuevoNum = self.num * otraFaccion.den - self.den * otraFaccion.num

        nuevoDen = self.den * otraFaccion.den
        comun = mcd(nuevoNum, nuevoDen)

        return Fraccion(nuevoNum // comun, nuevoDen // comun)

    def __mul__(self, otraFaccion):

        nuevoNum = self.num * otraFaccion.num

        nuevoDen = self.den * otraFaccion.den
        comun = mcd(nuevoNum, nuevoDen)

        return Fraccion(nuevoNum // comun, nuevoDen // comun)


    def __truediv__(self, otraFaccion):

        nuevoNum = self.num * otraFaccion.den

        nuevoDen = self.den * otraFaccion.num
        comun = mcd(nuevoNum, nuevoDen)

        return Fraccion(nuevoNum // comun, nuevoDen // comun)

    def __eq__(self, otraFaccion):
        if self.num == otraFaccion.num and self.den == otraFaccion.den:
            return True
        else:
            return False







miFraccion = Fraccion(3,5)

print(miFraccion)

#miFraccion.mostrar()

#print("comi", miFraccion, "de la pizza")

f1 = Fraccion(1,4)
f2 = Fraccion(1,2)

print(f1+f2)

print(f1-f2)

print(f1*f2)

print(f1/f2)


f3 = Fraccion(3,5)
f4 = Fraccion(3,5)

print(f3 == f4)

