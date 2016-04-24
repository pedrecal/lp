#from fractions import gcd
def mdc(m, n):
    if m % n == 0:
        return n
    else:
        return mdc(n, m % n)

class Fracao():

    def __init__(self, num, den):
        m = mdc(num, den) #Simplifica a fracao
        self.num = num / m
        self.den = den / m

    def soma(self, fracao2): #Faz a soma da fracao com a ajuda da biblioteca
        num = fracao1.num * fracao2.den + fracao1.den * fracao2.num
        den = fracao1.den * fracao2.den

        fracao3 = Fracao(num,den)
        return fracao3

    def subtracao(self, fracao2): #Faz a soma da fracao com a ajuda da biblioteca
        num = fracao1.num * fracao2.den - fracao1.den * fracao2.num
        den = fracao1.den * fracao2.den

        fracao4 = Fracao(num,den)
        return fracao4

    def produto(self, fracao2):#Da o produto da frac1 e frac2
        num = fracao1.num * fracao2.num
        den = fracao1.den * fracao2.den

        fracao5 = Fracao(num,den)
        return fracao5

    def divisao(self, fracao2):#Da a divisao da frac1 por frac2
        num = fracao1.num * fracao2.den
        den = fracao1.den * fracao2.num

        fracao6 = Fracao(num,den)
        return fracao6

    def toString(self):#Transforma em string
        return str(self.num) + "/" + str(self.den)

    def compara(self, other):#Compara 2 fracs
        diferenca = (self.num * other.den -
            self.den * other.num)
        if diferenca > 0:
            return 1
        elif diferenca < 0:
            return -1
        else:
            return 0

fracao1 = Fracao(2,5)#Atributo
fracao2 = Fracao(1,4)#Atributo

fracao3 = fracao1.soma(fracao2)#Soma
fracao4 = fracao1.subtracao(fracao2)#Subtracao
fracao5 = fracao1.produto(fracao2)#Produto
fracao6 = fracao1.divisao(fracao2)#Divisao
diferenca = fracao1.compara(fracao2)#Compara

print("Fracao 1: %s" % fracao1.toString())
print("Fracao 2: %s" % fracao2.toString())
print("Soma de fracao 1 e 2: %s" % fracao3.toString())
print("Subtracao de fracao 1 e 2: %s" % fracao4.toString())
print("Produto de fracao 1 e 2: %s" % fracao5.toString())
print("Divisao de fracao 1 e 2: %s" % fracao6.toString())
print("Diferenca: %s" % diferenca)
