
'''
Created on 6 nov. 2020

@author: Francisco
'''

cuentas = [(300,450),(400,300),(500,350),(450,300)]
# el primer numero indica ingresos, el segundo gastos.
impares = cuentas[::2]
pares = cuentas[1::2]
dosPrimeros = cuentas[:2]
dosUltimos = cuentas[2:]
primeroYultimo = cuentas[::3]

print(impares)
print(pares)
print(dosPrimeros)
print(dosUltimos)
print(primeroYultimo)