// Задача 60. ...Сформируйте трёхмерный массив из неповторяющихся двузначных чисел. 
// Напишите программу, которая будет построчно выводить массив, добавляя индексы 
// каждого элемента.
// Массив размером 2 x 2 x 2
// 66(0,0,0) 25(0,1,0)
// 34(1,0,0) 41(1,1,0)
// 27(0,0,1) 90(0,1,1)
// 26(1,0,1) 55(1,1,1)

PrintCube(FillRandomCube(2, 2, 2, GetArrayRandValuesCube(2,2,2)));

int[,,] FillRandomCube(int length, int height, int width, int[] arrValues)
{
    int[,,] cube = new int[length, height, width];
    int count = 0;
    for (int i = 0; i < cube.GetLength(0); i++)
    {
        for (int j = 0; j < cube.GetLength(1); j++)
        {
            for (int k = 0; k < cube.GetLength(2); k++)
            {
                cube[i, j, k] = arrValues[count];
                count++;
            }
        }
    }

    return cube;
}

int[] GetArrayRandValuesCube(int length, int height, int width)
{
    var rnd = new Random();
    int[] values = new int[length * height * width];
    int temp = 0;
    for (int i = 0; i < values.Length; i++)
    {
        temp = rnd.Next(10, 99);
        for (int j = 0; j < i;)
        {
            if (temp != values[j])
            {
                j++;
            }
            else
            {
                temp = rnd.Next(10, 99);
                j = 0;
            }
        }
        values[i] = temp;
    }

    return values;
}

void PrintCube(int[,,] cube)
{
    for (int i = 0; i < cube.GetLength(0); i++)
    {
        for (int j = 0; j < cube.GetLength(1); j++)
        {
            for (int k = 0; k < cube.GetLength(2); k++)
            {
                Console.Write($"{cube[i, j, k]}({i}, {j}, {k}) ");
            }
            Console.WriteLine();
        }
    }
}