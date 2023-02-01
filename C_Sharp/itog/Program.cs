string[] array = GetArray();
array = GetArrayThreeCharacter(array);
PrintArray(array);

string[] GetArray()
{
    Console.Write("Введите длинну массива :");
    int len = int.Parse(Console.ReadLine());

    string[] array = new string[len];

    for (int i = 0; i < len; i++)
    {
        Console.Write($"Введите {i + 1} строку :");
        array[i] = Console.ReadLine();
    }
    return array;
}

string[] GetArrayThreeCharacter(string[] array)
{
    string[] newArray = new string[array.Length];
    int j = 0;

    for (int i = 0; i < array.Length; i++)
    {
        if (array[i].Length > 3)
        {
            continue;
        }
        newArray[j] = array[i];
        j += 1;
    }

    string[] resArray = new string[j];

    for (int i = 0; i < j; i++)
    {
        resArray[i] = newArray[i];
    }
    return resArray;
}

void PrintArray(string[] array)
{
    Console.WriteLine("Итоговый массив:");
    foreach (var item in array)
    {
        Console.WriteLine(item);
    }
}