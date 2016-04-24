from fractions import gcd
class Fracao():

    def __init__(self, num, den):
        m = gcd(num, den)
        self.num = num / m
        self.den = den / m

    def soma(self, frac):
        self.num = self.num * frac.den + self.den * frac.num
        self.den = self.den * frac.den

        FracSum = Fracao(self.num, self.den)
        return FracSum

    def subtracao(self, frac):
        self.num = self.num * frac.den - self.den * frac.num
        self.den = self.den * frac.den

        FracSub = Fracao(self.num, self.den)
        return FracSub

    def produto(self, frac):
        self.num = self.num * frac.num
        self.den = self.den * frac.den

        FracProd = Fracao(self.num, self.den)
        return FracProd

    def divisao(self, frac):
        self.num = self.num * frac.den
        self.den = self.den * frac.num

        FracDiv = Fracao(self.num, self.den)
        return FracDiv

    def toString(self):
        return str(self.num) + "/" + str(self.den)

    def compara(self, frac):
        diff = (self.num * frac.den - self.den * frac.num)
        if diff > 0:
            return 1
        elif diff < 0:
            return -1
        else:
            return 0

fracao1 = Fracao(2, 5)#Atributo
fracao2 = Fracao(1, 4)#Atributo
print("Fracao 1: %s" % fracao1.toString())
print("Fracao 2: %s" % fracao2.toString())

fracao3 = fracao1.soma(fracao2)#Soma
fracao4 = fracao1.subtracao(fracao2)#Subtracao
fracao5 = fracao1.produto(fracao2)#Produto
fracao6 = fracao1.divisao(fracao2)#Divisao
diferenca = fracao1.compara(fracao2)#Compara

print("Soma de fracao 1 e 2: %s" % fracao3.toString())
print("Subtracao de fracao 1 e 2: %s" % fracao4.toString())
print("Produto de fracao 1 e 2: %s" % fracao5.toString())
print("Divisao de fracao 1 e 2: %s" % fracao6.toString())
print("Diferenca: %s" % diferenca)
