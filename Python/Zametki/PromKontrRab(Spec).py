import json
import os.path
import datetime

def printInJSON(key, value, nameFile):
    value = value + " " + str(datetime.datetime.now())
    try:
        with open(nameFile, 'r') as file:
            data = json.load(file)
        if checkKey(data, key):
            print("Заметка с таким именем уже существует")
            print(" 1. Добавить описание к существующей")
            print(" 2. Переписать описание заметки")
            print(" 0. Отмена")
            choise = input()
            if choise=="1":
                data[key]=[data[key], value]
                with open(nameFile, 'w') as fileIn:
                    json.dump(data, fileIn, indent = 4, sort_keys=True)
            elif choise=="2":
                data[key]=value
                with open(nameFile, 'w') as fileIn:
                    json.dump(data, fileIn, indent = 4, sort_keys=True)
        else:
            data.update({key:value})
            with open(nameFile, 'w') as fileIn:
                json.dump(data, fileIn, indent = 4, sort_keys=True)
    except:
        data = {key : value}
        with open(nameFile, 'w') as fileIn:
                json.dump(data, fileIn, indent = 4, sort_keys=True)
        
def createNote():
    print("Введите название заметки:")
    name = input()
    print("Введите описание заметки:")
    key = input()
    printInJSON(name,key,nameFile)

def readNote():
    print("Ваши заметки:")
    try:
        with open(nameFile, 'r') as file:
            data = json.load(file)
        print(json.dumps(data, indent = 4, sort_keys=True))
    except:
        print("У вас нет заметок")
        
def checkKey(data, key):
    if key in data:
        return True
    else:
        return False
    
def readNote():
    try:
        with open(nameFile, 'r') as file:
            data = json.load(file)
        print(json.dumps(data, indent = 4, sort_keys=True))
    except:
        print("У вас нет заметок")

def redactNote():
    try:
        with open(nameFile, 'r') as file:
            data = json.load(file)
        print(json.dumps(data, indent = 4, sort_keys=True))
        createNote()
    except:
        print("У вас нет заметок")

def delNote():
    try:
        with open(nameFile, 'r') as file:
            data = json.load(file)
        print("Введите название заметки которую нужно удалить")
        key = input()
        if checkKey(data, key):
            data.pop(key)
            with open(nameFile, 'w') as fileIn:
                json.dump(data, fileIn, indent = 4, sort_keys=True)
        else:
            print("Такой заметки не существует")
    except IOError as e:
        print("У вас нет заметок")

nameFile = "Note.json"
flag = True

while(flag):
    print("Программа для заметок")
    print(" 1. Создать заметку")
    print(" 2. Чтение заметок")
    print(" 3. Редактирование заметки")
    print(" 4. Удаление заметки")
    print("0. Выход")

    choise = input()

    if choise == "1":
        createNote()
    if choise == "2":
        readNote()
    if choise == "3":
        redactNote()
    if choise == "4":
        delNote()
    if choise == "0":
        flag = False