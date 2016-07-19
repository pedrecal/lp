# -*- coding: utf-8 -*-
# ! /bin/env python

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

class Expressao:

    def __init__(self, nivel, tipo, expressao, resposta):
        self.nivel = nivel
        self.tipo = tipo
        self.expressao = expressao
        self.resposta = respostaes

class FonteDeExpressoes(Expressao):
    import csv

    def lista (self):
        expressoes = []
        Expressao.nivel = nivel
        Expressao.tipo = tipo
        Expressao.expressao = expressao
        Expressao.resposta = resposta

        with open('exp.txt') as fin, open('expt.txt', 'w') as fout:
            for line in fin:
                fout.write(line.replace'\t', ',')
            for line in fout:
                expressoes.append(Expressao(fout.readlines()))

class Dificultador(FonteDeExpressoes):



#################SELEÇÃO DO MENU, FICAR NO FINAL#################
while True:
    opcao = Opcoes()
    if opcao == 1:
        #FUNC DE INICIAR JOGO
    pass
