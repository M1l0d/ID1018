package Metoder;

import java.util.Locale;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static final double PI = 3.14; //Globalt värde: kan användas i vilken metod som helst och varsomhelst i hela programmet

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);


        /*System.out.println("main");
        int max = calculateMax(3, 66);  //Här avläser programmet koden i metoden calculateMax (den hoppar)


        System.out.println(max);           //Går tbaks till metoden main
        int a = in.nextInt();
        int b = in.nextInt();
        max = calculateMax(a, b);             //Går till metoden calculateMax igen
        System.out.println("main");           //Slutligen kommer tbaks till metoden main
        System.out.println(max);


    }
    public static int calculateMax(int m, int n) //parameterlista: "(int m, int n)"
        {
            int max = m;
            if (n > m)
                max = n;

            return max; //Ändrar "void" till "int" så "return" funkar */
        int[] u = {2,9,3,0};

        add(5,6);
        subtract(5,9);
        multiply(3,4);
        divide(4,3);
        maxV(u);
    }
        public static void add(int a, int b) {
            System.out.println(a + b);
        }

        public static void subtract(int a, int b) {
            System.out.println(a - b);
        }
        public static void multiply(int a , int b) {
            System.out.println(a * b);
        }
        public static void divide(double a, double b) {
            System.out.println(a / b);
        }

        public static void maxV(int[] v) {
        int max = v[0];
        for (int i = 1; i < v.length; i++)
            if (max < v[i])
                max = v[i];
            System.out.println(max);
            int sum = IntStream.of(v).sum();
            System.out.println(sum);
        }

    }

