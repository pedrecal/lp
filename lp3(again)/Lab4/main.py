from transacao import TransacaoParcelada
from transacao import TransacaoDinheiro
from transacao import Transacao

desc = TransacaoDinheiro(100, 50)
print(desc.getTotalTransacao())

parc = TransacaoParcelada(100, 2, 10)
print(parc.getTotalTransacao())
