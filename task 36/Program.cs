// Задача 36: Задайте одномерный массив, заполненный случайными числами. 
// Найдите сумму элементов, стоящих на нечётных позициях.
// [3, 7, 23, 12] -> 19
// [-4, -6, 89, 6] -> 0

int[] arr = FillArray(12);
PrintArray(arr);
Console.WriteLine(GetSumInOddPos(arr));

int GetSumInOddPos(int[] arr)
{
    int sum = 0;
    for (int i = 1; i < arr.Length; i += 2)
    {
        sum += arr[i];
    }

    return sum;
}

int[] FillArray(int length) 
{ 
    int[] result = new int[length]; 
    for(int i = 0; i < result.Length; i++) 
    { 
        result[i] = new Random().Next(-100, 100); 
    } 
    
    return result; 
} 

void PrintArray(int[] arr)
{ 
    for(int i = 0; i < arr.Length; i++) 
    { 
        Console.Write($"{arr[i]} "); 
    } 
    Console.WriteLine();
} 