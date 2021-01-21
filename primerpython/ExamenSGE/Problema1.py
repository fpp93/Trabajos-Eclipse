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
        cur.execute("CREATE TABLE productos (id integer,nombre text PRIMARY KEY, preciocoste real, precioventa real, stockactual real)")
        cur.execute("CREATE TABLE stock(cdgproducto real,almacen text,stock real,FOREIGN KEY (cdgproducto) REFERENCES productos(id))")
        cur.execute("CREATE TABLE movimientos(id integer Primary KEY,fecha text,cdgproducto real,almacen text,tipo text,cantidad real,FOREIGN KEY (cdgproducto) REFERENCES productos(id))")
    
    except sqlite3.OperationalError:
        
        print("La tabla ya existe")
        
def sql_insertardatos(con):
    try:
        cur = con.cursor()
        productos = tuple()
        stock = tuple()
        movimientos = tuple()
        fichero = open("productos.txt", "r")
        fichero1 = open("stock.txt", "r")
        fichero2 = open("movimientos.txt", "r")
        for linea in fichero:
            productos=linea.split(",")
            print(productos)
            cur.execute("INSERT INTO productos values ("+productos[0]+","+str(productos[1])+","+productos[2]+ ","+productos[3]+","+productos[4]+")");
        fichero.close()
        for linea in fichero1:
            stock=linea.split(",")
            print("--------------")
            print(stock)
            cur.execute("INSERT INTO stock values ("+stock[0]+","+str(stock[1])+","+stock[2]+")");
        fichero.close()
        for linea in fichero2:
            movimientos=linea.split(",")
            print("--------------")
            print(movimientos)
            cur.execute("INSERT INTO movimientos values ("+movimientos[0]+","+str(movimientos[1])+","+movimientos[2]+","+str(movimientos[3])+","+str(movimientos[4])+","+movimientos[5]+")");
        fichero.close()
        
        con.commit()
        print("Se insertaron los datos correctamente")
        
    except sqlite3.OperationalError:
        print("Error en los datos")
        
def sql_select(sql,con):
    
        cur = con.cursor()
        cur.execute(sql)
        result=cur.fetchall()
        return result
        
        
con = sql_connection("ERP_FESAC.db")
sql_creartabla(con)
sql_insertardatos(con)
print(sql_select("select sum(cantidad) from movimientos where cdgproducto='tornillo128' and tipo='compra'",con))
con.close()