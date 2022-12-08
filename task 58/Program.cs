// Задача 58: Задайте две матрицы. Напишите программу, которая будет 
//находить произведение двух матриц.
// Например, даны 2 матрицы:
// 2 4 | 3 4
// 3 2 | 3 3
// Результирующая матрица будет:
// 18 20
// 15 18

int[,] mat1 = 
{
    {2, 4},
    {3, 2}
};
int[,] mat2 = {
    {3, 4},
    {3, 3}
};
PrintMatrix(SumMatrix(mat1, mat2));

int[,] SumMatrix(int[,] mat1, int[,] mat2)
{
    int[,] result = new int[mat1.GetLength(0), mat1.GetLength(1)];
    result[0, 0] = mat1[0, 0] * mat2[0, 0] + mat1[0, 1] * mat2[1, 0];
    result[0, 1] = mat1[0, 0] * mat2[0, 1] + mat1[0, 1] * mat2[1, 1];
    result[1, 0] = mat1[1, 0] * mat2[0, 0] + mat1[1, 1] * mat2[1, 0];
    result[1, 1] = mat1[1, 0] * mat2[0, 1] + mat1[1, 1] * mat2[1, 1];

    return result;
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