class Paciente():

    def __init__(self, nome, sexo, altura, peso, idade, calorias):
        self.nome = nome
        self.sexo = sexo
        self.altura = altura
        self.peso = peso
        self.idade = idade
        self. calorias = calorias

    def calculaKcaloria(self):
        if(self.sexo == 'm'):
            res = 66.437 + (5.0033 * self.altura) + (13.7516 * self.peso) - (6.755 * self.idade)
            return res
        else:
            res = (655.0955) + (1.8496 * self.altura) + (9.5634 * self.peso) - (4.6756 * self.idade)
            return res

    def consomeKcaloria(self, consKcal):
        totalDia = Paciente.calculaKcaloria(self)
        if (totalDia >= (consKcal + self.calorias)):
            self.calorias = consKcal + self.calorias
            msg = ('Calorias consumidas com sucesso! Faltam %s' % (totalDia - self.calorias))
        else:
            msg = ("Nao e permitido consumir essas calorias! %s calorias diarias consumidas de um total de %s" % (self.calorias, totalDia))
        return msg
