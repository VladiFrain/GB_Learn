Console.Write("Введите первое число: ");
int numberOne = int.Parse(Console.ReadLine());

Console.Write("Введите второе число: ");
int numberTwo = int.Parse(Console.ReadLine());

if(numberOne > numberTwo) 
    Console.WriteLine($"Первое число больше второго! max = {numberOne}");
else
    Console.WriteLine($"Второе число больше первого! max = {numberTwo}");