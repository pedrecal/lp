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

class MotorDoJogoSP(object):
    import operator
    def SemParar(dif):
        Dificultador.Sort = Dicio[1]#mudar pra variavel que recebe
        expr = Dificultador().Sort()
        exp = [operator.attrgetter('expressao')(x) for x in expr]
        resp = [operator.attrgetter('resposta')(x) for x in expr]
        print exp
        print resp
        #receber resposta
        #verificar resposta
            #se certo printa parabens
            #se errado diz correto
        #printa outra
        #while até FINAL

class MotorDoJogoTresVidas(object):
    def TresVidas(self, dif):
        self.dif = dif
        BaseDificultador(dif)
        #printar expressão
        #receber resposta
        #verificar resposta
            #se certo printa parabens
            #se errado diz correto e contador +1
        #printa outra
        #while até FINAL && while contador != 3
