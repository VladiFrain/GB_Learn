/*Задача 27: Напишите программу, которая принимает на вход число и выдаёт сумму цифр в числе.

452 -> 11

82 -> 10

9012 -> 12*/

Console.Write("Введите число: ");
int num = int.Parse(Console.ReadLine());

int result = sumDigits(num);

Console.WriteLine(result);

int sumDigits(int num)
{
    return GetSum(num, GetLength(num));
}

int GetLength(int num)
{
    int length = 0;
    while (num > 0)
    {
        num /= 10;
        length++;
    }

    return length;
}

int GetSum(int num, int length)
{
    int result = 0;
    for (int i = 0; i < length; i++)
    {
        result += num % 10;
        num /= 10;        
    }

    return result;
}