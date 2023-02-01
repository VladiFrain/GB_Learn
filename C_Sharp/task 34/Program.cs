// Задача 34: Задайте массив заполненный случайными положительными трёхзначными числами. 
// Напишите программу, которая покажет количество чётных чисел в массиве.
// [345, 897, 568, 234] -> 2

int[] arr = FillArray(12);
PrintArray(arr);
Console.WriteLine(GetNumEvenNum(arr));

int GetNumEvenNum(int[] arr)
{
    int count = 0;
    foreach (var item in arr)
    {
        if (item % 2 == 0)
        {
            count++;
        }
    }

    return count;
}

int[] FillArray(int length) 
{ 
    int[] result = new int[length]; 
    for(int i = 0; i < result.Length; i++) 
    { 
        result[i] = new Random().Next(100, 1000); 
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