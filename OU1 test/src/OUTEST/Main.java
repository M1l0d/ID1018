package OUTEST;

import java.util.Locale;
import java.util.Scanner;

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
        double[] minT = new double[t.length];
        double[] maxT = new double[t.length];
        double[] sumT = new double[t.length];

        //Maximala temperaturen/vecka
        for (int i = 1 ; i < t.length ; i++) {
            maxT[i] = t[i][1];
            for (int j = 1 ; j < t[i].length ; j++) {
                if (t[i][j] > maxT[i]) {
                    maxT[i] = t[i][j];
                }
            }
            System.out.println("Maximala temperaturen vecka " + i + " är " + maxT[i]);
        }

        System.out.println("------------------------------------------------");

        //Minimala temperaturen/vecka
        for (int i = 1 ; i < t.length ; i++) {
            minT[i] = t[i][1];
            for (int j = 1 ; j < t[i].length ; j++) {
                if (t[i][j] < minT[i]) {
                    minT[i] = t[i][j];
                }
            }
            System.out.println("Minimala temperaturen vecka " + i + " är " + minT[i]);
        }

        System.out.println("------------------------------------------------");

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

        System.out.println("------------------------------------------------");

        //Den minsta, den största och medeltemperaturen - hela mätperioden
        double minTemp = minT[1];
        double maxTemp = maxT[1];
        double sumTemp = 0;
        //Totalt maximala temperaturen

        for (int i = 1 ; i < t.length ; i++) {
            if (maxTemp < maxT[i]) {
                maxTemp = maxT[i];
            }
        }
        System.out.println("Den högsta registrerade temperaturen under alla veckor är " + maxTemp);

        System.out.println("------------------------------------------------");

        //Totalt minimala temperaturen
        for (int i = 1 ; i < t.length ; i++) {
            if (minTemp > minT[i]) {
                minTemp = minT[i];
            }
        }
        System.out.println("Den minsta registrerade temperaturen under alla veckor är " + minTemp);

        System.out.println("------------------------------------------------");

        //Totala medeltemperaturen
        for (int i = 1 ; i < t.length ; i++) {
            for (int j = 1 ; j < t[i].length ; j++) {
                sumTemp = sumTemp + t[i][j];
            }

        }
        System.out.println("Medeltemperaturen under alla veckor är " + sumTemp/(t.length-1));

    }
}

