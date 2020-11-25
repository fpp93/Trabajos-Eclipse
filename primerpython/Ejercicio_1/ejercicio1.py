'''
Created on 23 nov. 2020

@author: Francisco
'''

def registrarClientes():
    correovalido=False
    print("Bienvenido, por favor introduzca sus datos a continuacion")
    print("........................................................")
    nombre=input("introduzca su nombre ")
    apellidos=input("introduzca sus apellidos ")
    direccion=input("introduzca su direccion ")
    poblacion=input("introduzca lugar de residencia ")
    telefono=int(input("introduzca su numero de telefono "))
    email=input("introduzca su e-mail ")
    for i in email:
        if(i=="@"):
            correovalido=True
            
    if(correovalido==True):
        print("e-mail correcto")
        print("usuario registrado: "+"nombre: "+nombre+" ,apellidos: "+apellidos+" ,direccion: "+direccion+" ,poblacion: "+poblacion+" ,telefono: "+str(telefono)+" ,email: "+email)
    else:
        print("e-mail incorrecto")
        
        
registrarClientes()