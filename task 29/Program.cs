/*Задача 29: Напишите программу, которая задаёт массив из 8 элементов и выводит их на экран.
от одного до ста
1, 2, 5, 7, 19 -> [1, 2, 5, 7, 19]

6, 1, 33 -> [6, 1, 33]*/

PrintArray(FillArray(new Random().Next(8, 100))); 

int[] FillArray(int length) 
{ 
    int[] result = new int[length]; 
    for(int i = 0; i < result.Length; i++) 
    { 
        result[i] = new Random().Next(1, 100); 
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