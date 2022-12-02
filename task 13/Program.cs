/*Задача 13: Напишите программу, которая выводит третью цифру заданного числа или сообщает, что третьей цифры нет.

645 -> 5

78 -> третьей цифры нет

32679 -> 6*/

Console.Write("Введите число: ");
int num = int.Parse(Console.ReadLine());

if (num < 100)
{
    Console.WriteLine("Третьей цифры нет!");
}
else
{
    while (num > 1000)
    {
        num /= 10;        
    }
    Console.WriteLine(num % 10);
}