from carro import Carro
class Configurador:

    def __init__(self, lista_carros = []):
        self.lista_carros = lista_carros

    def add_carro(self, carro):
        self.lista_carros.append(carro)

    def total(self):
        valores = [carro.getValor() for carro in self.lista_carros]
        return sum(valores)

    def total_acessorios(self):
        acessorios = [carro.contabiliza for carro in self.lista_carros]
        return sum(acessorios)
