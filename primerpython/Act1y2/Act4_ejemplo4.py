'''
Created on 9 nov. 2020

@author: Francisco
'''


texto="En un lugar de la Mancha de cuyo nombre no quiero acordarme no ha mucho tiempo que vivia un hidalgo de los de lanza en astillero adarga antigua rocin flaco y galgo corredor Una olla de algo mas vaca que carnero salpicon las mas noches duelos y quebrantos los sabados lantejas los viernes algun palomino de anadidura los domingos consumian las tres partes de su hacienda El resto della concluian sayo de velarte calzas de velludo para las fiestas con sus pantuflos de lo mesmo y los dias de entresemana se honraba con su vello de lo mas fino Tenia en su casa una ama que pasaba de los cuarenta y una sobrina que no llegaba a los veinte y un mozo de campo y plaza que asi ensillaba el rocin como tomaba la posadera Frisaba la edad de nuestro hidalgo con los cincuenta anos Era de complexion recia seco de carnes enjuto de rostro gran madrugador y amigo de la caza Quieren decir que tenia el sobrenombre de Quijada o Quesada que en esto hay alguna diferencia en los autores quedeste caso escriben aunque por conjeturas verisimiles se deja entender que se llamaba Quijana Pero esto importa poco a nuestro cuento: basta que en la narracion del no se salga un punto de la verdad"

lista=[]
palabra=""
dic=dict()


for i in texto:
    
    palabra=palabra+i
    if i==" ":
        lista+=[palabra]
        palabra=""
        
#guardo la variable x que lleva los elementos de mi lista, en mi diciconario y le voy sumando uno al valor, para saber cuantas veces se repite cada vez que entra la misma      
for x in lista:
    dic[x]=dic.get(x, 0)+1
    
palabramax="" 
valormax=0

#esto es un for que recorre los items de un diccionario, palabra y conteo son como dos variables que hacen referencia a la  clave y al valor de cada elemento del diccionario
for palabras,conteo in dic.items():
    if valormax<conteo:
        palabramax=palabras
        valormax=conteo
    
    
    
print(lista)
print("palabra mas repetida:",palabramax," y se repite ",valormax, " veces")

buscar=input("Digame la palabra a buscar: ")
contador=0
for i in lista:
    if buscar==i:
        contador=contador+1
   
   
   
   
        
if contador==0:
    print("La palabra: " , buscar , " no aparece en la lista.")
elif contador == 1:
    print("La palabra: " , buscar , " aparece una vez en la lista.")
else:
    print("La palabra: " , buscar , " aparece", contador, "veces en la lista.")





