﻿Console.Write("Введите число: ");
int number = int.Parse(Console.ReadLine());

for (int i = 2; i <= number; i += 2)
{
    if (i % 2 == 0)
        Console.WriteLine(i);
}
