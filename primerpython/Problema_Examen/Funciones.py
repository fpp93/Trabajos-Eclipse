'''
Created on 20 nov. 2020

@author: Francisco
'''
from Problema_Examen.Producto  import Producto

def  transformar_ventas(lista):
    list_dic=[]
    for i_venta,producto,cantidad,ciudad,importe,nombre,precio,coste_produccion in lista:
        d={"cantidad":cantidad,"ciudad":ciudad,"importe":importe,"nombre":nombre,"precio":precio,"coste":coste_produccion}
        list_dic.append(d)
    return list_dic

def calcular_importes(ventas):
    suma=0
    for v in ventas:
        v["importe"]=v["cantidad"]*v["precio"]
        suma=suma+v["importe"]
    print("suma de importes="+str(suma))
        

    
    
    