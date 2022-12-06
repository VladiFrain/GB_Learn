// Задача 50. Напишите программу, которая на вход принимает позиции элемента в двумерном массиве, 
// и возвращает значение этого элемента или же указание, что такого элемента нет.
// Например, задан массив:
// 1 4 7 2
// 5 9 2 3
// 8 4 2 4
// 17 -> такого числа в массиве нет

FindArray(FillArray(3, 4), 8);

void FindArray(int[,] arr, int num)
{
    int find = 0;
    for (int i = 0; i < arr.GetLength(0); i++)
    {
        for (int j = 0; j < arr.GetLength(1); j++)
        {
            if (arr[i, j] == num)
            {
                Console.WriteLine($"{arr[i, j]}");
                find++;
            }            
        }
    }
    if (find == 0)
    {
        Console.WriteLine("Такого числа в массиве нет!");
    }
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