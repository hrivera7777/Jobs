

def combibinatorio(n,r):

    if n > 0 and r < n :
        if n < 1 and r < 0:
            return 1
        else:
            #(n * (n - 1)) / ((r * (r - 1)) * (n - r) * (n - r - 1))

            t = Factorial(n)
            q = Factorial(r) * Factorial(n-r)


            return  t/q
    else:
        return 1

def Factorial (n):
    if n < 1:
        return 1
    else:
        return n * Factorial((n-1))
