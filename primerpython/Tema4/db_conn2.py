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
        cur.execute("CREATE TABLE empleados(id integer Primary KEY,nombre text,salario real,departamento text,categoria text,fecha_contratacion text)")
        con.commit()
        print("Tabla creada correctamente")
        
    except sqlite3.OperationalError:
        print("La tabla ya existe")
        
def sql_insertar(con):
    try:
        cur = con.cursor()
        cur.execute("INSERT INTO empleados VALUES(001,'fran',1200,'1c','programador','01-07-2015')")
        cur.execute("INSERT INTO empleados VALUES(002,'jesus',1000,'1c','analista','01-07-2015')")
        cur.execute("INSERT INTO empleados VALUES(003,'santi',800,'1c','becario','01-07-2015')")
        cur.execute("INSERT INTO empleados VALUES(004,'ivan',1200,'1c','programador','15-03-2020')")
        cur.execute("INSERT INTO empleados VALUES(005,'gonzalo',1200,'1c','programador','15-03-2020')")
        cur.execute("INSERT INTO empleados VALUES(006,'javi',1200,'1c','programador','15-03-2020')")
        cur.execute("INSERT INTO empleados VALUES(007,'andrea',1200,'1c','programador','15-03-2020')")
        cur.execute("INSERT INTO empleados VALUES(008,'fran',800,'1c','becario','15-03-2020')")
        con.commit()
        print("datos insertados correctamente")
        
    except sqlite3.OperationalError:
        print("error de insercion")
                
def sql_Actualizar(con):
    try:
        cur = con.cursor()
        cur.execute("UPDATE empleados set categoria='programador',salario=1200,nombre='nico' WHERE id=008")
        con.commit()
        print("actualizacion realizada")
    except sqlite3.OperationalError:
        print("error de actualizacion")
        
def suma_sueldos(con):
    try:
        cur = con.cursor()
        cur.execute("SELECT SUM(salario) from empleados where categoria='programador'")
        suma=cur.fetchall()
        print("Suma de los sueldos de los programadores:",suma)
        cur.execute("SELECT SUM(salario) from empleados where categoria='analista'")
        suma=cur.fetchall()
        print("Suma de los sueldos de los analistas:",suma)
    except sqlite3.OperationalError:
        print("error en select")
        
def sql_del(con):
        cur = con.cursor()
        cur.execute("DELETE FROM empleados")  
        con.commit()  
        print("borrado con exito") 
        
def sql_insert_txt(con):
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
           
        
        
        
        
        