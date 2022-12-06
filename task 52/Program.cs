// Задача 52. Задайте двумерный массив из целых чисел. Найдите среднее арифметическое элементов в каждом столбце.
// Например, задан массив:
// 1 4 7 2
// 5 9 2 3
// 8 4 2 4
// Среднее арифметическое каждого столбца: 4,6; 5,6; 3,6; 3.

int[,] arr = FillArray(3, 2);
PrintArray(arr);
double[] res = ArithMeanColumn(arr);
for (int i = 0; i < res.Length; i++)
{
    Console.Write($"{res[i]}\t");
}

double[] ArithMeanColumn(int[,] arr)
{
    double[] arithMean = new double[arr.GetLength(1)];

    for (int i = 0; i < arr.GetLength(0); i++)
    {
        for (int j = 0; j < arr.GetLength(1); j++)
        {
            arithMean[j] += arr[i, j];
        }
    }

    for (int i = 0; i < arithMean.Length; i++)
    {
        arithMean[i] = Math.Round(arithMean[i] / arr.GetLength(0), 1);
    }
    
    return arithMean;
}

int[,] FillArray(int row, int col)
{
    int[,] arr = new int[row, col];
    var rnd = new Random();
    for (int i = 0; i < arr.GetLength(0); i++)
    {
        for (int j = 0; j < arr.GetLength(1); j++)
        {
            arr[i, j] = rnd.Next(0, 10);
        }
    }

    return arr;
}

void PrintArray(int[,] arr)
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