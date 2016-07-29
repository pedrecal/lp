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

class FonteDeExpressoes(object):
    import csv
    def lista (self):
        expressoes = []
        with open('exp.txt') as f:
            for line in f:
                row = line.split('\t')
                exp = Expressao(row[0], row[1], row[2], row[3])
                expressoes.append(exp)
        return expressoes

class Dificultador(object):
    #classe abstrata que vai ser super classe de DificultadorNivel e DificultadorTipo
    def Sort(self):
        pass

def DificultadorNivel(self):#Faz um sort da lista de expressoes em niveis
    expressoes = FonteDeExpressoes().lista()
    expnivel = sorted(expressoes, key=lambda x: x.nivel)
    return expnivel

def DificultadorTipo(self):#Faz um sort da lista de expressoes em tipo
    expressoes = FonteDeExpressoes().lista()
    exptipo = sorted(expressoes, key=lambda x: x.tipo)
    return exptipo

class BaseDificultador(Dificultador):
    def Sobrescreve():



dif = {1: DificultadorNivel, 2: DificultadorTipo}
Dificultador.Sort =

d = Dificultador()
e = d.Sort()

print FonteDeExpressoes().lista()
