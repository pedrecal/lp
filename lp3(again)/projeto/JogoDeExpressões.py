# -*- coding: utf-8 -*-
# ! /bin/env python
import random
import operator
import os
from abc import ABCMeta, abstractmethod
def cls():
    os.system('clear')
################################################################################
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
################################################################################
class Dificultador(object):
    def Sort(self):
        pass

def DificultadorUmNivel(self, nivel):#Faz um sort da lista de expressoes em niveis
    expumnivel = filter(lambda x: nivel == x.nivel, FonteDeExpressoes().lista())
    return expumnivel

def DificultadorUmTipo(self, tipo):
    expumtipo = filter(lambda x: tipo == x.tipo, FonteDeExpressoes().lista())
    return expumtipo

def DificultadorNivelCres(self, ret):
    expnivel = sorted(FonteDeExpressoes().lista(), key = lambda x: x.nivel)
    return expnivel
################################################################################
class MotorDoJogo(object):
    import operator
    def MandaExp(self, dif, difsel):
        Dificultador.Sort = Dicio[dif]
        expr = Dificultador().Sort(difsel)
        explist = [operator.attrgetter('expressao')(x) for x in expr]
        for e in explist:
            yield e

    def Resposta(self):
        pass

    def Erros(self):
        global erro
        erro += 1
        return erro

    def __next__(self):
        return self.next()

class MotorDoJogoSP(MotorDoJogo):
    import operator
    def Resposta(self, resp, dif, index, difsel):
        Dificultador.Sort = Dicio[dif]
        expr = Dificultador().Sort(difsel)
        resplist = [operator.attrgetter('resposta')(x) for x in expr]
        flag = True
        if resp != resplist[index]:
            flag = False
            return ("Errado! Resultado: " + resplist[index])
        else:
            return "Correto"

    def __next__(self):
        return self.next()

class MotorDoJogoTresVidas(MotorDoJogo):
    import operator
    def Resposta(self, resp, dif, index, difsel):
        Dificultador.Sort = Dicio[dif]
        expr = Dificultador().Sort(difsel)
        resplist = [operator.attrgetter('resposta')(x) for x in expr]
        flag = True
        if resp != resplist[index]:
            flag = False
            MotorDoJogo().Erros()
            if erro > 3:
                return quit()
        else:
            return "Correto!"

def BaseMotorDoJogo(modo):
    MotorDoJogo.Resposta = Dicio2[modo]
################################################################################
Dicio = {1: DificultadorUmNivel, 2: DificultadorUmTipo, 3: DificultadorNivelCres}
Dicio2 = {1:MotorDoJogoSP().Resposta, 2:MotorDoJogoTresVidas().Resposta}
################################################################################
class Main(object):
    cls()
    print("Bem vindo ao jogo de expressões matemáticas!")
    print("Entre com o número correspondente ao modo de jogo que desejar")
    print("1 - Sem Parar. Jogue o quanto quiser e treine suas habilidades")
    print("2 - Três Vidas. Se errar três vezes perde")
    print("9 - Sair")
    print ''
    try:
        modo = int(raw_input("Selecione Um Modo: "))
        pass
    except Exception as e:
        print u'Opção Inválida'
    cls()
    ############################################################################
    if (modo == 1) or (modo == 2):
        print("Agora você deve selecionar em que ordenação as expressões serão exibidas")
        print("1 - Um Tipo de Nível, de 1 a 5")
        print("2 - Um Tipo de Expressão")
        print("3 - Nível em Ordem Crescente")
        print''
        zero = 0
        global erro
        erro = zero
        try:
            dif = int(raw_input("Selecione Um Dificultador: "))
            pass
        except Exception as e:
            print u'Opção Inválida'
        ########################################################################
        if (dif == 1) or (dif == 2):
            if dif == 2:
                print("Selecione O Tipo de Expressão: ")
                print("a - Adição")
                print("s - Subtração")
                print("m - Multiplicação")
                print("d - Divisão")
            try:
                difsel = raw_input("Selecione Um Tipo: ")
                pass
            except Exception as e:
                print u'Opção Inválida'
        elif dif == 3:
            difsel = 1
            pass
        cls()
        BaseMotorDoJogo(modo)
        k = MotorDoJogo().MandaExp(dif, difsel)
        index = 0
        erro = 0
        while True:
            print("Resolva: ")
            print(k.next())
            resposta = raw_input("Solução: ")
            l = MotorDoJogo().Resposta(resposta, dif, index, difsel)
            print l
            index += 1
    ############################################################################
    elif modo == 9:
        quit()
