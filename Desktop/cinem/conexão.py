import sqlite3
from sqlite3 import Error
from classes.Cliente import Cliente
from classes.Combo import Combo

class conexao():
    #Faz a conexão com banco
    def __init__(self, db_file='BancoCinemaBD.db'):
        self.conn = sqlite3.connect(db_file)
    
