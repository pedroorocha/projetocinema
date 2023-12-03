from classes.Ingresso import Ingresso
from conexão import conexao
class IngressoDAO:
    def __init__(self):
        None
    #seleciona todos o elementos no tabela Ingresso e retorna uma lista de objetos Igresso
    def inicia(self):
        c = conexao()
        sql = "SELECT * FROM Ingresso"
        cursor = c.conn.execute(sql)
        ingressos = []
        for row in cursor.fetchall():
            ingresso = Ingresso(row[0], row[1], row[2])
            ingressos.append(ingresso)
        return ingressos