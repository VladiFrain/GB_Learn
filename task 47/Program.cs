// Задача 47. Задайте двумерный массив размером m×n, заполненный случайными вещественными числами.
// m = 3, n = 4.
// 0,5 7 -2 -0,2
// 1 -3,3 8 -9,9
// 8 7,8 -7,1 9

System.Console.Write("Введите количество строк: ");
int row = int.Parse(Console.ReadLine());

System.Console.Write("Введите количество столбцов: ");
int col = int.Parse(Console.ReadLine());

PrintArray(FillArray(row, col));

double[,] FillArray(int row, int col)
{
    var rand = new Random();
    double[,] arr = new double[row, col];
    for (int i = 0; i < arr.GetLength(0); i++)
    {
        for (int j = 0; j < arr.GetLength(1); j++)
        {
            arr[i, j] = Math.Round(rand.Next(-10, 10) + rand.NextDouble(), 1);
        }
    }

    return arr;
}

void PrintArray(double[,] arr)
{
    for (int i = 0; i < arr.GetLength(0); i++)
    {
        for (int j = 0; j < arr.GetLength(1); j++)
        {
            Console.Write($"{arr[i, j]}\t");
        }
        Console.WriteLine();
    }
    Console.WriteLine();
}