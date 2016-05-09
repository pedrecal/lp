from Lab2 import Paciente

paciente1 = Paciente('Alexandre', 'm', 185, 82.00, 19, 600)
paciente2 = Paciente('Cassia', 'f', 165, 60.00, 19, 5000)
paciente3 = Paciente('Pedro', 'm', 170, 100.00, 20, 400)

print("Paciente 1: %s" % paciente1.calculaKcaloria())
print("Paciente 2: %s" % paciente2.calculaKcaloria())
print("Paciente 3: %s" % paciente3.calculaKcaloria())

paciente1.consomeKcaloria(2000)
paciente2.consomeKcaloria(200)
paciente3.consomeKcaloria(950)
