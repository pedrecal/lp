# -*- coding: utf-8 -*-
# ! /bin/env python
import random
import operator
from abc import ABCMeta, abstractmethod

def cls():
    os.system(['clear', 'cls'][os.name == 'nt'])

class Expressao(object):

    def __init__(self, nivel, tipo, expressao, resposta):
        self.nivel = nivel
        self.tipo = tipo
        self.expressao = expressao
        self.resposta = resposta

    def __repr__(self):
        return self.nivel + ", " + self.tipo + ", " + self.expressao + ", " + self.resposta

class FonteDeExpressoes(object):
    import csv
    def lista (self):
        expressoes = []
        with open('exp.txt') as f:
            for line in f:
                line = line.strip()
                line = line.split('\t')
                exp = Expressao(line[0], line[1], line[2], line[3])
                expressoes.append(exp)
        return expressoes

class Dificultador(object):
    #classe abstrata que vai ser super classe de DificultadorNivel e DificultadorTipo
    def Sort(self):
        pass

def DificultadorNivel(self):#Faz um sort da lista de expressoes em niveis
    expnivel = sorted(FonteDeExpressoes().lista(), key=lambda x: x.nivel)#arrumar uma forma de retornar a lista com somente o nivel selecionado
    return expnivel

def DificultadorTipo(self):
    exptipo = sorted(FonteDeExpressoes().lista(), key=lambda x: x.tipo)
    return exptipo#Arrumar uma forma de retornar a lista com somente o tipo selecionado

Dicio = {1: DificultadorNivel, 2: DificultadorTipo}

class MotorDoJogo(object):
    def MandaExp(self):
        pass
    def Resposta(self):
        pass
    def Erro(self):
        pass

class MotorDoJogoSP(object):
    import operator
    def MandaExp(dif):
        Dificultador.Sort = Dicio[dif]
        expr = Dificultador().Sort()
        exp = [operator.attrgetter('expressao')(x) for x in expr]


class MotorDoJogoTresVidas(object):
    def MandaExp(self, dif):
        self.dif = dif
        BaseDificultador(dif)
        #printar expressão
        #receber resposta
        #verificar resposta
            #se certo printa parabens
            #se errado diz correto e contador +1
        #printa outra
        #while até FINAL && while contador != 3

class Main(object):
    def Main():
        print("Bem vindo ao jogo de expressões matemáticas!")
        print("1 - Sem Parar. Jogue até cansar! Caso queira sair, aperte Ctrl + D")
        print("2 - Três Vidas. Errou três vezes, já era vacilão!")
        print ''
        try:
            modo = int(raw_input("Selecione um modo: "))
            return modo
            pass
        except Exception, e:
            print u'Opção Inválida'
        cls()
        if modo == 1:
