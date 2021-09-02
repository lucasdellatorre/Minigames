#Lucas Dellatorre de Freitas

from random import randrange
random = randrange(0, 10)
e = input("Escolha entre par ou impar (digíte par ou impar): ")
while e != "impar" and e != "par":
    e = input("Escolha entre par ou impar (digíte par ou impar): ")

n = int(input("Escolha um valor entre 0 e 9: "))
while n<0 or n>9:
    n = int(input("Escolha um valor entre 0 e 9: "))
r = random + n
print("Você escolheu: " + str(n))
print("O computador escolheu: " + str(random))

if r % 2 == 0:
    if e == "par":
        print("Você venceu!")
    else:
        print("O computador venceu!")
else:
    if e == "impar":
        print("Você venceu!")
    else:
        print("O computador venceu!")

