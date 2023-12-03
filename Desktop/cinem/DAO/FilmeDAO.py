from classes.Filme import Filme
from conexão import conexao
class FilmeDAO:
    def __init__(self):
        None
    #seleciona todos o elementos na tabela Filme e retorna uma lista de objetos Filmes
    def inicia(self):
        c= conexao()
        sql = "SELECT * FROM Filme"
        cursor = c.conn.execute(sql)
        filmes = []
        for row in cursor.fetchall():
            filme = Filme(row[0], row[1], row[2])
            filmes.append(filme)
        return filmes

