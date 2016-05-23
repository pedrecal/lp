from carro import Carro
from configurador import Configurador

carro1 = Carro()
carro1.instalaOpcional("ar_condicionado")

carro2 = Carro()
carro2.instalaOpcional("ar_condicionado")
carro2.instalaOpcional("vidro_eletrico")
carro2.instalaOpcional("direcao_hidraulica")
carro2.instalaOpcional("sensor_estacionamento")
carro2.instalaOpcional("teto_solar")
carro2.instalaOpcional("roda_liga")

carro3 = Carro()
carro3.instalaOpcional("ar_condicionado")
carro3.instalaOpcional("sensor_estacionamento")
carro3.instalaOpcional("direcao_hidraulica")

carro4 = Carro()
carro4.instalaOpcional("ar_condicionado")
carro4.instalaOpcional("vidro_eletrico")
carro4.instalaOpcional("sensor_estacionamento")

carro5 = Carro()
carro5.instalaOpcional("ar_condicionado")
carro1.instalaOpcional("direcao_hidraulica")

configurador = Configurador()
configurador.add_carro(carro1)
configurador.add_carro(carro2)
configurador.add_carro(carro3)
configurador.add_carro(carro4)
configurador.add_carro(carro5)

print('total R$: ' + str(configurador.total()))
