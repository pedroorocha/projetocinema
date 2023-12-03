from classes.Sala import Sala
from conexão import conexao
class SalaDAO:
    def __init__(self):
        None
    #seleciona todos o elementos no tabela Sala e retorna uma lista de objetos Sala
    def inicia(self):
        c = conexao()
        sql="SELECT * FROM Sala"
        cursor = c.conn.execute(sql)
        salas = []
        for row in cursor.fetchall():
            sala = Sala(row[0], row[2])
            salas.append(sala)
        return salas
