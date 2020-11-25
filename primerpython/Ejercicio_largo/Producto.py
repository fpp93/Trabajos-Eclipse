'''
Created on 23 nov. 2020

@author: Francisco
'''
class Producto:
    
    def __init__ (self, nombre_stock, coste_produccion):
        self.__nombre_stock = nombre_stock
        self.__coste_produccion = coste_produccion
    
    @property
    def nombre_stock(self):
        return self.__nombre_stock
    
    @nombre_stock.setter
    def nombre_stock(self,nombre_stock):
        self.__nombre_stock = nombre_stock
    
    
    @property
    def coste_produccion(self):
        return self.__coste_produccion
    
    @coste_produccion.setter
    def coste_produccion(self,coste_produccion):
        self.__coste_produccion = coste_produccion
        
        
   









