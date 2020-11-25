'''
Created on 16 nov. 2020

@author: Francisco
'''
class Producto:
    
    def __init__ (self, nombre, precio_unitario, coste_produccion):
        self.__nombre = nombre
        self.__precio_unitario = precio_unitario
        self.__coste_produccion = coste_produccion
    
    @property
    def nombre(self):
        return self.__nombre
    
    @nombre.setter
    def nombre(self,nombre):
        self.__nombre = nombre
    
    @property
    def precio_unitario(self):
        return self.__precio_unitario
    
    @precio_unitario.setter
    def precio_unitario(self,precio_unitario):
        self.__precio_unitario = precio_unitario
    
    @property
    def coste_produccion(self):
        return self.__coste_produccion
    
    @coste_produccion.setter
    def coste_produccion(self,coste_produccion):
        self.__coste_produccion = coste_produccion
        
        
        
   
        
        
        
        
  
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        