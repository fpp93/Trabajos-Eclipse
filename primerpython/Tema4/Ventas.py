'''
Created on 14 dic. 2020

@author: Francisco
'''

import sqlite3
from Tema4.db_conn1 import sql_connection,sql_crearTabla,sql_insertar,calcular_importe,importe_ciudad

con = sql_connection("mi_erp.db")

#sql_crearTabla(con)
#sql_insertar(con)
calcular_importe(con)
importe_ciudad(con)
    
