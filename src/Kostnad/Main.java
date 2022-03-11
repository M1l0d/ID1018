package Kostnad;

import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	System.out.println("KOSTNAD");
	System.out.println();

	//Inmatningsverktyg
        Scanner in = new Scanner (System.in);
        in.useLocale(Locale.US);

    //Mata inuppgifter om antalet böcker och deras pris
        System.out.print("Antalet Böcker: ");
        int antal = in.nextInt();
        System.out.print("Pris på böckerna: ");
        double pris = in.nextDouble();

    //Beräkna den totala kostnaden
        double kostnad = antal * pris;

    //Visa resultatet
        System.out.println("Den totala kostnaden: " + kostnad);


    }
}
