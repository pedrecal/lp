class Carro:
    contabiliza = 0 #Toda variavel a nivel de classe e estatica em python

    def __init__(self, contabiliza=0, ar_condicionado = 0, vidro_eletrico = 0, direcao_hidraulica = 0, sensor_estacionamento = 0, teto_solar = 0, roda_liga = 0):
        self.contabiliza = contabiliza
        self.ar_condicionado = ar_condicionado
        self.vidro_eletrico = vidro_eletrico
        self.direcao_hidraulica = direcao_hidraulica
        self.sensor_estacionamento = sensor_estacionamento
        self.teto_solar = teto_solar
        self.roda_liga = roda_liga

    @staticmethod
    def contabilizaAcessorio():
        Carro.contabiliza += 1
        return Carro.contabiliza -1

    def instalaOpcional(self, recebe):
        acessorios = ["ar_condicionado" , "vidro_eletrico", "direcao_hidraulica", "sensor_estacionamento", "teto_solar", "roda_liga"]
        if recebe == acessorios[0]:
            self.ar_condicionado = 1
            self.contabilizaAcessorio()
        elif recebe == acessorios[1]:
            self.vidro_eletrico = 1
            self.contabilizaAcessorio()
        elif recebe == acessorios[2]:
            self.direcao_hidraulica = 1
            self.contabilizaAcessorio()
        elif recebe == acessorios[3]:
            self.sensor_estacionamento = 1
            self.contabilizaAcessorio()
        elif recebe == acessorios[4]:
            self.teto_solar = 1
            self.contabilizaAcessorio()
        elif recebe == acessorios[5]:
            self.roda_liga = 1
            self.contabilizaAcessorio()
        return None

    def getValor(self):
        return 29000 + (1500 * self.ar_condicionado) + (600 * self.direcao_hidraulica) + (1150 * self.teto_solar) + (4000 * self.teto_solar) + (2850 * self.roda_liga) + (300 * self.sensor_estacionamento)
