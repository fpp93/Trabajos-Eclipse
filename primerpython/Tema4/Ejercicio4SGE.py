'''
Created on 8 ene. 2021

@author: Francisco
'''
from Tema4 import db_class_5
import sqlite3
from sqlite3 import Error

db = db_class_5.DB("prueba")

try:
    con = sqlite3.connect("prueba.db")
    print("Conexion a","prueba.db")
except Error:
    print(Error)
    con=None

try:
    cur = con.cursor()
    xfile=open('empleados.txt')
    
    for linea in xfile:
        linea2 = linea.split(",")
        cur.execute("INSERT INTO empleados VALUES (?,?,?,?,?,?)",linea2)
                
                
    con.commit()
    print("datos insertados")
        
except sqlite3.OperationalError:
    print("error en insert")

acum_prog = open("programadores.csv", "w")

acum_prog.write("nombre,salario anual,fecha contratacion,categoria\n")

prog_data=db.select("SELECT nombre,salario,fecha_contratacion,categoria FROM empleados")
print(prog_data)

for i in prog_data:
    acum_prog.write(str(i[0])+","+str(i[1])+","+str(i[2])+","+str(i[3])+"\n")

acum_prog.close()

#----------------------------------------

acum_resumen = open("resumen.csv", "w")

acum_resumen.write("departamento,categoria,salario\n")

resumen_data=db.select("SELECT departamento,categoria,SUM(salario) FROM empleados GROUP BY categoria")
print(resumen_data)

for i in resumen_data:
    acum_resumen.write(str(i[0])+","+str(i[1])+","+str(i[2])+"\n")
print("csv generado")
acum_resumen.close()

db.__del__()