"""class MotorDoJogoTresVidas(object):
        def MandaExp(self, dif):
            self.dif = dif
            Dificultador.Sort = Dicio[dif]
            expr = Dificultador().Sort()
            explist = [operator.attrgetter('expressao')(x) for x in expr]
            resplist = [operator.attrgetter('resposta')(x) for x in expr]
            print explist
            for e in explist:
                yield explist[e]

        def Resposta(self, resp):
            self.resp = resp
            flag = True
            for i in explist:
                if resp  != resplist[i]:
                    flag = False"""

"""print("Bem vindo ao jogo de expressões matemáticas!")
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
        if dif == 1:
            k = MotorDoJogoSP().MandaExp(1)
            print (k.next())
            print ("TESTE")"""
