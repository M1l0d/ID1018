package Triangel_Klass;

class Triangel {

        public static double Omkrets(double a, double b, double c) {
            double omkrets = a + b + c;
            return omkrets;
        }
        public static double Area(double a, double b, double c) {
            double semiperimeter = ((a + b + c)/2);
            double p = semiperimeter;
            double area = Math.sqrt((p*(p-a)*(p-b)*(p-c)));
            return area;
        }
        public static double BisektrisBC(double b, double c, double alfa) {
            double p = 2 * b * c * Math.cos(alfa/2);
            double bisektris = p/(b+c);
            return bisektris;
        }
        public static double BisektrisAC(double a, double c, double alfa) {
            double p = 2 * a * c * Math.cos(alfa/2);
            double bisektris = p/(a+c);
            return bisektris;
        }
        public static double BisektrisAB(double a, double b, double alfa) {
            double p = 2 * b * a * Math.cos(alfa/2);
            double bisektris = p/(b+a);
            return bisektris;
        }
        public static double MedianA(double a, double b, double c) {
            double median = (Math.sqrt((2*Math.pow(b,2)) + (2*Math.pow(c,2)) - (Math.pow(a,2))))/2;
            return median;
        }
        public static double MedianB(double a, double b, double c) {
            double median = (Math.sqrt((2*Math.pow(a,2)) + (2*Math.pow(c,2)) - (Math.pow(b,2))))/2;
            return median;
        }
        public static double MedianC(double a, double b, double c) {
            double median = (Math.sqrt((2*Math.pow(a,2)) + (2*Math.pow(b,2)) - (Math.pow(c,2))))/2;
            return median;
        }
        public static double RadieOmskriven(double a, double b, double c) {
            double semiperimeter = ((a + b + c)/2);
            double radie = (a*b*c)/(4*Math.sqrt(semiperimeter*(semiperimeter - a)*(semiperimeter - b)*(semiperimeter - c)));
            return radie;
        }
        public static double RadieInskriven(double a, double b, double c) {
            double semiperimeter = ((a + b + c)/2);
            double radie = Math.sqrt((semiperimeter - a)*(semiperimeter - b)*(semiperimeter - c)/semiperimeter);
            return radie;
        }
}
