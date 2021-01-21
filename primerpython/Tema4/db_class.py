'''
Created on 21 dic. 2020

@author: Francisco
'''
import sqlite3
from sqlite3 import Error

class DB:
    
    def __init__ (self, filename=":memory"):
        self.filename= filename
        try:
            con = sqlite3.connect(filename)
            print("Conexion a",filename)
        except Error:
            print(Error)
            con=None
        finally:
            return None
        
        
    def sql_crearTabla(self,con):
        try:
            cur = con.cursor()
            cur.execute("CREATE TABLE empleados(id integer Primary KEY,nombre text,salario real,departamento text,categoria text,fecha_contratacion text)")
            con.commit()
            print("Tabla creada correctamente")
        
        except sqlite3.OperationalError:
            print("La tabla ya existe")
            
    def sql_insertar(self,con):
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
            
    def sql_select(self,con,consulta):
        try:
            cur = con.cursor()
            cur.execute(consulta)
            data=cur.fetchall()
            return data
        
        except sqlite3.OperationalError:
            print("ERROR EN SELECT")
            
    
            
    def sql_del(self,con):
        cur = con.cursor()
        cur.execute("DELETE FROM empleados")  
        con.commit()      
            
            
            