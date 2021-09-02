#Lucas Dellatorre de Freitas

from random import randrange

carta1Computador = randrange(1,12)
carta2Computador = randrange(1,12)
carta3Computador = randrange(1,12)
carta1Player = randrange(1,12)
carta2Player = randrange(1,12)


somaCartasComputador = carta1Computador + carta2Computador + carta3Computador

print("""Bem vindo ao Blackjack! O objetivo do jogo é somar suas cartas até 21, caso exceder, perde o jogo. Caso contrário, ganha quem se aproximar mais de 21.
Boa sorte!""")
print("carta 1 = " , carta1Player)
print("carta 2 = " , carta2Player)
print("A soma das duas cartas é igual a: " , (carta1Player + carta2Player))
novaCarta = input("Você deseja uma nova carta? (digite sim ou nao): ")
while novaCarta != "sim" and novaCarta != "nao":
    novaCarta = input("Você deseja uma nova carta? (digite sim ou nao): ")
if novaCarta == "sim":
    carta3Player = randrange(1,12)
    somaCartasPlayer = carta1Player + carta2Player + carta3Player
if novaCarta == "nao":
    somaCartasPlayer = carta1Player + carta2Player

if somaCartasPlayer > 21:
    ganhador = "computador"
else:
    if somaCartasComputador > 21:
        ganhador = "humano"
    else:
        if somaCartasComputador == somaCartasPlayer:
            ganhador = "computador"
        else:
            if somaCartasPlayer > somaCartasComputador:
                ganhador = "humano"
            else:
                ganhador = "computador"

if somaCartasPlayer == somaCartasComputador:
    print("Ocorreu um empate entre as cartas! Você perdeu de acordo com as regras 🙁")
else:
    if ganhador == "computador":
        print("Você perdeu 🙁 a soma de suas cartas era de" ,somaCartasPlayer,", já a soma das cartas do computador era de " , somaCartasComputador )
    else:
        print("Parabéns, você ganhou. A soma de suas cartas tinham o valor de" ,somaCartasPlayer,", já a soma das cartas do computador tinham o valor de" , somaCartasComputador)