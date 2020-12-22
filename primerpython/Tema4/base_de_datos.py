'''
Created on 14 dic. 2020

@author: Francisco
'''
import sqlite3
from Tema4.db_conn2 import sql_connection,sql_crearTabla, sql_insertar,sql_Actualizar,\
    suma_sueldos,sql_del,sql_insert_txt
    

con = sql_connection("prueba.db")

#sql_crearTabla(con)
#sql_insertar(con)
#sql_Actualizar(con)
#suma_sueldos(con)
#sql_del(con)
sql_insert_txt(con)