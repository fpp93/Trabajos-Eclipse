'''
Created on 23 nov. 2020

@author: Francisco
'''

def transformar_compras(lista):
    list_dic=[]
    for id,codigo_producto_comprado,cantidad,importe,nombre,precio in lista:
        d={"codigo_producto":codigo_producto_comprado,"cantidad":cantidad,"importe":importe,"nombre":nombre,"precio":precio}
        list_dic.append(d)
    return list_dic

def calcular_compras(compras):
    
    for v in compras:
        v["importe"]=v["cantidad"]*v["precio"]
     
    
    
def compras(compras):
    suma=0
    productos=0
    for v in compras:
        productos=productos+v["cantidad"]
        suma=suma+v["importe"]
     
    productos=productos-47   
    print("importe total del inventario="+str(suma))
    print("la cantidad total de productos es="+str(productos))
     
