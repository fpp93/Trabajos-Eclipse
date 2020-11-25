'''
Created on 23 nov. 2020

@author: Francisco

'''
from Ejercicio_largo.funciones import transformar_compras,calcular_compras,compras
lista=[(1,1,80,None,'producto1',1.5),
(2,1,70,None,'producto1',1.5),
(3,2,15,None,'producto2',1.8),
(4,2,21,None,'producto2',1.8),
(5,2,18,None,'producto2',1.8),
(6,3,40,None,'producto3',2.1),
(7,3,24,None,'producto3',2.1),
(8,4,17,None,'producto4',2.4),
(9,4,32,None,'producto4',2.4),
(10,4,40,None,'producto4',2.4)]




v1=transformar_compras(lista)
print(v1)
calcular_compras(v1)
print(v1)
compras(v1)

