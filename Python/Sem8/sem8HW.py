# Создать телефонный справочник с
# возможностью импорта и экспорта данных в
# формате .txt. Фамилия, имя, отчество, номер
# телефона - данные, которые должны находиться
# в файле.
import os.path

def change_name_file():
    return input("Введите навание файла ")

# 1. Программа должна выводить данные

def print_file_data():
    global name_file
    print(" ")
    if os.path.exists(name_file):
        with open(name_file, 'r', encoding="UTF-8") as data:
            for line in data:
                print(line,end='')
    else:
        print(f"Файл {name_file} не найден")
    print(" ")
    main_menu()

# 2. Программа должна сохранять данные в
# текстовом файле

def print_idx_lines():
    global name_file
    lines=[]
    with open(name_file, 'r', encoding="UTF-8") as data:
        print("0: Отмена")
        idx=1
        for line in data:
            print(f"{idx}: {line}", end='')
            idx+=1
            lines.append(line)
    return lines

def change_file_menu():
    print("1. Добавить строку")
    print("2. Удалить строку")
    print("3. Изменить сроку")
    print("0. Назад")
    choice=int(input())
    if choice==1:
        add_line()
    elif choice==2:
        del_line()
    elif choice==3:
        change_line()
    elif choice==0:
        main_menu()

def add_line():
    global name_file
    fam=input("Фамилия: ")
    name=input("Имя: ")
    last_name=input("Отчество: ")
    num=input("Номер телефона: ")
    line=fam+" "+name+" "+last_name+" "+num+"\n"
    with open(name_file, 'a', encoding="UTF-8") as data:
        data.writelines(line)
    change_file_menu()

def del_line():
    global name_file
    lines=print_idx_lines()
    num=int(input("Введите номер удаляемой строки: "))
    if num>0 and num-1<len(lines):
        lines.pop(num-1)
    with open(name_file, 'w', encoding="UTF-8") as data:
        for line in lines:
            data.writelines(line)
    change_file_menu()
    
def change_line():
    global name_file
    lines=print_idx_lines()
    num=int(input("Введите номер изменяемой строки: "))
    if num>0 and num-1<len(lines):
        text=lines[num-1].split()
        
        print("Изменяемая строка:")
        print(text[0]+" "+text[1]+" "+text[2]+" "+text[3])
        print("Редактирование")
        print("1. Фамилии")
        print("2. Имени")
        print("3. Отчества")
        print("4. Номера телефона")
        print("0. Отмена")
        
        choice=int(input())
        
        if choice==1: 
            buf=input("Введите фамилию: ")           
            text=buf+" "+text[1]+" "+text[2]+" "+text[3]+"\n"
        elif choice==2:
            buf=input("Введите имя: ") 
            text=text[0]+" "+buf+" "+text[2]+" "+text[3]+"\n"
        elif choice==3:
            buf=input("Введите отчество: ") 
            text=text[0]+" "+text[1]+" "+buf+" "+text[3]+"\n"
        elif choice==4:
            buf=input("Введите номер телефона: ") 
            text=text[0]+" "+text[1]+" "+text[2]+" "+buf+"\n"
        elif choice==0:
            text=text[0]+" "+text[1]+" "+text[2]+" "+text[3]+"\n"
        lines[num-1]=text
        with open(name_file, 'w', encoding="UTF-8") as data:
            for line in lines:
                data.writelines(line)
    change_file_menu()

# 3. Пользователь может ввести одну из
# характеристик для поиска определенной
# записи(Например имя или фамилию
# человека)

def search_file_data():
    global name_file
    fam=[]
    name=[]
    last_name=[]
    num=[]
    lines=[]
    with open(name_file, 'r', encoding="UTF-8") as data:
        for line in data:
            lines.append(line.split())
            fam.append(line.split()[0])
            name.append(line.split()[1])
            last_name.append(line.split()[2])
            num.append(line.split()[3])
    print("Введите искомое:")
    buf=input()
    for text in lines:
        if buf in text:
            print(text[0]+" "+text[1]+" "+text[2]+" "+text[3])
            break
    else:
        print("Не найдено")
    # print("1. Фамилии")
    # print("2. Имени")
    # print("3. Отчеству")
    # print("4. Номеру телефона")
    # print("0. Назад")
    # choice=int(input())
    # if choice==1:
    #     buf=input("Введите искомую фамилию:\n")
    #     if fam.index(buf)>=0 and fam.index(buf)<len(lines):
    #         print(fam.index(buf))
    #     else:
    #         print("Фамилия не найдена")
        #print(lines[fam.index(buf)])
    main_menu()

# 4. Использование функций. Ваша программа
# не должна быть линейной

def main_menu():
    global name_file
    print(f"Название файла: {name_file}")
    print("1. Вывести данные из файла")
    print("2. Изменение файла")
    print("3. Изменить название файла")
    print("4. Поиск по файлу")
    print("0. Выход")
    choice=int(input())
    if choice==1:
        print_file_data()
    elif choice==2:
        change_file_menu()
    elif choice==3:
        name_file = change_name_file()
        main_menu()
    elif choice==4:
        search_file_data()
    else:
        pass


#name_file = change_name_file()
name_file="file.txt"
main_menu()
