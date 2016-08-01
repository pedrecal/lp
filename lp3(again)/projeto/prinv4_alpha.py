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
    def Encerra(self):
        pass

class MotorDoJogoSP(object):
    import operator
    def MandaExp(self, dif):
        Dificultador.Sort = Dicio[dif]
        expr = Dificultador().Sort()
        explist = [operator.attrgetter('expressao')(x) for x in expr]
        resplist = [operator.attrgetter('resposta')(x) for x in expr]
        for e in explist:
            yield e

    def Resposta(self, resp, dif, index):
        Dificultador.Sort = Dicio[dif]
        expr = Dificultador().Sort()
        explist = [operator.attrgetter('expressao')(x) for x in expr]
        resplist = [operator.attrgetter('resposta')(x) for x in expr]
        flag = True
        if resp != resplist[index]:
            flag = False
            print('Burro')
            return index
        else:
            return("Boa!")

    def __next__(self):
        return self.next()

    def __repr__(self):
        return self.self

class MotorDoJogoTresVidas(object):
    import operator
    def MandaExp(self, dif):
        Dificultador.Sort = Dicio[dif]
        expr = Dificultador().Sort()
        explist = [operator.attrgetter('expressao')(x) for x in expr]
        resplist = [operator.attrgetter('resposta')(x) for x in expr]
        for e in explist:
            yield e

    def Resposta(self, resp, dif, index):
        Dificultador.Sort = Dicio[dif]
        expr = Dificultador().Sort()
        explist = [operator.attrgetter('expressao')(x) for x in expr]
        resplist = [operator.attrgetter('resposta')(x) for x in expr]
        flag = True
        if resp != resplist[index]:
            flag = False
            print('Burro')
            MotorDoJogoTresVidas().Erro()
            return resplist[index]
        else:
            return("Boa!")
        erro = MotorDoJogoTresVidas().Erro()
        if erro > 3:
            print("Perdeu mermão")
            quit()

    def Erro(self):
        erro += 1
        return erro

    def __next__(self):
        return self.next()

loop = 1
print("Bem vindo ao jogo de expressões matemáticas!")
print("1 - Sem Parar. Jogue até cansar! Caso queira sair, aperte Ctrl + D")
print("2 - Três Vidas. Errou três vezes, já era vacilão!")
print ''
try:
    modo = int(raw_input("Selecione um modo: "))
    pass
except Exception, e:
    print u'Opção Inválida'
if modo == 1:
    print("Selecione o modo que as expressões serão dispostas:")
    print("1 - Por nível")
    print("2 - Por tipo")
    print("")
    try:
        dif = int(raw_input("Selecione um Dificultador: "))
        pass
    except Exception, e:
        print u'Opção Inválida'
    k = MotorDoJogoTresVidas().MandaExp(dif)
    index = 0
    while loop == 1:
        print ("Resolva:")
        print (k.next())
        resp = raw_input("Resposta: ")
        l = MotorDoJogoTresVidas().Resposta(resp, dif, index)
        print l
        index += 1
