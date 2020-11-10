

nombre=input("Introduce tu nombre: ")

edad=input ("Introduce tu edad: ")
edad=int (edad)

sangre=input("Introduce tu grupo sanguineo: ")

poco=int (0)
medio=int (0)
alto=int (0)

if edad < 20 :
    poco=poco+10
    medio=medio+30
    alto=alto+60
    if sangre == "B" :
        poco=poco+20
        medio=medio+20
        alto=alto+20
                
    elif sangre == "A" :
        poco=poco-5
        medio=medio-5
        alto=alto-5
#-------------------------------------------------   
if edad >= 20 and edad<=40 :
    poco=poco+20
    medio=medio+40
    alto=alto+40
    if sangre == "B" :
        poco=poco+20
        medio=medio+20
        alto=alto+20
                
    elif sangre == "A" :
        poco=poco-5
        medio=medio-5
        alto=alto-5

#--------------------------------------------       
if edad > 40 and edad<=50 :
    poco=poco+30
    medio=medio+40
    alto=alto+30
    if sangre == "B" :
        poco=poco+20
        medio=medio+20
        alto=alto+20
                
    elif sangre == "A" :
        poco=poco-5
        medio=medio-5
        alto=alto-5
        
#--------------------------------------------       
if edad > 50 :
    poco=poco+50
    medio=medio+30
    alto=alto+20
    if sangre == "B" :
        poco=poco+30
        medio=medio+40
        alto=alto+30
                
    elif sangre == "A" :
        poco=poco-5
        medio=medio-5
        alto=alto-5
        
print("La probabilidad de ser un inversor poco arriesgado es del ",poco,"%")
print("La probabilidad de ser un inversor moderadamente arriesgado es del ",medio,"%")
print("La probabilidad de ser un inversor  arriesgado es del ",alto,"%")
        
            