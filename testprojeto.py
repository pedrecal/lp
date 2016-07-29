# -*- coding: utf-8 -*-
# ! /bin/env python
import random
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
                row = line.split('\t')
                exp = Expressao(row[0], row[1], row[2], row[3])
                expressoes.append(exp)
        #print expressoes
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

dif = {1: DificultadorNivel, 2: DificultadorTipo}

Dificultador.Sort = DificultadorNivel

expt = Dificultador().Sort()
print expt
