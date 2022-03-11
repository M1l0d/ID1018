package OU1;

import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        System.out.println("TEMPERATURER\n");

        //Inmatningsverktyg
        Scanner in = new Scanner (System.in);
        in.useLocale(Locale.US);

        //Mata in uppgifter om antal veckor och antal mätningar
        System.out.print("Antalet veckor: ");
        int antalVeckor = in.nextInt();
        System.out.print("Antalet mätningar per vecka: ");
        int antalMatningarPerVecka = in.nextInt();

        //Plats att lagra temperaturer
        double[][] t = new double[antalVeckor + 1][antalMatningarPerVecka + 1];

        //Mata in temperaturerna
        for (int vecka = 1 ; vecka <= antalVeckor ; vecka++)
        {
            System.out.println("Temperaturer - vecka " + vecka + ":");
            for (int matning = 1 ; matning <= antalMatningarPerVecka ; matning++)
                t[vecka][matning] = in.nextDouble();
        }
        System.out.println();

        //Visa temperaturerna
        System.out.println("Temperaturerna:");
        for (int vecka = 1 ; vecka <= antalVeckor ; vecka++)
        {
            for (int matning = 1 ; matning <= antalMatningarPerVecka ; matning++)
                System.out.print(t[vecka][matning] + " ");
            System.out.println();
        }
        System.out.println();

        //Den minsta, den största och medeltemperaturen - veckovis

        //Maximala temperaturen/vecka
        for (int i = 1 ; i < t.length ; i++) {
            double maxT = t[i][1];
            for (int j = 1 ; j < t[i].length ; j++) {
                if (maxT < t[i][j]) {
                    maxT = t[i][j];
                }
            }
            System.out.println("Maximala temperaturen vecka " + i + " är " + maxT);
        }

        line();

        //Minimala temperaturen/vecka
        for (int i = 1 ; i < t.length ; i++) {
            double minT = t[i][1];
            for (int j = 1 ; j < t[i].length ; j++) {
                if (minT > t[i][j]) {
                    minT = t[i][j];
                }
            }
            System.out.println("Minimala temperaturen vecka " + i + " är " + minT);
        }

        line();

        //Medeltemperaturen/vecka
        for (int i = 1 ; i < t.length ; i++) {
            double medT = 0;
            double sum = 0;
            for (int j = 1 ; j < t[i].length ; j++) {
                sum = sum + t[i][j];
                medT = (sum/(t.length-1));
            }
            System.out.println("Medeltemperaturen vecka " + i + " är " + medT);
        }

        line();

        //Den minsta, den största och medeltemperaturen - hela mätperioden

        //Totalt maximala temperaturen
        double maxTemp = t[1][1];
        for (int i = 1 ; i < t.length ; i++) {
            for (int j = 1 ; j < t[i].length ; j++)
            if (maxTemp < t[i][j]) {
                maxTemp = t[i][j];
            }
        }
        System.out.println("Den högsta registrerade temperaturen under alla veckor är " + maxTemp);

        line();

        //Totalt minimala temperaturen
        double minTemp = t[1][1];
        for (int i = 1 ; i < t.length ; i++) {
            for (int j = 1 ; j < t[i].length ; j++)
            if (minTemp > t[i][j]) {
                minTemp = t[i][j];
            }
        }
        System.out.println("Den minsta registrerade temperaturen under alla veckor är " + minTemp);

        line();

        //Totala medeltemperaturen
        double sumTemp = 0;
        for (int i = 1 ; i < t.length ; i++) {
            for (int j = 1 ; j < t[i].length ; j++) {
                sumTemp = sumTemp + t[i][j];
            }
        }
        System.out.println("Medeltemperaturen under alla veckor är " + sumTemp/(antalVeckor * antalMatningarPerVecka));

        line();
    }
    public static void line() {
        System.out.println("--------------------------------------------------------------------");
    }
}
