'''
Created on 23 nov. 2020

@author: Francisco
'''

def busca_centros(lista):
    cont=0
    for i in lista:
        if(i=="FESAC"):
            print("FESAC esta en la lista")
            cont=cont+1
    
    if(cont==0):
        print("FESAC no esta en la lista")
        
        
def insertar(lista):
    cadena="IES Julio Costeau"
    lista.append(cadena)
    print(lista)
    
def eliminar(lista):
    for i in lista:
        if(i=="IES Julio Costeau"):
            lista.remove(i)


def sustituir(lista):
    for i in lista:
        if(i=="FESAC"):
            lista.insert(0, lista.pop(i))
            
def nueva_lista(lista):
    lista2=list()
    cont=0
    while(cont<2):
        lista2.append(lista[cont])
        cont=cont+1
        
    print(lista2)
        


cont=0
lista=list()

while(cont<5):
    opcion=input("introduzca un colegio")
    lista.append(opcion)
    cont=cont+1
    
    
    
nueva_lista(lista)
