
lista = [8,3,24,32,14,78,25,85,32,7,777,124]

mayor=0
menor=1000
buscar=input("intorduce un numero")

for numero in lista:
    if mayor < numero :
        
        mayor = numero
    if menor> numero :
        menor = numero
    if(buscar==numero):
        print("El numero introducido esta en la lista")
    else:
        print("EWl numero introducidpo no esta en la lista")

print ("El numero maximo de la lista es: ", mayor)

print ("El numero minimo de la lista es: ",menor)



print("La distancia entre ambos es de: ",max(lista)-min(lista)," kilometros")