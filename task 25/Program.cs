/*Задача 25: Напишите цикл, который принимает на вход два числа (A и B) и возводит число A в
 натуральную степень B.

3, 5 -> 243 (3⁵)

2, 4 -> 16*/

Console.Write("Введите число: ");
int num = int.Parse(Console.ReadLine());

Console.Write("Введите степень: ");
int extent = int.Parse(Console.ReadLine());

int result = RaiseToExtent(num, extent);

Console.WriteLine(result);

int RaiseToExtent(int num, int extent)
{
    int result = 1;
    for (int i = extent; i > 0; i--)
    {
        result *= num;
        extent--;        
    }
    return result;
}