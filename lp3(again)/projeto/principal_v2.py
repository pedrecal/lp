# -*- coding: utf-8 -*-
# ! /bin/env python
import random
from abc import ABCMeta, abstractmethod


def cls():
    os.system(['clear', 'cls'][os.name == 'nt'])

def Opcoes():#Menu
    print '--------------JOGO DAS OPERAÇÕES MATEMÁTICAS-----------------'
    print 'Pressione As Teclas Para As Opções'
    print '1 - Começar Jogo'
    try:
        opcao = int(raw_input('Escolha Uma Opção: '))
        return opcao
        pass
    except Exception, e:
        print u'Opção Inválida'

class Expressao(object):

    def __init__(self, nivel, tipo, expressao, resposta):
        self.nivel = nivel
        self.tipo = tipo
        self.expressao = expressao
        self.resposta = resposta

class FonteDeExpressoes(Expressao):
    import csv

    def lista (self, nivel, tipo, expressao, resposta):
        expressoes = []
        Expressao.nivel = nivel
        Expressao.tipo = tipo
        Expressao.expressao = expressao
        Expressao.resposta = resposta

        with open('exp.txt') as f:
            for line in f:
                row = line.split('\t')
                exp = Expressao(row[0], row[1], row[2], row[3])
                expressoes.append(exp)
        return expressoes

class Dificultador(metaclass=ABCMeta):
    #classe abstrata que vai ser super classe de DificultadorNivel e DificultadorTipo
    @abstractmethod
    def Sort(self):
        pass

class DificultadorNivel(Dificultador, FonteDeExpressoes):
    def Sort(self,expressoes):
        FonteDeExpressoes.expressoes = expressoes


class MotorDoJogo():
    #Essa classe deve deve dar os tipos de jogo, fase, treino, morte súbita




#################SELEÇÃO DO MENU, FICAR NO FINAL#################
while True:
    opcao = Opcoes()
    if opcao == 1:
        #FUNC DE INICIAR JOGO
    pass
