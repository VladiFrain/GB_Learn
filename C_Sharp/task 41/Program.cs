// Задача 41: Пользователь вводит с клавиатуры M чисел. 
// Посчитайте, сколько чисел больше 0 ввёл пользователь.
// 0, 7, 8, -2, -2 -> 2
// 1, -7, 567, 89, 223-> 3

Console.Write("Пожалуйста выберите как будете вводить числа: 1 - через пробел, 2 - по очереди нажимая ENTER: ");
START:
int choice = int.Parse(Console.ReadLine());

switch (choice)
{
    case 1:
        Console.WriteLine(GetNumGreaterZero(NumViaSpace()));
        break;
    case 2:
        Console.WriteLine(GetNumGreaterZero(NumViaEnter()));
        break;
    default:
        Console.Write("Не верный выбор, повторите ввод: ");
        goto START;
}

int[] NumViaSpace()
{
    Console.Write("Вводите числа через пробел, как закончите нажмите ENTER: ");
    string numbers = Console.ReadLine();
    int[] arr = numbers.Split(' ').Select(int.Parse).ToArray();
    
    return arr;
}

int[] NumViaEnter()
{
    Console.Write("Введите количество чисел: ");
    int amount = int.Parse(Console.ReadLine());
    int[] arr = new int[amount];
    for (int i = 0; i < amount; i++)
    {
        Console.Write($"Введите {i + 1} число: ");
        arr[i] = int.Parse(Console.ReadLine());
    }

    return arr;
}

int GetNumGreaterZero(int[] arr)
{
    int count = 0;
    foreach (var item in arr)
    {
        if (item > 0)
        {
            count++;
        }
    }

    return count;
}