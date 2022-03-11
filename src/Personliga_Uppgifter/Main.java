package Personliga_Uppgifter;

import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        //throws Exception betyder att ett eventuellt errormeddelande kan läsas
        System.out.println("Personliga Uppgifter");
        System.out.println();

    //Inmatiningsverktyg
        Scanner in = new Scanner(System.in);

    //Mata in personliga uppgifter
        System.out.print("Födelseår: ");
        int år = in.nextInt();
        //in.nextLine()//; //in.nextLine() ger möjligheten att skriva in namn innan programmet slutar
        System.out.print("Ditt förnamn och efternamn: ");
        String namn = in.nextLine();
        System.out.println();

    //Spara uppgifter i en fil
        java.io.PrintWriter fout =
                new java.io.PrintWriter("persUpp.txt");
        fout.println(namn + ": " + år);
        fout.flush();

    //Ett meddelande
        System.out.println("Öppna filen persUpp.txt");
    }
}
