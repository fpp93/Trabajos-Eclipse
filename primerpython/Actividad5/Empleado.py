'''
Created on 9 nov. 2020

@author: Francisco
'''

from Actividad5.Persona import Persona
class Empleado(Persona):
     
    def __init__ (self, nombre, edad, residencia,salario,antiguedad):
        super().__init__(nombre, edad, residencia)
        self.__salario = salario
        self.__antiguedad = antiguedad
         
    @property
    def salario(self):
        return self.__salario
     
    @salario.setter
    def salario(self,salario):
        self.__salario = salario
         
     
    @property
    def antiguedad(self):
        return self.__antiguedad
      
    @antiguedad.setter
    def antiguedad(self,antiguedad):
        self.__antiguedad = antiguedad
    
    
    
    
    def descripcionempleado(self):
        super().Descripcion()
        return super().Descripcion(), "Salario:", self.__salario," Antiguedad:",self.__antiguedad
    
pers=Empleado("Rogelio",23,"Sevilla",32500,8)
print(pers.descripcionempleado()) 
    

        