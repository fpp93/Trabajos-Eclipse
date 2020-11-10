'''
Created on 26 oct. 2020

@author: Francisco
'''
nombre=input("Introduce tu nombre: ")

edad=input ("Introduce tu edad: ")
edad=int (edad)

altura=input ("Introduce tu altura: ")
altura=float (altura)

sangre=input("Introduce tu grupo sanguineo: ")

poco=int (0)
medio=int (0)
alto=int (0)


if edad < 20 :
    poco=poco+10
    medio=medio+30
    alto=alto+60
    if sangre == "B" and altura <1.80:
        poco=poco+20
        medio=medio+20
        alto=alto+20
    elif sangre == "B" and altura >1.80:
        poco=poco+30
        medio=medio+30
        alto=alto+30
                
    elif sangre == "A" and altura>1.80:
        poco=poco+10
        medio=medio+10
        alto=alto+10
    elif sangre == "A" and altura<1.80:
        poco=poco-5
        medio=medio-5
        alto=alto-5
    elif sangre == "0" and altura>1.80:
        poco=poco+5
        medio=medio+5
        alto=alto+5
#-------------------------------------------------   
if edad >= 20 and edad<=40 :
    poco=poco+15
    medio=medio+40
    alto=alto+45
    if sangre == "B" and altura <1.80:
        poco=poco+20
        medio=medio+20
        alto=alto+20
    elif sangre == "B" and altura >1.80:
        poco=poco+30
        medio=medio+30
        alto=alto+30
                
    elif sangre == "A" and altura>1.80:
        poco=poco+10
        medio=medio+10
        alto=alto+10
    elif sangre == "A" and altura<1.80:
        poco=poco-5
        medio=medio-5
        alto=alto-5
    elif sangre == "0" and altura>1.80:
        poco=poco+5
        medio=medio+5
        alto=alto+5

#--------------------------------------------       
if edad >= 40 and edad<=50 :
    poco=poco+30
    medio=medio+40
    alto=alto+30
    if sangre == "B" and altura <1.80:
        poco=poco+20
        medio=medio+20
        alto=alto+20
    elif sangre == "B" and altura >1.80:
        poco=poco+30
        medio=medio+30
        alto=alto+30
                
    elif sangre == "A" and altura>1.80:
        poco=poco+10
        medio=medio+10
        alto=alto+10
    elif sangre == "A" and altura<1.80:
        poco=poco-5
        medio=medio-5
        alto=alto-5
    elif sangre == "0" and altura>1.80:
        poco=poco+5
        medio=medio+5
        alto=alto+5
        
#--------------------------------------------       
if edad > 50 :
    poco=poco+20
    medio=medio+30
    alto=alto+50
    if sangre == "B" and altura <1.80:
        poco=poco+20
        medio=medio+20
        alto=alto+20
    elif sangre == "B" and altura >1.80:
        poco=poco+30
        medio=medio+30
        alto=alto+30
                
    elif sangre == "A" and altura>1.80:
        poco=poco+10
        medio=medio+10
        alto=alto+10
    elif sangre == "A" and altura<1.80:
        poco=poco-5
        medio=medio-5
        alto=alto-5
    elif sangre == "0" and altura>1.80:
        poco=poco+5
        medio=medio+5
        alto=alto+5
        
print(nombre, "tiene la probabilidad de contraer el virus F de forma leve del: ",poco,"%")
print(nombre, "tiene la probabilidad de contraer el virus F de forma moderada del: ",medio,"%")
print(nombre, "tiene la probabilidad de contraer el virus F de forma grave del: ",alto,"%")



