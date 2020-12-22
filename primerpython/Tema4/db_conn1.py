'''
Created on 14 dic. 2020

@author: Francisco
'''
import sqlite3
from sqlite3 import Error

def sql_connection(filename):
    try:
        con = sqlite3.connect(filename)
        print("Conexion a",filename)
    except Error:
        print(Error)
        con=None
    finally:
        return con
    
def sql_crearTabla(con):
    try:
        cur = con.cursor()
        cur.execute("CREATE TABLE productos(id integer Primary KEY,nombre text,precioventa real,preciocoste real,stockactual integer)")
        cur.execute("CREATE TABLE stock(id integer Primary KEY,cdgproducto integer,almacen text,stock integer,FOREIGN KEY (cdgproducto) REFERENCES productos(id))")
        cur.execute("CREATE TABLE ventas(id integer Primary KEY,codigo_producto integer,cantidad integer,ciudad text,importe real,precio real,FOREIGN KEY (codigo_producto) REFERENCES productos(id))")
        con.commit()
        print("Tablas creadas correctamente")
        
    except sqlite3.OperationalError:
        print("error en tablas")
        
def sql_insertar(con):
    try:
        cur = con.cursor()
        cur.execute("INSERT INTO productos VALUES(1,'mesa',15,10,10)")
        cur.execute("INSERT INTO productos VALUES(2,'silla',18,13,20)")
        cur.execute("INSERT INTO productos VALUES(3,'lampara',21,17,5)")
        cur.execute("INSERT INTO productos VALUES(4,'estanteria',24,19,25)")
        
        cur.execute("INSERT INTO ventas VALUES(1,1,100,'Huelva',NULL,15)")
        cur.execute("INSERT INTO ventas VALUES(2,1,100,'Sevilla',NULL,15)")
        cur.execute("INSERT INTO ventas VALUES(3,2,100,'Sevilla',NULL,18)")
        cur.execute("INSERT INTO ventas VALUES(4,2,100,'Sevilla',NULL,18)")
        cur.execute("INSERT INTO ventas VALUES(5,2,100,'Huelva',NULL,18)")
        cur.execute("INSERT INTO ventas VALUES(6,3,100,'Sevilla',NULL,21)")
        cur.execute("INSERT INTO ventas VALUES(7,3,100,'Cordoba',NULL,21)")
        cur.execute("INSERT INTO ventas VALUES(8,4,100,'Sevilla',NULL,24)")
        cur.execute("INSERT INTO ventas VALUES(9,4,100,'Huelva',NULL,24)")
        cur.execute("INSERT INTO ventas VALUES(10,4,100,'Cordoba',NULL,24)")
        con.commit()
        print("datos insertados correctamente")
        
    except sqlite3.OperationalError:
        print("error de insercion")
        
def calcular_importe(con):
    try:
        cur = con.cursor()
        cur.execute("SELECT (precio*cantidad) from ventas")
        rows=cur.fetchall()
        for row in rows:
            print(row)
        
       
    except sqlite3.OperationalError:
        print("error en select")
        
def importe_ciudad(con):
    try:
        cur = con.cursor()
        cur.execute("SELECT SUM(precio*cantidad) from ventas where ciudad='Sevilla'")
        rows=cur.fetchall()
        print("importe total en Sevilla:",rows)
        
        cur.execute("SELECT SUM(precio*cantidad) from ventas where ciudad='Huelva'")
        rows=cur.fetchall()
        print("importe total en Huelva:",rows)
        
       
    except sqlite3.OperationalError:
        print("error en select")
    
        
        
        
        
        
        
        
        