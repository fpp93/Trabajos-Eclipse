'''
Created on 9 nov. 2020

@author: Francisco
'''


class Persona:
    
    def __init__ (self, nombre, edad, residencia):
        self.__nombre = nombre
        self.__edad = edad
        self.__residencia = residencia
    
    @property
    def nombre(self):
        return self.__nombre
    
    @nombre.setter
    def nombre(self,nombre):
        self.__nombre = nombre
    
    @property
    def edad(self):
        return self.__edad
    
    @edad.setter
    def edad(self,edad):
        self.__edad = edad
    
    @property
    def residencia(self):
        return self.__residencia
    
    @residencia.setter
    def residencia(self,residencia):
        self.__residencia = residencia
    
    
    
    
    def Descripcion(self):
        return "Nombre:", self.__nombre," Edad:",self.__edad," Residencia:",self.__residencia









