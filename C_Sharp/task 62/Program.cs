// Задача 62. Напишите программу, которая заполнит спирально массив 4 на 4.
// Например, на выходе получается вот такой массив:
// 01 02 03 04
// 12 13 14 05
// 11 16 15 06
// 10 09 08 07

PrintMatrix(FillSpiralArray(4, 4));

int[,] FillSpiralArray(int row, int col)
{
    int[,] matrix = new int[row, col];
    int iterator = 1;
    int stepRow = 0;
    int stepCol = 0;
    int sliderRow = 0;
    int sliderCol = 0;
    int endRow = 0;
    int endCol = 0;

    while (iterator <= row * col)
    {
        matrix[stepRow, stepCol] = iterator;
        if (stepRow == sliderRow && stepCol < col - endCol - 1)
        {
            ++stepCol;
        }
        else if (stepCol == col - endCol - 1 && stepRow < row - endRow - 1)
        {
            ++stepRow;
        }
        else if (stepRow == row - endRow - 1 && stepCol > sliderCol)
        {
            --stepCol;
        }
        else
        {
            --stepRow;
        }

        if ((stepRow == sliderRow + 1) && (stepCol == sliderCol) && (sliderCol != col - endCol - 1))
        {
            ++sliderRow;
            ++sliderCol;
            ++endRow;
            ++endCol;
        }
        ++iterator;
    }

    return matrix;
}

void PrintMatrix(int[,] arr)
{
    for (int i = 0; i < arr.GetLength(0); i++)
    {
        for (int j = 0; j < arr.GetLength(1); j++)
        {
            Console.Write($"{arr[i, j]}\t");
        }
        System.Console.WriteLine();
    }
}