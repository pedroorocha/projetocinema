from conexão import conexao
from classes.Sessão import Sessão

class SessaoDAO:
    def __init__(self):
        None
    #seleciona todos o elementos no tabela Sessão e retorna uma lista de objetos Sessão
    def inicia(self):
        c = conexao()
        sql = "SELECT * FROM Sessao"
        cursor = c.conn.execute(sql)
        sessoes = []
        for row in cursor.fetchall():
            sessao = Sessão(row[0], row[1])
            sessoes.append(sessao)
        return sessoes