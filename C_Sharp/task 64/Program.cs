// Задача 64: Задайте значение N. Напишите программу, которая выведет все натуральные числа в промежутке от N до 1. Выполнить с помощью рекурсии.
// N = 5 -> "5, 4, 3, 2, 1"
// N = 8 -> "8, 7, 6, 5, 4, 3, 2, 1"

Console.WriteLine(GetNumBetween(8, 1));

string GetNumBetween(int start, int stop)
{
    if (start == stop)
    {
        return start.ToString();
    }
    return $"{start.ToString()},  {GetNumBetween(--start, stop)}";
}