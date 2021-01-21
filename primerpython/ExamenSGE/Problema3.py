'''
Created on 18 ene. 2021

@author: Francisco
'''
from ExamenSGE import db_class

db = db_class.DB("Ventas.db")

db.update("ventas", "importe=cantidad*precio")