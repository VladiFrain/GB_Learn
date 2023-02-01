// Задача 56: Задайте прямоугольный двумерный массив. Напишите программу, которая будет находить строку с наименьшей суммой элементов.
// Например, задан массив:
// 1 4 7 2
// 5 9 2 3
// 8 4 2 4
// 5 2 6 7
// Программа считает сумму элементов в каждой строке и выдаёт номер строки с наименьшей суммой элементов: 1 строка

int[,] arr = FillMatrix(4, 4);
PrintMatrix(arr);
FindRowSmallSumElem(SumElemRowMatrix(arr));

void FindRowSmallSumElem(int[] arr)
{
    int col = 1;
    int temp = arr[0];
    for (int i = 1; i < arr.Length; i++)
    {
        if (temp > arr[i])
        {
            temp = arr[i];
            col = i + 1;
        }
    }

    System.Console.WriteLine($"{col} строка");
}

int[] SumElemRowMatrix(int[,] arr)
{
    int[] sum = new int[arr.GetLength(0)];
    for (int i = 0; i < arr.GetLength(0); i++)
    {
        for (int j = 0; j < arr.GetLength(1); j++)
        {
            sum[i] += arr[i, j];
        }
    }

    return sum;
}

int[,] FillMatrix(int row, int col)
{
    int[,] arr = new int[row, col];
    var rnd = new Random();
    for (int i = 0; i < arr.GetLength(0); i++)
    {
        for (int j = 0; j < arr.GetLength(1); j++)
        {
            arr[i, j] = rnd.Next(1, 10);
        }
    }

    return arr;
}

void PrintMatrix(int[,] arr)
{
    for (int i = 0; i < arr.GetLength(0); i++)
    {
        for (int j = 0; j < arr.GetLength(1); j++)
        {
            Console.Write($"{arr[i, j]} ");
        }
        System.Console.WriteLine();
    }
}