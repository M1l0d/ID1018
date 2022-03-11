package OU2;

public class Bestam {
    public static void main(String[] args) {
        double sidaA = 4;
        double sidaB = 2;
        double sidaC = 3;
        double vinkelA = 1.82348;
        double vinkelB = 0.50536;
        double vinkelC = 0.81276;

        System.out.println("Triangelns omkrets är: " + Triangel.omkrets(sidaA,sidaB,sidaC));

        line();

        System.out.println("Triangelns area är: " + Triangel.area(sidaA, sidaB, sidaC));

        line();

        System.out.println("Traingelns bisektris mellan sidaA och sidaB är: " + Triangel.bisektris(sidaA, sidaB, vinkelA));

        line();

        System.out.println("Traingelns bisektris mellan sidaA och sidaC är: " + Triangel.bisektris(sidaA, sidaC, vinkelB));

        line();

        System.out.println("Traingelns bisektris mellan sidaB och sidaC är: " + Triangel.bisektris(sidaB, sidaC, vinkelC));

        line();

        System.out.println("Triangelns median A är: " + Triangel.median(sidaB, sidaC, sidaA));

        line();

        System.out.println("Triangelns median B är: " + Triangel.median(sidaA, sidaC, sidaB));

        line();

        System.out.println("Triangelns median C är: " + Triangel.median(sidaA, sidaB, sidaC));

        line();

        System.out.println("Den omskrivna cirkelns radie är: " + Triangel.radieOmskriven(sidaA, sidaB, sidaC));

        line();

        System.out.println("Den inskrivna cirkelns radie är: " + Triangel.radieInskriven(sidaA, sidaB, sidaC));

    }
    public static void line() {
        System.out.println("-------------------------------------------------------------------");
    }
}
