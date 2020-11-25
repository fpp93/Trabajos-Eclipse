'''
Created on 16 nov. 2020

@author: Francisco
'''


class Aula():
     
    def __init__ (self,completamos=False):
       
        self.__completamos=completamos
        self.__largo = 3
        self.__ancho = 4
        self.__alto= 3
        self.__aforo_completo=False
        
    
         
    @property
    def largo(self):
        return self.__largo
     
    @largo.setter
    def largo(self,largo):
        self.__largo = largo
         
     
    @property
    def ancho(self):
        return self.__ancho
      
    @ancho.setter
    def ancho(self,ancho):
        self.__ancho = ancho
        
    @property
    def alto(self):
        return self.__alto
     
    @alto.setter
    def alto(self,alto):
        self.__alto = alto
        
    @property
    def aforo_completo(self):
        return self.__aforo_completo
     
    @aforo_completo.setter
    def aforo_completo(self,aforo_completo):
        self.__aforo_completo = aforo_completo
   
   
    def Completo(self):
        if(self.__aforo_completo==False):
            self.__aforo_completo=True
   
        if(self.__aforo_completo==True):
            self.__aforo_completo=False
   
   
    def Estado(self):
        if(self.__aforo_completo==False):
            print("No esta completo el aforo de la clase")
   
        if(self.__aforo_completo==True):
            print("Esta completo el aforo de la clase")
            
    def Completo2(self,completamos):
        if(completamos==False):
            print("No esta completo el aforo de la clase")
   
        if(completamos==True):
            print("Esta completo el aforo de la clase")     
            
            
miaula=Aula()
print("El largo de mi clase es "+str(miaula.largo)+" metros, y "), miaula.Estado()
print("--------------------------------------------")
completamos=True
aula2=Aula()
aula2.Completo2(completamos)






   
   
