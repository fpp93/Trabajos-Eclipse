'''
Created on 23 nov. 2020

@author: nicol
'''
from Correcion.Funciones import transformar_compras, calcular_compras, cantidadtotal

res = [(1,1,80,None,'producto1',1.5),
      (2,1,70,None,'producto1',1.5),
      (3,2,15,None,'producto2',1.8),
      (4,2,21,None,'producto2',1.8),
      (5,2,18,None,'producto2',1.8),
      (6,3,40,None,'producto3',2.1),
      (7,3,24,None,'producto3',2.1),
      (8,4,17,None,'producto4',2.4),
      (9,4,32,None,'producto4',2.4),
      (10,4,40,None,'producto4',2.4)]

compras = transformar_compras(res)
print(compras)

ventas2 = calcular_compras(res)
print(compras)

ventas2 = cantidadtotal(res)
calcular_compras(ventas2)
print(ventas2)