
class Sessão:
    def __init__(self, filmeId, capacidade):
        self.filmeId = filmeId
        self.capacidade = capacidade

    def getFilmeId(self):
        return self.__filmeId
    def setFilmeId(self, filmeId):
        self.__filmeId = filmeId
    def getCapacidade(self):
        return self.__capacidade
    def setCapacidade(self, capacidade):
        self.__capacidade = capacidade