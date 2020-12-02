class producto:
    
    def __init__ (self, nombre, stock, coste_produccion):
        self.__nombre= nombre
        self.__stock = stock
        self.__preciocoste = coste_produccion
    
    @property
    def nombre(self):
        return self.__nombre
     
    @nombre.setter
    def nombre(self,nombre):
        self.__nombre = nombre
     
    @property
    def stock(self):
        return self.__stock
     
    @stock.setter
    def stock(self,stock):
        self.__stock = stock
     
    @property
    def coste_produccion(self):
        return self.__coste_produccion
     
    @coste_produccion.setter
    def coste_produccion(self,coste_produccion):
        self.__coste_produccion = coste_produccion