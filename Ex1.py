#Lucas Dellatorre de Freitas

from random import randrange

random = randrange(1, 30+1)
print("Olá, vamos testar sua sorte. Informe um número no intevalo de [1,30] para tentar acertar o número secreto! (Obs: Você terá 5 tentativas)")

for cont in range(5, 0, -1):
    if cont == 1:
        n = int(input("Resta " + str(cont) + " tentativa: "))
    else:
        n = int(input("Restam " + str(cont) + " tentativas: "))
    if n<0 or n>30:
        while(n<0 or n>30):
            print("Informe um número no intervalo de [1,30]")
            if cont == 1:
                n = int(input("Resta " + str(cont) + " tentativa: "))
            else:
                n = int(input("Restam " + str(cont) + " tentativas: "))
    if random == n:
            print("Parabéns você ganhou!")
            break
    if cont == 1:
        print("Você perdeu 😭 O valor era: " + str(random))
        break 