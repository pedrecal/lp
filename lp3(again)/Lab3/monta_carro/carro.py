class Carro():

    def __init_(self, ar_condicionado, vidro_eletrico, direcao_hidraulica, sensor_estacionamento, sensor_estacionamento, teto_solar, roda_liga):
        self.ar_condicionado = ar_condicionado
        self.vidro_eletrico = vidro_eletrico
        self.direcao_hidraulica = direcao_hidraulica
        self.sensor_estacionamento = sensor_estacionamento
        self.teto_solar = teto_solar
        self.roda_liga = roda_liga

    def instalaOpcional(self, acessorios):
        if acessorios == 'ar_condicionado': #1500
            self.ar_condicionado = 1
        elif acessorios == 'vidro_eletrico': #600
            self.vidro_eletrico = 1
        elif acessorios == 'direcao_hidraulica': #1150
            self.direcao_hidraulica = 1
        elif acessorios == 'sensor_estacionamento': #300
            self.sensor_estacionamento = 1
        elif acessorios == 'teto_solar': #4000
            self.teto_solar = 1
        elif acessorios == 'roda_liga': #2850
            self.roda_liga = 1

    @staticmethod
    def contabilizaAcessorio(self):




    def getValor(self):
        return 2900 + (self.ar_condicionado * 1500) + (self.vidro_eletrico * 600) + (self.direcao_hidraulica * 1150) + (self.sensor_estacionamento * 300) + (self.teto_solar * 4000) + (self.roda_liga * 2850)
