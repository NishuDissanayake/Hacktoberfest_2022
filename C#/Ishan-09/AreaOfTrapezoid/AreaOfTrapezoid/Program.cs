using AreaOfTrapezoid;

Calculation cal = new Calculation();

Console.WriteLine("Enter the lower base value of the Trapezoid : ");
cal.lbase = double.Parse(Console.ReadLine());

Console.WriteLine("Enter the upper base value of the Trapezoid : ");
cal.ubase = double.Parse(Console.ReadLine());

Console.WriteLine("Enter the height value of the Trapezoid : ");
cal.height = double.Parse(Console.ReadLine());

double area = cal.AreaOfTrapezoid();

Console.WriteLine($"The area of the Trapezoid : {area}");