/*Напишите программу, которая принимает на вход пятизначное число и проверяет, является ли оно палиндромом.

14212 -> нет

12821 -> да

23432 -> да*/

Console.Write("Введите пятизначное число: ");
var num = int.Parse(Console.ReadLine());

if (num < 10000 || num > 100000)
{
    Console.WriteLine("Число не является пятизначным!");
}
else 
{
    int[] numbers = new int[5];
    numbers[0] = num / 10000;
    numbers[1] = num % 10000 / 1000;
    numbers[2] = num % 1000 / 100;
    numbers[3] = num % 100 / 10;
    numbers[4] = num % 10;
    
    if (numbers[0] == numbers [4] && numbers[1] == numbers[3])
    {
        Console.WriteLine("Число является полиндромом");
    }
    else
    {
        Console.WriteLine("Число не является полиндромом");
    }
}