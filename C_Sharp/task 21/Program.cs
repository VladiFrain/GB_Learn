/*Напишите программу, которая принимает на вход координаты двух точек и находит расстояние между ними в 3D пространстве.

A (3,6,8); B (2,1,-7), -> 15.84

A (7,-5, 0); B (1,-1,9) -> 11.53*/

using System;

namespace Application
{
    class Point {
        public Point(int x, int y, int z)
        {
            this.x = x;
            this.y = y;   
            this.z = z;         
        }
        public int x;
        public int y;
        public int z;
    }
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("ВВедите координату X первой точки: ");
            var aX = int.Parse(Console.ReadLine());

            Console.Write("ВВедите координату Y первой точки: ");
            var aY = int.Parse(Console.ReadLine());

            Console.Write("ВВедите координату Z первой точки: ");
            var aZ = int.Parse(Console.ReadLine());

            Console.Write("ВВедите координату X второй точки: ");
            var bX = int.Parse(Console.ReadLine());

            Console.Write("ВВедите координату Y второй точки: ");
            var bY = int.Parse(Console.ReadLine());

            Console.Write("ВВедите координату Z второй точки: ");
            var bZ = int.Parse(Console.ReadLine());

            var a = new Point(aX, aY, aZ);

            var b = new Point(bX, bY, bZ);

            var result = Math.Sqrt(Math.Pow((a.x-b.x), 2) + Math.Pow((a.y-b.y), 2) + Math.Pow((a.z-b.z), 2));

            Console.WriteLine(Math.Round(result, 2));
        }
    }
}

