'''
Created on 16 nov. 2020

@author: Francisco
'''


class Edificacion():
     
    def __init__ (self, altura, constructora, valor_suelo,ubicacion):
       
        self.__altura = altura
        self.__constructora = constructora
        self.__valor_suelo= valor_suelo
        self.__ubicacion = ubicacion
         
    @property
    def altura(self):
        return self.__altura
     
    @altura.setter
    def altura(self,altura):
        self.__altura = altura
         
     
    @property
    def constructora(self):
        return self.__constructora
      
    @constructora.setter
    def constructora(self,constructora):
        self.__constructora = constructora
        
    @property
    def valor_suelo(self):
        return self.__valor_suelo
     
    @valor_suelo.setter
    def valor_suelo(self,valor_suelo):
        self.__valor_suelo = valor_suelo
        
    @property
    def ubicacion(self):
        return self.__ubicacion
     
    @ubicacion.setter
    def ubicacion(self,ubicacion):
        self.__ubicacion= ubicacion
        
        
        
    def Descripcion(self):
        return "altura:"+ str(self.__altura)," constructora:"+self.__constructora," valor del suelo:"+str(self.__valor_suelo)," ubicacion:"+self.__ubicacion
        
        
class Piso(Edificacion):
     
    def __init__ (self,altura, constructora, valor_suelo,ubicacion,metros_construidos, numero_habitaciones, numero_aseos,precio,planta,numero_piso,puerta):
        super().__init__(altura,constructora,valor_suelo,ubicacion)
        self.__metros_construidos = metros_construidos
        self.__numero_habitaciones = numero_habitaciones
        self.__numero_aseos= numero_aseos
        self.__precio = precio
        self.__planta = planta
        self.__numero_piso = numero_piso
        self.__puerta = puerta
         
    @property
    def metros_construidos(self):
        return self.__metros_construidos
     
    @metros_construidos.setter
    def metros_construidos(self,metros_construidos):
        self.__metros_construidos = metros_construidos
         
     
    @property
    def numero_habitaciones(self):
        return self.__numero_habitaciones
      
    @numero_habitaciones.setter
    def numero_habitaciones(self,numero_habitaciones):
        self.__numero_habitaciones = numero_habitaciones
        
    @property
    def numero_aseos(self):
        return self.__numero_aseos
     
    @numero_aseos.setter
    def numero_aseos(self,numero_aseos):
        self.__numero_aseos = numero_aseos
        
    @property
    def precio(self):
        return self.__precio
     
    @precio.setter
    def precio(self,precio):
        self.__precio= precio
        
    @property
    def planta(self):
        return self.__planta
     
    @planta.setter
    def planta(self,planta):
        self.__planta= planta
    
    
    @property
    def numero_piso(self):
        return self.__numero_piso
     
    @numero_piso.setter
    def numero_piso(self,numero_piso):
        self.__numero_piso= numero_piso
        
        
    @property
    def puerta(self):
        return self.__puerta
     
    @puerta.setter
    def puerta(self,puerta):
        self.__puerta= puerta
        
        
        
    def Descripcion_piso(self):
        super().Descripcion()
        return super().Descripcion(), " metros construidos:"+ str(self.__metros_construidos)," habitaciones:"+str(self.__numero_habitaciones)," aseos:"+str(self.__numero_aseos)," precio:"+str(self.__precio)," planta:"+str(self.__planta)," piso:"+str(self.__numero_piso)," puerta:"+self.__puerta         
        
        
        
        