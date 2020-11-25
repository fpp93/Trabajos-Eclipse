'''
Created on 23 nov. 2020

@author: Francisco
'''
print("PROGRAMA DE NOTAS")
nota=float(input("introduzca su nota"))
control=0
while(control==0):
    if(nota<0 or nota>10):
        nota=float(input("introduzca una nota valida"))
    else:
        if nota >= 0 and nota <5 :
            print("suspenso")
        elif(nota>=5 and nota<7):
            print("aprobado")
        elif(nota>=7 and nota<9):
            print("notable")
        elif(nota>=9 and nota<10):
            print("sobresaliente")
        elif(nota==10):
            print("Matricula de honor")
    control=control+1
            
        
    


