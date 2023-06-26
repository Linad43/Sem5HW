num_1=int(input("Введите факториал:"))
sum=1
num=num_1
while num>1:
    sum*=num
    num-=1
print(f"{num_1}!={sum}")


num=int(input("Введите число:"))
i=1
fib1=0
fib2=1
flag=-1
while num>=fib1:
    if num == fib1:
        print(f"{num} -> {i}")
        flag=0
        break
    else:
        fib1,fib2=fib2,fib1 + fib2
        i+=1

if flag==-1:
    print("Данное число не попадает в ряд Фиббоначи")


num=int(input("Введите N дней:"))
j=0
itog=0
for i in range(0,num):
    N=int(input())
    if N>0:
        j+=1
    else:
        if j>itog:
            itog=j
        j=0
print(itog)



num=int(input("Введите N арбузов:"))
N=int(input())
min=N
max=N
for i in range(1,num):
    N=int(input())
    if N>max:
        max=N
    if N<min:
        min=N
print(f"min={min} max={max}")


a=int(input("A="))
b=int(input("B="))
if b>a:
    b,a=a,b
for i in range(a,a*b+1):
    if i%a==0 and i%b==0:
        print(f"{i} - НОК")
        break
for i in range(a,0,-1):
    if a%i==0 and b%i==0:
        print(f"{i} - НОД")
        break

