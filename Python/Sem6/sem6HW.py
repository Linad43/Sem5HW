# Задача 30: 
# Заполните массив элементами арифметической прогрессии.
# Её первый элемент, разность и количество элементов
# нужно ввести с клавиатуры.
# Формула для получения n-го члена прогрессии:
# an = a1 + (n-1) * d.
# Каждое число вводится с новой строки.

import random

def progr_arifm():
    print("Нахождение первых n - элементов арифметической прогресии:")
    print("Введите первый член арифметической прогресии")
    a_1=int(input("a_1 = "))
    print("Введите шаг арифметической прогресии")
    d=int(input("d = "))
    print("Сколько членов арифметической прогресии необходимо вывести")
    n=int(input("n = "))
    A=[]
    for i in range(n):
        #A[i]=a_1+i*d
        A.append(a_1+i*d)
    print(A)

# Задача 32: Определить индексы элементов массива (списка), 
# значения которых принадлежат заданному диапазону 
# (т.е. не меньше заданного минимума 
# и не больше заданного максимума)

def index_element():
    print("Нахождение индексов элементов в нужном диапазоне")
    N=random.randint(10,50)
    A=[]
    for i in range(N):
        A.append(random.randint(-10,10))
    print(A)
    print("Введите диапазон")
    max=int(input("max = "))
    min=int(input("min = "))
    B=[]
    flag=0
    for i in range(N):
        if A[i]>=min and A[i]<=max:
            B.append(i)
            flag=1
    print("Индексы элементов в нужном диапазоне:")
    if flag==1:
        print(B)
    elif flag==0:
        print("отсутствуют")
choice=1
while choice>0 and choice<=2:
    print("Выберите задачу")
    print("1. Задача 30")
    print("2. Задача 32")
    print(" ")
    print("0. Выход")
    choice=int(input())
    if choice == 1:
        progr_arifm()
    elif choice == 2:
        index_element()
    