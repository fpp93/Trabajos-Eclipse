'''
Created on 5 ene. 2021

@author: Francisco
'''
from Tema4 import db_class_5

db = db_class_5.DB("mi_erp")


acum_ventas = open("Acum_ventas.csv", "w")

acum_ventas.write("Ciudad,Ventas\n")

ventas_data=db.select("SELECT ciudad,COUNT(ciudad) FROM ventas GROUP BY ciudad")

for i in ventas_data:
    acum_ventas.write(i[0]+","+str(i[1])+"\n")

acum_ventas.close()

#----------------------------------------

acum_prod = open("Acum_productos.csv", "w")

acum_prod.write("Producto,Precio,Cantidad,Importe Total\n")

productos_data=db.select("SELECT codigo_producto,precio,SUM(cantidad),SUM(importe) FROM ventas GROUP BY codigo_producto")

for i in productos_data:
    acum_prod.write(str(i[0])+","+str(i[1])+","+str(i[2])+","+str(i[3])+"\n")
print("csv generado")
acum_ventas.close()

db.__del__()