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
