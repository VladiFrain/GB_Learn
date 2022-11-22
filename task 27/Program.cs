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
    int count = 0;
    int temp = num;
    while (temp > 0)
    {
        temp /= 10;
        count++;
    }

    int result = 0;
    for (int i = 0; i < count; i++)
    {
        result += num % 10;
        num /= 10;
    }
    return result;
}