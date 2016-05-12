class Carro():

    def __init__(self, ar_condicionado):
        self.ar_condicionado = ar_condicionado

    def instalaOpcional(self, ar_condicionado):
        if self.ar_condicionado == 'ar_condicionado': #1500
            ar_condicionado = 1
            contabilizaAcessorio()
        elif self.acessorios == 'vidro_eletrico': #600
            vidro_eletrico = 1
            contabilizaAcessorio()
        elif self.acessorios == 'direcao_hidraulica': #1150
            direcao_hidraulica = 1
            contabilizaAcessorio()
        elif self.acessorios == 'sensor_estacionamento': #300
            sensor_estacionamento = 1
            contabilizaAcessorio()
        elif self.acessorios == 'teto_solar': #4000
            teto_solar = 1
            contabilizaAcessorio()
        elif self.acessorios == 'roda_liga': #2850
            roda_liga = 1
            contabilizaAcessorio()
        return

    @staticmethod
    def contabilizaAcessorio(self):
        num_acessorio += 1
        return None

    def getValor(self):
        return 2900 + (ar_condicionado * 1500) + (vidro_eletrico * 600) + (direcao_hidraulica * 1150) + (sensor_estacionamento * 300) + (teto_solar * 4000) + (roda_liga * 2850)
