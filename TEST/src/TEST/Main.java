package TEST;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        /*int[] a = {2, 6, 3, 87, 5};
        int[][] u = {
                {5, 2, 7, 4, 7},
                {2, 4, 7, 6, 2},
                {7, 0, 3, 4, 5,},
                {3, 5, 8, 2, 5}
        };
        vCalc(u);
        vMax(a);
    }

    public static void vCalc(int[][] v) {

        System.out.println("Matris:");
        for (int i = 0; i < v.length; i++) {
            int sum = 0;
            for (int j = 0; j < v[i].length; j++) {
                System.out.print(v[i][j]);
                sum = sum + v[i][j];
            }
            System.out.println("summan av rad " + i + " är: " + sum + "\n");
        }
    }

    public static void vMax(int[] v) {

        System.out.println("Största elementet i vektorn " + Arrays.toString(v) + ":");

        int vMax = v[0];

        for (int i = 0; i < v.length; i++)
            if (vMax < v[i])
                vMax = v[i];
            System.out.println(vMax);
            int sum = IntStream.of(v).sum();
            System.out.println("Summan är " + sum);*/

        Scanner in = new Scanner (System.in);
        String S = new String (in.next());
        String s1 = S;
        System.out.println("Du skrev: " + s1);

        char[] v = {'a' , 'b' , 'c' , 'd' , 'e'};
        String c = new String(v , 0 , 3);
        System.out.println(c);
        String m = "Milad";
        System.out.println(m.length());

        StringBuilder sb = new StringBuilder("abcde");

        char o = sb.charAt(3);
        System.out.println(o);
        Integer q = new Integer(33);
        int d = 23;
        System.out.println(Integer.highestOneBit(q));



    }
}