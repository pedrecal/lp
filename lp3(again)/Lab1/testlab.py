class Fracao:

    def __init__ (self, numerador, denominador=1):
        m = mdc(numerador, denominador)
        self.numerador = numerador / m
        self.denominador = denominador / m

    def __str__ (self):
        return "%d / %d " %(self.numerador, self.denominador)

    def __mul__ (self, other):
        if isinstance(other, int):
            other = Fracao(other)
        return Fracao(self.numerador * other.numerador,self.denominador * ohter.denominador)

    __rmul__  = __mul__

    def __add__ (self, other):

    def mdc(m, n):
        if m % n == 0:
            return n
        else:
            return mdc(n, m % n)
