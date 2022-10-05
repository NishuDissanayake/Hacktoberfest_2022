using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AreaOfTrapezoid
{
    public class Calculation
    {
        public double ubase { get; set; }
        public double lbase { get; set; }
        public double height { get; set; }

        public double AreaOfTrapezoid()
        {
            double area = (ubase + lbase) / 2 * height;

            return area;
        }
    }
}
