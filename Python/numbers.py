import random
list1 = []
list2 = []
list3 = []

for i in range(15):
    list1.append(random.randint(0, 100))
    list2.append(random.randint(0, 100))
    list3.append(random.randint(0, 100))

def even_numbers(list):
    count_uneven = 0
    
    for number in list:
        if number % 2 == 1:
            count_uneven += 1
        if number % 2 == 0:
            print(number)
    count_string = "Uneven numbers: " + str(count_uneven)

    return count_string

print(even_numbers(list1))