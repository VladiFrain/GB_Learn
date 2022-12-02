// Задача 38: Задайте массив вещественных чисел. 
// Найдите разницу между максимальным и минимальным элементов массива.
// [3 7 22 2 78] -> 76

double[] arr = FillArray(10);
PrintArray(arr);
Console.WriteLine(GetDiffMaxMin(arr));

double GetDiffMaxMin(double[] arr)
{
    double max = arr[0];
    double min = arr[0];
    for (int i = 1; i < arr.Length; i++)
    {
        if (max < arr[i])
        {
            max = arr[i];
        }
        if (min > arr[i])
        {
            min = arr[i];
        }
    }

    return max - min;
}

double[] FillArray(int length) 
{ 
    double[] result = new double[length]; 
    var rnd = new Random();
    for(int i = 0; i < result.Length; i++) 
    { 
        result[i] = Math.Round(rnd.Next(0, 100) * rnd.NextDouble(), 2); 
    } 
    
    return result; 
} 

void PrintArray(double[] arr)
{ 
    for(int i = 0; i < arr.Length; i++) 
    { 
        Console.Write($"{arr[i]} "); 
    } 
    Console.WriteLine();
} 