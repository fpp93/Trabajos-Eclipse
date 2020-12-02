print("--Biemvenido a este programa--")

listainst = []
nombre1 = input("Indique primer centro: ")
listainst.append(nombre1)
nombre2 = input("Indique segundo centro: ")
listainst.append(nombre2)
nombre3 = input("Indique tercer centro: ")
listainst.append(nombre3)
nombre4 = input("Indique cuarto centro: ")
listainst.append(nombre4)
nombre5 = input("Indique quinto centro: ")
listainst.append(nombre5)

def busqueda (listainst):
    if 'FESAC' in listainst :
        print("fesac si esta en la lista")    #busqueda fesac
    else:         
        print("El centro no esta en la lista")
         
         
def insert(listainst):
    listainst.append("IES Julio Cesar") 
    
def sustitucion():    
    listainst.insert(0, 'FESAC')
     
     

def eliminar (listainst):
    if 'IES Julio Costeau' in listainst :
        listainst.remove('IES Julio Costeau')
    else:         
        print("El centro no esta en la lista")
    
def nuevaLista (listainst):   
    elemento1 = listainst[0]#cojo valores lista
    elemento2 = listainst[1]
   
    newLista = (elemento1,elemento2)#los inserto en nueva lista
    
    listainst.remove[0]#los borro de la vieja lista
    listainst.remove[1]
    
    for element in newLista:#recorro nueva lista e imprimo
        print(element)
    



sustitucion(listainst)








   
    