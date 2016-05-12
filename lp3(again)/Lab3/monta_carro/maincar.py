from carro import Carro
from configurador import Configurador

carro1 = Carro("ar_condicionado")
carro1.instalaOpcional("ar_condicionado")

print ("%s" % carro1.getValor())
