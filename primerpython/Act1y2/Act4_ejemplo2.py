'''
Created on 6 nov. 2020

@author: Francisco
'''



cuentas = {"sevilla" : [300,450], "madrid" : [400,300], "segovia" : [500,350], "valencia" :[450,300]} 

cuentasMadridYSegovia = cuentas['madrid'],cuentas['segovia']
cuentas["sevilla"] = cuentas["sevilla"] + [True]
sumaIngresos = cuentas["sevilla"][0]+cuentas["madrid"][0]+cuentas["segovia"][0]+cuentas["valencia"][0]

print(cuentasMadridYSegovia)

print(sumaIngresos)