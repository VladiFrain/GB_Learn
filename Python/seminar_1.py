'''
Задача 2: Найдите сумму цифр трехзначного числа.
123 -> 6 (1 + 2 + 3)
100 -> 1 (1 + 0 + 0)
'''

number = int(input())
a = 0
while number > 0:
    a += number % 10
    number = number // 10
print(a)

'''
Задача 4: Петя, Катя и Сережа делают из бумаги журавликов. 
Вместе они сделали S журавликов. Сколько журавликов сделал каждый ребенок, 
если известно, что Петя и Сережа сделали одинаковое количество журавликов, 
а Катя сделала в два раза больше журавликов, чем Петя и Сережа вместе?
6 -> 1  4  1
24 -> 4  16  4
60 -> 10  40  10
'''

s = int(input())
print(f'{s // 6} {s // 6 * 4} {s // 6}')

'''
Задача 6: Вы пользуетесь общественным транспортом? Вероятно, 
вы расплачивались за проезд и получали билет с номером. 
Счастливым билетом называют такой билет с шестизначным номером, 
где сумма первых трех цифр равна сумме последних трех. 
Т.е. билет с номером 385916 – счастливый, т.к. 3+8+5=9+1+6. 
Вам требуется написать программу, которая проверяет счастливость билета.
385916 -> yes
123456 -> no
'''

number = int(input())
left = number // 1000
right = number % 1000
sum_left = 0
sum_right = 0
while left > 0:
    sum_left += left % 10
    left //= 10
while right > 0:
    sum_right += right % 10
    right //= 10
if sum_left == sum_right:
    print('yes')
else:
    print('no')

'''
Задача 8: Требуется определить, можно ли от шоколадки размером n × m долек 
отломить k долек, если разрешается сделать один разлом по прямой между дольками 
(то есть разломить шоколадку на два прямоугольника).
3 2 4 -> yes
3 2 1 -> no
'''

n = int(input())
m = int(input())
k = int(input())
if k < n * m and (k % n == 0 or k % m == 0):
    print('yes')
else:
    print('no')