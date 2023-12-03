from classes.Genero import Genero
from conexão import conexao
class GeneroDAO:
    def __init__(self):
        None
    #seleciona todos o elementos no tabela Genero e retorna uma lista de objetos Genero
    def inicia():
        c = conexao()
        sql = "SELECT * FROM Genero"
        cursor = c.conn.execute(sql)
        generos = []
        for row in cursor.fetchall():
            genero = Genero(row[0],row[1], row[2])
            generos.append(genero)
        return generos
