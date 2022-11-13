Console.Write("Введите первое число: ");
int numberOne = int.Parse(Console.ReadLine());

Console.Write("Введите второе число: ");
int numberTwo = int.Parse(Console.ReadLine());

Console.Write("Введите третье число: ");
int numberThree = int.Parse(Console.ReadLine());

if (numberOne > numberTwo && numberOne > numberThree)
    Console.WriteLine($"Первое число самое большое! max = {numberOne}");
else if (numberTwo > numberThree)
    Console.WriteLine($"Второе число самое большое! max = {numberTwo}");
else 
    Console.WriteLine($"Третье число самое большое! max = {numberThree}");