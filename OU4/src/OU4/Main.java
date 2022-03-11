package OU4;

import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("OPERATIONER MED NATURLIGA HELTAL GIVNA SOM TECKENSTRÄNGAR\n");

        // Mata in två naturliga heltal
        Scanner in = new Scanner(System.in);
        System.out.println("Två naturliga heltal som ska adderas: ");
        String tal1 = in.next();
        String tal2 = in.next();
        System.out.println();

        // Addera heltalen och visa resultatet
        String summa = addera (tal1, tal2);
        visa (tal1, tal2, summa, '+');

        System.out.println("Två naturliga heltal som ska subtraheras där det andra talet inte ska vara större än det " +
                "första: ");
        tal1 = in.next();
        tal2 = in.next();
        System.out.println();

        // Subtrahera heltalen och visa resultatet
        String differens = subtrahera (tal1, tal2);
        visa (tal1, tal2, differens, '-');
    }
    public static String addera(String tal1, String tal2) {

        StringBuffer tal = new StringBuffer();
        int siffra1 , siffra2 , siffraR , summa , carry = 0;
        int plats1 = tal1.length() - 1;
        int plats2 = tal2.length() - 1;

        while (plats1 >= 0 && plats2 >= 0) {

            siffra1 = tal1.charAt(plats1) - 48;
            siffra2 = tal2.charAt(plats2) - 48;
            summa = siffra1 + siffra2 + carry;

            siffraR = summa % 10;
            tal.insert(0, siffraR);
            carry = summa / 10;


            plats1--;
            plats2--;

        }

        while (plats1 >= 0) {

            siffra1 = tal1.charAt(plats1) - 48;
            summa = siffra1 + carry;

            siffraR = summa % 10;
            tal.insert(0, siffraR);
            carry = summa / 10;

            plats1--;

        }

        while (plats2 >= 0) {

            siffra2 = tal2.charAt(plats2) - 48;
            summa = siffra2 + carry;

            siffraR = summa % 10;
            tal.insert(0, siffraR);
            carry = summa / 10;

            plats2--;

        }
        if (carry > 0)
            tal.insert(0,carry);

        
    return tal.toString();
    }
    public static String subtrahera(String tal1, String tal2) {

        StringBuffer tal = new StringBuffer();
        int siffra1, siffra2, siffraR = 0;
        int plats1 = tal1.length() - 1;
        int plats2 = tal2.length() - 1;
        int borrow = 0;

        while (plats1 >= 0 && plats2 >= 0) {

            siffra1 = (tal1.charAt(plats1) - 48);
            siffra2 = tal2.charAt(plats2) - 48;

            if (siffra1 == 0 && borrow == 1) {
                siffra1 = 9;
                siffraR = siffra1 - siffra2;
            }
            else if (siffra1 < siffra2) {
                siffra1 = siffra1 + 10;
                siffraR = siffra1 - siffra2;
                borrow = 1;
            }
            else if (siffra1 == 0 && siffra1 < siffra2) {
                siffra1 = 10;
                siffraR = siffra1 - siffra2;
                borrow = 1;
            }

            else if (borrow == 1 && siffra1 != 0) {
                siffraR = siffra1 - (siffra2 + borrow);
            }

            else if (siffra1 >= siffra2) {

                siffraR = siffra1 - siffra2;
                borrow = 0;
            }

            tal.insert(0,siffraR);
            plats1--;
            plats2--;
        }

        while (plats1 >= 0) {

            siffra1 = (tal1.charAt(plats1) - 48);
            siffraR = siffra1 - borrow;


            if (siffra1 == 0 && borrow == 1) {
                siffraR = 9;
            }

            else if (borrow == 1) {
                siffraR = siffra1 - borrow;
                borrow = 0;
            }

            else if (borrow == 0) {
                siffraR = siffra1;
            }

            tal.insert(0,siffraR);
            plats1--;
        }

        while (tal.charAt(0) == '0' && tal.length() > 1)
            tal.deleteCharAt(0);

        return tal.toString();

    }
    public static void visa(String tal1, String tal2, String resultat, char operator) {

        // Sätt en lämplig längd på heltalen och resultatet
        int len1 = tal1.length();
        int len2 = tal2.length();
        int lenR = resultat.length();
        int maxLen = Math.max(Math.max(len1, len2), lenR);
        tal1 = sattLen(tal1, maxLen - len1);
        tal2 = sattLen(tal2, maxLen - len2);
        resultat = sattLen(resultat, maxLen - lenR);

        // Visa heltalen och resultatet
        System.out.println("  " + tal1);
        System.out.println("" + operator + " " + tal2);

        for (int i = 0; i < maxLen + 2; i++)
            System.out.print("-");

        System.out.println();
        System.out.println("  " + resultat + "\n");
    }

    // sattLen lägger till ett angivet antal mellanslag i början av en given sträng
    public static String sattLen(String s, int antal) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < antal; i++)
            sb.insert(0, " ");

        return sb.toString();
    }

    int[] v = {2,5,3,6,7};

    public static void Sort(int [] v){
    int i = 1;
    while (i < v.length)
    {
        int j = i + 1;
        int t = 0;

        while (j <= v.length)
        {
            if (v[j] < v[i])
                t = v[i];
                v[i] = v[j];
                v[j] = t;

            j++;
        }
        i++;
    }
}
}
