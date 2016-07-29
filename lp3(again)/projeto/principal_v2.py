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
    from abc import ABCMeta, abstractmethod
    __metaclass__ = ABCMeta
    @abstractmethod
    def Sort(self, expressoes):
        pass

def DificultadorNivel(expressoes):#Faz um sort da lista de expressoes em niveis
    expressoes = FonteDeExpressoes().lista()
    expnivel = sorted(expressoes, key=lambda x: x.nivel)
    return expnivel

def DificultadorTipo(expressoes):#Faz um sort da lista de expressoes em tipo
    expressoes = FonteDeExpressoes().lista()
    exptipo = sorted(expressoes, key=lambda x: x.tipo)
    return exptipo

dif = {1: DificultadorNivel, 2: DificultadorTipo}


class MotorDoJogo(object):
    #Essa classe deve deve dar os tipos de jogo, fase, treino, morte súbita
        from abc import ABCMeta, abstractmethod
        __metaclass__ = ABCMeta
        @abstractmethod
        def jogo(self):
            pass

class SemParar(MotorDoJogo):
    from Dificultador import Sort
    def jogo(self):
        expatual =


#################SELEÇÃO DO MENU, FICAR NO FINAL#################
while True:
    opcao = Opcoes()
    if opcao == 1:
        cls()
        print "--------------JOGO DAS EQUAÇÕES----------------"
        print "Escolha o método de jogo:"
        print "1 - Sem Parar"
        print "2 - Três Vidas"
        try:
            modo = int(raw_input('Escolha Uma Opção: '))
            return modo
            pass
        except Exception, e:
            print u'Opção Inválida'

        if modo == 1:
            cls()
            print 'Escolha o método de dificuldade:'
            print "1 - Por tipo de expressão"
            print "2 - Por nível de equação"
            try:
                dificult = int(raw_input('Escolha Uma Opção: '))
                return dificult
                pass
            except Exception, e:
                print u'Opção Inválida'

        if dificult == 1:
            cls()
            Dificultador.sort = dif[dificult]



    pass
