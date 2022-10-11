using System;

namespace ReverseArray
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] arr = { 15, 16, 17, 18 };

            // Original Array
            Console.WriteLine("Original Array= ");
            foreach (int i in arr)
            {
                Console.WriteLine(i);
            }

            // Reverse Array
            Array.Reverse(arr);

            Console.WriteLine("Reversed Array= ");
            foreach (int j in arr)
            {
                Console.WriteLine(j);
            }
            Console.ReadLine();
        }
    }
    }