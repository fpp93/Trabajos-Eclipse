'''
Created on 23 nov. 2020

@author: Francisco
'''

        
        
class Estanteria():
     
    def __init__ (self,planta, pasillo, modulo,seccion):
        
        self.__planta = planta
        self.__pasillo = pasillo
        self.__modulo= modulo
        self.__seccion = seccion
         
    @property
    def planta(self):
        return self.__planta
     
    @planta.setter
    def planta(self,planta):
        self.__planta = planta
         
     
    @property
    def pasillo(self):
        return self.__pasillo
      
    @pasillo.setter
    def pasillo(self,pasillo):
        self.__pasillo = pasillo
        
    @property
    def modulo(self):
        return self.__modulo
     
    @modulo.setter
    def modulo(self,modulo):
        self.__modulo= modulo
        
    @property
    def seccion(self):
        return self.__seccion
     
    @seccion.setter
    def seccion(self,seccion):
        self.__seccion= seccion
        
        
    def Descripcion(self):
        
        return " planta:"+ self.__planta," pasillo:"+self.__pasillo," modulo:"+str(self.__modulo)," seccion:"+self.__seccion  
     
     
class Libro(Estanteria):
     
    def __init__ (self,planta, pasillo, modulo,seccion, nombre, editorial, edicion,autor):
        super().__init__(planta, pasillo, modulo,seccion)
        self.__nombre = nombre
        self.__editorial = editorial
        self.__edicion= edicion
        self.__autor = autor
         
    @property
    def nombre(self):
        return self.__nombre
     
    @nombre.setter
    def nombre(self,nombre):
        self.__nombre = nombre
         
     
    @property
    def editorial(self):
        return self.__editorial
      
    @editorial.setter
    def editorial(self,editorial):
        self.__editorial = editorial
        
    @property
    def edicion(self):
        return self.__edicion
     
    @edicion.setter
    def edicion(self,edicion):
        self.__edicion = edicion
        
    @property
    def autor(self):
        return self.__autor
     
    @autor.setter
    def autor(self,autor):
        self.__autor= autor
        
    def Descripcion_libro(self):
        super().Descripcion()
        return super().Descripcion(), "nombre:"+ self.__nombre," editorial:"+self.__editorial," edicion:"+self.__edicion," autor:"+self.__autor  
     
     

     
            
libro1=Libro("planta","pasillo",3,"A","el senior de los anillos","anaya","salvat","tolkien")
libro2=Libro("planta","pasillo",2,"B","harry potter: la nueva profecia","anaya","salvat","ROWLING")
print(libro1.Descripcion_libro())
print(libro2.Descripcion_libro())    
        
        
        