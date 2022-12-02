// Задача 38: Задайте массив вещественных чисел. 
// Найдите разницу между максимальным и минимальным элементов массива.
// [3 7 22 2 78] -> 76

double[] arr = FillArray(10);
PrintArray(arr);
Console.WriteLine(GetDiffMaxMin(arr));

double GetDiffMaxMin(double[] arr)
{
    return GetMax(arr) - GetMin(arr);
}

double GetMax(double[] arr)
{
    double max = arr[0];
    foreach (var item in arr)
    {
        if (max < item)
        {
            max = item;
        }
    }

    return max;
}

double GetMin(double[] arr)
{
    double min = arr[0];
    foreach (var item in arr)
    {
        if (min > item)
        {
            min = item;
        }
    }
    
    return min;
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