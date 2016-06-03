class Transacao:

    def __init__(self, val):
        self.val = val

    def getTotalTransacao():
        val_tot = self.val_tot
        return val_tot

class TransacaoParcelada(Transacao):

    def __init__(self, val, parc, juros):
        Transacao.val = val
        self.parc = parc
        self.juros = juros

    def getTotalTransacao(self):
        val_tot = (Transacao.val * ((1 + self.juros)**self.parc))
        return val_tot

class TransacaoDinheiro(Transacao):

    def __init__(self, val, desc):
        Transacao.val = val
        self.desc = desc / 100

    def getTotalTransacao(self):
        val_tot = (Transacao.val - (self.desc * Transacao.val))
        return val_tot
