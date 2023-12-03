from classes.Combo import Combo
from conexão import conexao
class ComboDAO:
    def __init__(self):
        None
    #seleciona todos o elementos na tabela Combo e retorna uma lista de objetos Combo
    def inicia(self):
        c = conexao()
        sql = 'SELECT * FROM Combo'
        cursor = c.conn.execute(sql)
        combos = []
        for row in cursor.fetchall():
            combo = Combo(row[0], row[1], row[2], row[3])
            combos.append(combo)
        return combos