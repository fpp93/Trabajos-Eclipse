class libro:
    
    def __init__ (self, nombre, editorial, edicion, autor):
        self.nombre = nombre
        self.__editorial = editorial
        self.__edicion = edicion
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
        self.__autor = autor
        
    def descripcion(self):
        cadena=""
        cadena="Nombre: "+ self.__nombre+",\nEditorial:"+self.__editorial+ ",\nEdicion: "+self.__edicion + ",\nAutor: "+self.__autor
        return cadena  
    
    
class estanteria(libro):
     
    def __init__ (self, nombre, editorial, edicion, autor, planta, pasillo, modulo, seccion):
        super(nombre, editorial, edicion, autor)
        self.__planta = planta
        self.__pasillo = pasillo
        self.__modulo = modulo
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
        self.__modulo = modulo
         
    @property
    def seccion(self):
        return self.__seccion
     
    @seccion.setter
    def seccion(self,seccion):
        self.__seccion = seccion
        
    def descripcion(self):
        cadena=""
        cadena="Nombre: "+ self.__nombre+",\nEditorial:"+self.__editorial+ "\nEdicion: "+self.__edicion + ",\nAutor: "+self.__autor + ",\nPlanta: "+str(self.__planta) + ",\nPasillo: "+str(self.__pasillo)+ ",\nModulo: "+str(self.__modulo) + ",\nSeccion: "+self.__seccion 
        return cadena  
    
libro1 = libro('La jungla de cristal', 'Salmon', 'Dos', 'Pedro Hernandez')

libro2 = libro('Willy', 'Salamnca', 'Primera', 'Jorge Gorgio')

super(estanteria)

print(libro1.descripcion())
print('------------------------------------')                                                                                                         
print(libro2.descripcion())