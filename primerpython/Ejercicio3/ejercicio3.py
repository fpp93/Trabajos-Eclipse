'''
Created on 23 nov. 2020

@author: Francisco
'''


def pide_Edad():
    cont=0
    while(cont==0):
        try:
            edad=int(input("introduzca su edad "))
            cont=cont+1
        except ValueError:
            print("tienes que escribir un numero ")
            
    if(edad>=18):
        
        localidad=input("introduzca su localidad")
        
        if(edad<30 and localidad=="sevilla"):
            print("Le atendera el Dr. Cifuentes en la planta 1")
        elif(edad>30 and localidad=="sevilla"):
            print("Le atendera la Dra. Garcia en la planta 2")
        elif(edad<30 and localidad!="sevilla"):
            print("Le atendera el Dr. Huesca en la planta 1")
        elif(edad>30 and localidad!="sevilla"):
            print("Le atendera la Dra. Perianez en la planta 2")  
        
    else:
        
        print("losiento hay que ser mayor de edad")
        



pide_Edad()
        
        
    
    