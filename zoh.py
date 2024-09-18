import random

roll_again = "Y"
while roll_again == "Y":
    dice1 = random.randint(1, 6)
    dice2 = random.randint(1, 6)
    print(f"Dado1: {dice1} \n Dado2 {dice2} ")
    roll_again = input("roll the dice agin? Y/N")
