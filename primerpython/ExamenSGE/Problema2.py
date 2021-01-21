'''
Created on 18 ene. 2021

@author: Francisco
'''
import sqlite3 
from sqlite3 import Error

def sql_connection(filename):
    try:
        con = sqlite3.connect(filename)
        print("Conexion realizada a", filename)
    except Error:
        print(Error)
        con = None
    finally:
        return con
    
def sql_creartabla(con):
    try:
        cur = con.cursor()
        cur.execute("CREATE TABLE compras (id integer PRIMARY KEY,fecha text, cdgproducto text, proveedor real, cantidad real,precio real,importecompra real)")
    
    except sqlite3.OperationalError:
        
        print("La tabla ya existe")
              
def sql_insertardatos(con):
    try:
        cur = con.cursor()
        compras = tuple()
        fichero = open("compras.txt", "r")
        for linea in fichero:
            compras=linea.split(",")
            print(compras)
            cur.execute("INSERT INTO compras values ("+compras[0]+","+str(compras[1])+","+str(compras[2])+ ","+compras[3]+","+compras[4]+","+compras[5]+","+compras[6]+")");
        fichero.close()
        
        con.commit()
        print("Se insertaron los datos correctamente")
        
    except sqlite3.OperationalError:
        print("Error en los datos")
        
def sql_update(con):
    
        cur = con.cursor()
        cur.execute("update compras set importecompra=precio*cantidad")
        print("importecompra actualizada")
        con.commit()
        
        
def sql_excel_proveedor(con):
    try: 
        csv = open("Compras_Proveedor.csv", "w+")
        csv.write("Proveedor,Compras\n")
        cur = con.cursor()
        cur.execute("SELECT proveedor,sum(importecompra) from compras group by proveedor ");
        rows = cur.fetchall()
        print(rows)
        for i in rows :
            csv.write(str(i[0])+","+str(i[1])+"\n")
        csv.close(); 
    except sqlite3.OperationalError:       
        print("ERROR")
        
def sql_excel_compras(con):
    try: 
        csv = open("Compras_Productos.csv", "w+")
        csv.write("Producto,Precio,Cantidades,Importe_total\n")
        cur = con.cursor()
        cur.execute("SELECT cdgproducto,precio,sum(cantidad),sum(importecompra) from compras group by cdgproducto ");
        rows = cur.fetchall()
        print(rows)
        for i in rows :
            csv.write(str(i[0])+","+str(i[1])+","+str(i[2])+","+str(i[3])+"\n")
        csv.close(); 
    except sqlite3.OperationalError:       
        print("ERROR")
        
        
con = sql_connection("bd_compras.db")
sql_creartabla(con)
sql_insertardatos(con)
sql_update(con)
sql_excel_proveedor(con)
sql_excel_compras(con)
con.close() 
        
        
        
        
        
        
        