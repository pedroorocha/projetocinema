from classes.Filmegenero import filmeGenero
from conexão import conexao

class FilmeGeneroDAO:
    def __init__(self):
        None
    #seleciona todos o elementos no tabela FilmeGenero e retorna uma lista de objetos FilmeGenero
    def inicia(self):
        c = conexao()
        sql = "SELECT * FROM filmeGenero"
        cursor = c.conn.execute(sql)
        filmeGeneros = []
        for row in cursor.fetchall():
            filmegenero = filmeGenero(row[0], row[1])
            filmeGeneros.append(filmegenero)
        return filmeGeneros