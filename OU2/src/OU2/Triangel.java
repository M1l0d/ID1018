package OU2;

class Triangel {

        // Metoden omkrets tar emot triangelns tre sidor och returnerar triangelns omkrets
        public static double omkrets(double a, double b, double c) {
            double omkrets = a + b + c;
            return omkrets;
        }

        // Metoden area tar emot triangelns tre sidor och returnerar triangelns area
        public static double area(double a, double b, double c) {
            double semiperimeter = ((a + b + c)/2);
            double s = semiperimeter;
            double area = Math.sqrt((s*(s-a)*(s-b)*(s-c)));
            return area;
        }

        // Metoden omkrets tar emot två av triangelns sidor samt en vinkel och returnerar en av triangelns bisektriser
        public static double bisektris(double sida1, double sida2, double vinkel) {
            double p = 2 * sida1 * sida2 * Math.cos(vinkel/2);
            double bisektris = p/(sida2+sida1);
            return bisektris;
        }

        // Metoden median tar emot triangelns tre sidor och returnerar medianen på en sida
        public static double median(double sida1, double sida2, double sida3) {
            double median = (Math.sqrt((2*Math.pow(sida2,2)) + (2*Math.pow(sida3,2)) - (Math.pow(sida1,2))))/2;
            return median;
        }

        // Metoden radieOmskriven tar emot triangelns tre sidor och returnerar den omskrivna cirkelns radie
        public static double radieOmskriven(double a, double b, double c) {
            double semiperimeter = ((a + b + c)/2);
            double s = semiperimeter;
            double radie = (a*b*c)/(4*Math.sqrt(s*(s - a)*(s - b)*(s - c)));
            return radie;
        }

        // Metoden radieInskriven tar emot triangelns tre sidor och returnerar den inskrivna cirkelns radie
        public static double radieInskriven(double a, double b, double c) {
            double semiperimeter = ((a + b + c)/2);
            double s = semiperimeter;
            double radie = Math.sqrt((s - a)*(s - b)*(s - c)/s);
            return radie;
        }
}
