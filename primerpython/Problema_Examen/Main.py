'''
Created on 16 nov. 2020

@author: Francisco
'''

from Problema_Examen.Funciones import transformar_ventas,calcular_importes


Ventas=[(1,1,100,'Huelva',0,'producto1',15,9),
(2,1,100,'Sevilla',0,'producto1',15,9),
(3,2,100,'Sevilla',0,'producto2',18,11),
(4,2,100,'Sevilla',0,'producto2',18,11),
(5,2,100,'Huelva',0,'producto2',18,11),
(6,3,100,'Sevilla',0,'producto3',21,12),
(7,3,100,'Cordoba',0,'producto3',21,12),
(8,4,100,'Sevilla',0,'producto4',24,13),
(9,4,100,'Huelva',0,'producto4',24,13),
(10,4,100,'Cordoba',0,'producto4',24,13)]


v1=transformar_ventas(Ventas)
print(v1)
calcular_importes(v1)
print(v1)







