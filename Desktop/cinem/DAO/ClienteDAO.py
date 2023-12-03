from classes.Cliente import Cliente
from conexão import conexao
class ClienteDAO:
    def __init__(self):
        None
    #seleciona todos o elementos na tabela Cliente e retorna uma lista de objetos Cliente
    def inicia(self):
        c = conexao()
        sql = 'SELECT * FROM Cliente'
        cursor = c.conn.execute(sql)
        clientes = []
        for row in cursor.fetchall():
            cliente = Cliente(row[0], row[1], row[2], row[3], row[4], row[5], row[6])
            clientes.append(cliente)
        return clientes

        
