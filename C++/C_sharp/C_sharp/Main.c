//#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#include <windows.h>
#include <locale.h>
#include <conio.h>
#include <math.h>

void square()
{
	printf("Программа для возведения числа во вторую степень\n");
	int num;
	printf("Введите число возводимое в квадрат:\n");
	scanf_s("%d", &num);
	printf("%d^2=%d", num, num * num);
}

void square_num()
{
	float a, b;
	printf("Программа определения являеться одно число\n");
	printf("квадратом другого\n");
	printf("Введите первое число: ");
	scanf_s("%f", &a);
	printf("Введите второе число: ");
	scanf_s("%f", &b);
	if (a * a == b) 
		printf("Второе число %f квадрат первого %f\n", b, a);
	else if (b * b == a) 
		printf("Первое число %f квадрат второго %f\n", a, b);
	else 
		printf("Числа %f и %f не являются квадратами\n", a, b);
}

void week()
{
	int num_week;
	char name_week[][15] = { "ПОНЕДЕЛЬНИК",
		"ВТОРНИК", "СРЕДА",
		"ЧЕТВЕРГ", "ПЯТНИЦА",
		"СУББОТА", "ВОСКРЕСЕНЬЕ" };
	printf("Введите номер дня недели: ");
	scanf_s("%d", &num_week);
	if (num_week > 0 && num_week <= 7)
		printf("По номеру %d - день недели %s\n",
			num_week, name_week[num_week - 1]);
	else
		printf("Не корректный ввод\n");
}

void progression()
{
	int n, i;
	printf("Вывод последовательности от -n до n\n");
	printf("Введите n(целое число): ");
	scanf_s("%d", &n);
	if (n < 0) n = -n;
	i = -n;
	while (i<=n)
	{
		if (i % 10 == 0 && i != n) 
			printf("%4d\n", i);
		else if (i != n) 
			printf("%4d,", i);
		else 
			printf("%4d", i);
		i++;
	}
}

void chet()
{
	int n;
	printf("Программа для вывода четных чисел от 1 до N\n");
	printf("Введите N: ");
	scanf_s("%d", &n);
	for (int i = 1; i <= n; i++)
	{
		if (i % 2 == 0)
			if (i % 10 == 0)
				printf("%4d\n", i);
			else
				printf("%4d", i);
	}
}

void third_num()
{
	printf("Программа для вывода третьей цифры заданного числа\n");
	printf("Введите число: ");
	int num, buf;
	scanf_s("%d", &num);
	if (num >= 100)
	{
		buf = (num % 1000) / 100;
		printf("Третье число с право %d\n", buf);
		buf = num;
		while (buf > 999)
		{
			buf /= 10;
		}
		buf %= 10;
		printf("Третье число с лево %d\n", buf);
	}
	else
		printf("Число состоит из менее чем трех цифр\n");
}

void palindrom()
{
	int num = 0, buf, count = 0, i = 0;
	boolean flag = 1;
	printf("Программа проверки на палиндром\n");
	printf("1. Ввести число\n");
	printf("2. Случайное число\n");
	while (flag)
	{
		scanf_s("%d", &buf);
		switch (buf)
		{
		case 1:
			printf("Введите число: ");
			scanf_s("%d", &num);
			flag = 0;
			break;
		case 2:
			num = rand();
			flag = 0;
			break;
		default:
			printf("Не корректный ввод, введите число 1 или 2\n");
			flag = 1;
			break;
		}
	}
	printf("Введенное число %d\n", num);
	buf = num;
	while (buf > 0)
	{
		buf /= 10;
		count++;
	}
	int left_num, right_num;
	flag = 1;
	while (i < count / 2)
	{
		left_num = (num / (int)pow(10, count - 1 - i)) % 10;
		right_num = (num % (int)pow(10, i + 1)) / (int)pow(10, i);
		if (left_num != right_num)
		{
			flag = 0;
		}
		i++;
	}
	if (flag)
		printf("Число %d является палиндромом\n", num);
	else
		printf("Число %d не является палиндромом\n", num);
}

/*
void data()
{
	int year, month, day;
	char buffer[128];
	//int count;
	//Требует форматированного ввода, например 2013:12:12
	printf("Введите дату в виде ГГГГ:ММ:ДД = ");
	scanf_s("%d:%d:%d", &year, &month, &day);
	printf("year = %d\nmonth = %d, day = %d\n", year, month, day);
	//Считываем строку, не более 127 символов. При считывании в массив писать & не надо,
	//так как массив подменяется указателем
	printf("Enter string = ");
	scanf_s("%127s", buffer, sizeof(buffer));
	printf("%s", buffer);
	//getch();
}
*/

int main()
{
	system("CLS");
	SetConsoleCP(1251);
	SetConsoleOutputCP(1251);
	setlocale(LC_ALL, "");
	boolean Flag = 1;
	int choise = 1;
	while (Flag)
	{
		printf("==Изучение языка СИ==\n");
		printf("1. Возведение в квадрат\n");
		printf("2. Проверка на квадрат одного числа к другому\n");
		printf("3. Вывод дня недели по номеру недели\n");
		printf("4. Вывод последовательности от -n до n\n");
		printf("5. Вывод четных чисел от 1 до N\n");
		printf("6. Вывод третьей цифры заданного числа\n");
		printf("7. Проверка на палиндром\n");
		printf("0. Выход\n");
		scanf_s("%d", &choise);
		system("CLS");
		switch (choise)
		{
		case 1:
			square();
			break;
		case 2:
			square_num();
			break;
		case 3:
			week();
			break;
		case 4:
			progression();
			break;
		case 5:
			chet();
			break;
		case 6:
			third_num();
			break;
		case 7:
			palindrom();
			break;
		default:
			break;
		}
		Flag = (choise <= 7 && choise >= 1);
		if (Flag)
			system("PAUSE >> nul");
		system("CLS");
	}
	return 0;
}